package com.company;

public class Espada extends Arrancars{
    public int rang;
    private String power;
    private Resurrection resurrection;

    public Resurrection getResurrection() {
        return resurrection;
    }

    public int getRang() {
        return rang;
    }

    public String getPower() {
        return power;
    }

    public Espada(String name, int reiatsu, int rang, String power ,Resurrection resurrection) {
        super(name, reiatsu);
        this.rang = rang;
        this.power = power;

    }
    public void usePower(){
        System.out.println("Sonido");
    }
    public void usePower(String spiritual ){
        System.out.println(spiritual);
    }


    public final void usePower(String spiritual,int count){
        for (int i = 0; i <count ; i++) {
            System.out.println(spiritual);
        }
    }
    public String getInfo(){
        return super.getInfo()+" "+getName()+" "+getPower()+" "+getReiatsu()+" "+ getRang() + resurrection;
    }


}
