package com.example.gps_aula01;

public class Ponto {
    public Object getLongitude;
    private double latitude;
    private double longitude;
    private double altitude;

    Ponto() {
        this.latitude = 0.0;
        this.longitude = 0.0;
        this.altitude = 0.0;
    }

    Ponto(double latitude, double longitude) {
        this();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    Ponto(double latitude, double longitude, double altitude){
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public String imprimir() {
        String aux = "Lat:" + this.latitude + ", " +
                "long:" + this.longitude + ", " +
                "Alt:" + this.altitude;
        return aux;
    }

    public String imprimir2() {
        String aux ="************************\n"+
        "Latitude:" + this.latitude + "\n" +
        "longitude:" + this.longitude + "\n" +
         "Altitude:" + this.altitude + "\n" +
        "************************\n";
        return aux;

    }

    public String imprimirHtml(){
        String aux =
                "<html>"+
           "Latitude:" + this.latitude + "<br>"+
                "longitude:" + this.longitude + "<br>"+
              "Altitude:" + this.altitude + "<br>"+
                            "</html>";
        return aux;
    }

    public double getLatitude() {return this.latitude;}

    public void setLatitude(double.latitude) {this.latitude = latitude;}

    public double getLongitude() {return this.longitude; }

    public void setLongitude(double longitude) {this.longitude = longitude;}

    public double getAltitude() {return altitude;}

    public void setAltitude(double altitude) {this.altitude = altitude;}


    }