package com.mycompany.aula03;
public class Caneta {
    public String modelo;
    public String cor;
    public String S_tampada;
    private float ponta;
    protected int carga;
    private boolean tampada;

   
   public void status(){
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
    public void rabiscar(){
        if (this.tampada == true){
        System.out.println("Rabiscar com a tampa?");    
        }else{
        System.out.println("Estou rabiscando");
        }
    }
    protected void tampar(){
    this.tampada = true;    
    }
    protected void destampar(){
    this.tampada = false;    
    }
    
            
}
