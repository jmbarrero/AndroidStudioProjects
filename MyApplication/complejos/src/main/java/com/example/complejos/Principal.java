package com.example.complejos;

/**
 * Created by josemaria.barrero on 15/04/2016.
 */


class Principal {
    public static void main(String[] main) {
        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);
        z.suma(w);
        System.out.println("-Complejo: " + z.toString());

        ComplejoAmpliado x, y;
        x = new ComplejoAmpliado(-1.5, 3.0);
        y = new ComplejoAmpliado(-1.2, 2.4);
        x.suma(y);
        System.out.println(">Complejo Ampliado: " + x.toString());

        Complejo lista[] = new Complejo[4];
        lista[0] = new Complejo(-1.5, 3.0);
        lista[1] = new Complejo(-1.2, -3.0);
        lista[2] = new ComplejoAmpliado(-1.5, 3.0);
        lista[3] = new ComplejoAmpliado(-1.2, 0);
        for (int i = 0; i < lista.length; i++) {
            System.out.println("*Complejo: " + lista[i]);
        }

        for(int i = 0; i < lista.length; i++) {
            System.out.println("#Complejo: " + lista[i]);
            if(lista[i] instanceof ComplejoAmpliado){
                System.out.println("#  esReal=" + ((ComplejoAmpliado) lista[i]).esReal());
            }
        }

    }


}