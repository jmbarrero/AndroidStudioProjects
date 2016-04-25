package org.example.mislugares;

/**
 * Created by josemaria.barrero on 19/04/2016.
 */
public class GeoPuntoAlt extends GeoPunto {
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public GeoPuntoAlt (double longitud, double latitud, double altura){
        super(longitud,latitud);
        this.altura=altura;
    }

    @Override
    public String toString() {
        return "GeoPuntoAlt{" +
                "longitud=" + longitud +
                ", latitud=" + latitud +
                ", altura=" + altura +
                '}';
    }


}
