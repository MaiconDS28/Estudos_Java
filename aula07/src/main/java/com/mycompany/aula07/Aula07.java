package com.mycompany.aula07;

public class Aula07 {

    public static void main(String[] args) {
//String no, String na, int id, float al, float pe, int vi, int de, int em
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Puts", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Snap", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        l[3] = new Lutador("Dead", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
        l[4] = new Lutador("UFO", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[5] = new Lutador("Nerd", "Eua", 30, 1.81f, 105.7f, 12, 2, 4);
        

        l[0].apresentar();
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        l[1].apresentar();
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        l[2].apresentar();
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        l[3].apresentar();
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        l[4].apresentar();
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        l[5].apresentar();
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("");
        

    }
}
