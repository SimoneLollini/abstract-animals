package org.animals.java;

public class Cane extends Animale implements INuotante{
    @Override
    public void verso() {
        System.out.println("verso Cane.");
    }

    @Override
    public void mangia() {
        System.out.println("cibo Cane.");
    }

    @Override
    public void nuota() {
        System.out.println("Cane sta nuotando");
    }
}
