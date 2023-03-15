package org.animals.java;

public class Aquila extends Animale implements IVolante{
    @Override
    public void verso() {
        System.out.println("verso Aquila.");

    }

    @Override
    public void mangia() {
        System.out.println("cibo Aquila.");
    }

    @Override
    public void vola() {
        System.out.println("aquila sta volando");
    }
}
