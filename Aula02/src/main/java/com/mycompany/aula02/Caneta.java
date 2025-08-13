package com.mycompany.aula02;
public class Caneta {
    String modelo;
    String cor;
    String S_tampada;
    float ponta;
    int carga;
    boolean tampada;

   
    void status(){
        System.out.println(" ");
        this.modelo = "Bic";
        this.carga = 70;
        System.out.println("A caneta " + this.cor);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Com a ponta tamanho " + this.ponta);
        System.out.print("A carga da caneta esta com " + this.carga + "%");
        System.out.println(" ");
    if (this.tampada == true){
    this.S_tampada = "Sim";
    }
    else{
    this.S_tampada = "Nao";
    }
        
        System.out.println("Esta tampada? " + this.S_tampada);        
    }
    void rabiscar(){
        if (this.tampada == true){
        System.out.println("Rabiscar com a tampa?");    
        }else{
        System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
    this.tampada = true;    
    }
    void destampar(){
    this.tampada = false;    
    }
    
            
}
