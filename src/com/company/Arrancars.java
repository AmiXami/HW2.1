package com.company;

public class Arrancars {
    private String name;
    private int reiatsu;

    public String getName() {
        return name;
    }

    public int getReiatsu() {
        return reiatsu;
    }

    public Arrancars(String name, int reiatsu) {
        this.name = name;
        this.reiatsu= reiatsu;
    }

    public String getInfo() {
        return name + " " + reiatsu;
    }

}
