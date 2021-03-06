package com.example;

/**
 * Created by josemaria.barrero on 19/04/2016.
 */
public class GeoPunto {
    private double latitud, longitud;

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public GeoPunto(double latitud,double longitud){
        this.latitud=latitud;
        this.longitud=longitud;
    }

    public String toString(){
        return "Latitud: " + this.latitud + " - Longitud: " + this.longitud;
    }

    public double distancia (GeoPunto punto){
        final double RADIO_TIERRA = 6371000; // en metros
        double dLat = Math.toRadians(latitud - punto.latitud);
        double dLon = Math.toRadians(longitud - punto.longitud);
        double lat1 = Math.toRadians(punto.latitud);
        double lat2 = Math.toRadians(latitud);
        double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.sin(dLon/2) * Math.sin(dLon/2) *
                        Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return c * RADIO_TIERRA;
    }


}