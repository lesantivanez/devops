package com.tresct.demospringboot;

public class Computadora {

    public String marca;
    public int ram;
    public int disco;

    public Computadora(String marca, int ram, int disco) {
        this.marca = marca;
        this.ram = ram;
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", ram=" + ram +
                ", disco=" + disco +
                '}';
    }
}
