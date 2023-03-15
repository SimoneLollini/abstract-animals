package org.animals.java;

public class Delfino extends Animale implements INuotante{
    @Override
    public void verso() {
        System.out.println("verso Delfino.");
    }

    @Override
    public void mangia() {
        System.out.println("cibo Delfino.");
    }

    @Override
    public void nuota() {
        System.out.println("Delfino sta nuotando");
    }
}
