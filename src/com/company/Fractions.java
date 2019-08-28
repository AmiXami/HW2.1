package com.company;

final public class Fractions extends Espada{
    private String captains;

    public String getCaptains() {
        return captains;
    }
    public void sero(){
        System.out.println("Sero");
    }
    protected void grandSero(){
        System.out.println("Grand Sero");
    }

    public Fractions(String name, int reiatsu, String power,String captains,int rang, Resurrection resurrection) {
        super(name, reiatsu, rang, power, resurrection);

        this.captains = captains;

    }

    public String getInfo(){
        return super.getInfo()+" "+getName()+" "+getReiatsu()+" "+ getCaptains()+" "+getRang()+" "+getCaptains() +getResurrection();
    }
}
