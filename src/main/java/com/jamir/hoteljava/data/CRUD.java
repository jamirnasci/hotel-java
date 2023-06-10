package com.jamir.hoteljava.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamir.hoteljava.model.Quarto;
import com.jamir.hoteljava.model.QuartoOcupado;
import com.jamir.hoteljava.model.ReservaCliente;

@Service
public class CRUD implements DAO {
	
	@Autowired
	private Connection conn;

	@Override
	public void novaReserva(ReservaCliente rc) {

	}

	@Override
	public ArrayList<Quarto> quartosDisponiveis() {
		
		ArrayList<Quarto> quartos = new ArrayList<Quarto>();
		
		String sql = """
			SELECT 
			    QT.NOME, 
			    COUNT(QT.NOME) AS TOTAL, 
			    QT.PRECO,
			    QT.DESCRICAO 
			FROM hoteljava.QUARTO_QUANTIDADE QQ 
			INNER JOIN hoteljava.QUARTO_TIPO QT 
			ON QT.IDQUARTO_TIPO = QQ.QUARTO_TIPO_IDQUARTO_TIPO
			WHERE QQ.NUMERO NOT IN (
			    SELECT 
			        QQ.NUMERO 
			    FROM hoteljava.QUARTO_QUANTIDADE QQ 
			    INNER JOIN hoteljava.RESERVA_CLIENTE RC 
			    ON RC.QUARTO_QUANTIDADE_IDQUARTO_QUANTIDADE = QQ.IDQUARTO_QUANTIDADE
			)
			GROUP BY QT.NOME, QT.PRECO, QT.DESCRICAO;
		""";
		
		  try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet res = stmt.executeQuery();
			
			while(res.next()) {
				
				String nome = res.getString("nome");
				String total = res.getString("total");
				String preco = res.getString("preco");
				String descricao = res.getString("descricao");
				
				Quarto q = new Quarto(nome, total, descricao, preco);
				quartos.add(q);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
		return quartos;
	}

	@Override
	public ArrayList<QuartoOcupado> quartosReservados() {
		
		String sql ="""
				SELECT 
					c.nome AS nome_cliente, 
					rc.checkindate, 
					rc.checkoutdate,
				    qt.nome AS quarto_nome,
				    qq.numero
				FROM reserva_cliente rc 
					INNER JOIN cliente c ON c.idcliente = rc.cliente_idcliente
					INNER JOIN quarto_quantidade qq ON qq.idquarto_quantidade = rc.quarto_quantidade_idquarto_quantidade
					INNER JOIN quarto_tipo qt ON qt.idquarto_tipo = qq.quarto_tipo_idquarto_tipo;

				""";
		
		ArrayList<QuartoOcupado> quartosOcupados = new ArrayList<QuartoOcupado>();
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet res = stmt.executeQuery();
			
			while(res.next()) {
				String clienteNome = res.getString("nome_cliente");
				String quartoNome = res.getString("quarto_nome");
				String checkin = res.getString("checkindate");
				String checkout = res.getString("checkoutdate");
				String numero = res.getString("numero");
				
				QuartoOcupado qo = new QuartoOcupado(clienteNome, quartoNome, checkin, checkout, numero);
				quartosOcupados.add(qo);
			}
			return quartosOcupados;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
