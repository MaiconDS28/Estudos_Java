package com.mycompany.aula03;
public class Lapiseira {
    String modelo_L;
    String grafite_tamanho_L;
    int carga_L;
    


    void status_L() {
        System.out.println(" ");
        System.out.println("A lapiseira é do modelo " + this.modelo_L);
        System.out.println("Com grafite de tamanho " + this.grafite_tamanho_L);
        System.out.println("A carga da lapiseira está com " + this.carga_L + "%");
        System.out.println("Está com carga? " + (this.carga_L > 0 ? "Sim" : "Não"));
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------");
         }
}