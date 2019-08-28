package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
    Espada e1 = new Espada("Ulquiorra",3000,4, "Sero",Resurrection.MURCIELAGO);
        System.out.println(e1.getInfo());


    Fractions a1 = new Fractions("Grimmjow",2600,"flash","Nnuhtora",6,Resurrection.PANTERA);
    a1.sero();
        System.out.println(a1.getInfo());


    Fractions a2 = new Fractions("Halibel",2800,"Tsunami","Barragan",3,Resurrection.TIBURON);
    a2.grandSero();
        System.out.println(a2.getInfo());
    }
}
