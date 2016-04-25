package org.example.mislugares;


/**
 * Created by josemaria.barrero on 19/04/2016.
 */
class Principal {
    public static void main(String[] main) {
        /*
        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3,TipoLugar.BAR);
        System.out.println("Lugar " + lugar.toString());

        GeoPunto lista[] = new GeoPunto[4];
        lista[0]=new GeoPunto(1,2);
        lista[1]=new GeoPunto(3,4);
        lista[2]=new GeoPuntoAlt(5,6,1001);
        lista[3]=new GeoPuntoAlt(7,8,999);

        for (int i=0;i<lista.length;i++){
            System.out.println("GeoPunto: " + lista[i]);
            if (lista[i] instanceof GeoPuntoAlt){
                if (((GeoPuntoAlt) lista[i]).getAltura()>1000) {
                    System.out.println("  ->Punto Elevado");
                }
            }
        }
        */

        Lugares lugares = new LugaresVector();
        for (int i=0; i<lugares.tamanyo(); i++) {
            System.out.println(lugares.elemento(i).toString());
        }

    }
}