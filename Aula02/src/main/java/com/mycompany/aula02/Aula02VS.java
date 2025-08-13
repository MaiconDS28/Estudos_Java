package com.mycompany.aula02;
public class Aula02 {
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.tampar();
       c1.status();
       c1.rabiscar();
        
       Caneta c2 = new Caneta();
       c2.cor = "Vermelha";
       c2.ponta = 0.7f;
       c2.destampar();
       c2.status();
       c2.rabiscar();

       Lapiseira l1 = new Lapiseira();
            l1.modelo_L = "Faber Castell";
            l1.grafite_tamanho_L = "0.7mm";
            l1.carga_L = 100;
            l1.status_L();
            

        Lapiseira l2 = new Lapiseira();
            l2.modelo_L = "Pentel";
            l2.grafite_tamanho_L = "0.5mm";
            l2.carga_L = 80;
            l2.status_L();
            
    }
}
