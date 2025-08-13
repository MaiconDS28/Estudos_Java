package com.mycompany.aula05;
public class Aula05 {

    public static void main(String[] args) {
            ContaBanco p1 = new ContaBanco();
            p1.setNumconta(1111);
            p1.setNomecliente("Guanabinha");
            p1.abrirconta("CC");
            p1.depositar(100);
            p1.dados();
            
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println(" ");
        System.out.println(" ");    
       
            ContaBanco p2 = new ContaBanco();
            p2.setNumconta(2222);
            p2.setNomecliente("Guanabencia");
            p2.abrirconta("CP");
            p2.depositar(500);
            p2.dados();
            
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println(" ");
        System.out.println(" ");    
        
            ContaBanco p3 = new ContaBanco();
            p3.setNumconta(3333);
            p3.setNomecliente("Guaneba");
            p3.abrirconta("Cz");
            p3.depositar(10);
            p3.dados();
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
        System.out.println(" ");
        System.out.println(" ");           
    }
}