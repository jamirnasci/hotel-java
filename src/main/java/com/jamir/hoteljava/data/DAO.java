package com.jamir.hoteljava.data;

import java.util.ArrayList;

import com.jamir.hoteljava.model.Quarto;
import com.jamir.hoteljava.model.QuartoOcupado;
import com.jamir.hoteljava.model.ReservaCliente;

public interface DAO {
	public void novaReserva(ReservaCliente rc);
	public ArrayList<Quarto> quartosDisponiveis();
	public ArrayList<QuartoOcupado> quartosReservados();
}
