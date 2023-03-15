package org.animals.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Di quale animale vuoi vedere le specifiche? " +
                    "A-Aquila, C-Cane, D-Delfino, P-Passerotto oppure Q-esci");
            String option = scan.nextLine();

            switch (option.toUpperCase()) {
                case "A":
                    //aquila
                    Aquila aquila = new Aquila();
                    aquila.mangia();
                    aquila.verso();
                    aquila.dormi();

                    System.out.println("vola!");
                    faiVolare(aquila);

                    break;
                case "C":
                    //cane
                    Cane cane = new Cane();
                    cane.mangia();
                    cane.verso();
                    cane.dormi();

                    System.out.println("nuota!");
                    faiNuotare(cane);

                    break;
                case "D":
                    //delfino
                    Delfino delfino = new Delfino();
                    delfino.mangia();
                    delfino.verso();
                    delfino.dormi();

                    System.out.println("nuota!");
                    faiNuotare(delfino);

                    break;
                case "P":
                    //passerotto
                    Passerotto passerotto = new Passerotto();
                    passerotto.mangia();
                    passerotto.verso();
                    passerotto.dormi();

                    System.out.println("vola!");
                    faiVolare(passerotto);
                    break;
                case "Q":
                    //uscita dal programma
                    System.out.println("Fine...");
                    end = true;
                    break;
                default:
                    System.out.println("Opzione errata! Riprova...");
            }
        }
    }
    public static void faiVolare(IVolante animale){
        animale.vola();
    }
    public static void faiNuotare(INuotante animale){
        animale.nuota();
    }
}
