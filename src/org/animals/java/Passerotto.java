package org.animals.java;

public class Passerotto extends Animale implements IVolante{
    @Override
    public void verso() {
        System.out.println("verso Passerotto.");
    }

    @Override
    public void mangia() {
        System.out.println("cibo Passerotto.");
    }

    @Override
    public void vola() {
        System.out.println("Passerotto sta volando");
    }
}
