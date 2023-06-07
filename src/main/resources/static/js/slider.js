let description = document.getElementById('description');
let slider_img = document.getElementById('img-slider');



let quartos = [
    {
        src:"https://www.queroviajarmais.com/wp-content/uploads/2021/09/trade-hotel-825x569.png",
        description:"quarto 1"
    },
    {
        src:"https://viagemegastronomia.cnnbrasil.com.br/wp-content/uploads/sites/5/2022/10/BA_RA-HOTEL-4.jpg",
        description:"quarto 2"
    },{
        src:"https://www.portobay.com/remote.axd/pbaybucket.s3.amazonaws.com/media/2853027/lhpbsp_celebrationexperience_3_baixa.jpg?mode=crop&center=0.5,0.5&width=900&height=675",
        description:"quarto 3"
    },
    {
        src:"https://lirp.cdn-website.com/3cb1be78/dms3rep/multi/opt/f1f2200cfdf6e71bd592efe0cbfaa6fe-1920w.jpg",
        description:"quarto 4"
    }
];

let i = 0;
setInterval(function changeImg(){
    slider_img.setAttribute('src', quartos[i].src);
    description.innerHTML = quartos[i].description;
    if(i === (quartos.length) - 1){
        i = 0;
    }else{
        i++;
    }
}
, 3000);