package com.mycompany.aula05;
public class ContaBanco {
//Atributos
    public int numconta;
    protected String tipoconta;
    private String nomecliente;
    private double saldoconta;       
    private boolean statusc;
    private String statusconta;
    
    
    //Construtor
    public ContaBanco() {
        this.setSaldoconta(0);
        this.setStatusc(false);
    }
    
    

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public double getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(double saldoconta) {
        this.saldoconta = saldoconta;
    }

    public boolean isStatusc() {
        return statusc;
    }

    public void setStatusc(boolean statusc) {
        this.statusc = statusc;
    }

    public String getStatusconta() {
        return statusconta;
    }

    public void setStatusconta(String statusconta) {
        this.statusconta = statusconta;
    }

    
    

      
    
    
//METODOS
    
    
    public void abrirconta(String t){
        System.out.println("----------------------------------------------------------------------");
       this.setTipoconta(t);
       
       if(this.getTipoconta() == "CC"){
           this.setStatusc(true);
           this.setSaldoconta(50);
           System.out.println("Conta Aberta " + this.getNomecliente());
       }else if(this.getTipoconta() == "CP"){
           this.setStatusc(true);
           this.setSaldoconta(150);
           System.out.println("Conta Aberta " + this.getNomecliente());
       }else{
           System.out.println("Digite somente CC ou CP " + this.getNomecliente());
       }
       System.out.println("----------------------------------------------------------------------");
    }
    
    public void fecharconta(){
        System.out.println("----------------------------------------------------------------------");
        if (this.getSaldoconta() > 0){
            System.out.println("Saque todos o dinheiro antes de fechar a conta " + this.getNomecliente());
        }else if(this.getSaldoconta() < 0){
            System.out.println("Pague suas dividas antes de fechar a conta " + this.getNomecliente());
        }else{
            this.setStatusc(false);
            this.setStatusconta("Fechada");
            System.out.println("OK, " + this.getNomecliente()+ " conta " + this.getTipoconta() + " " + this.getStatusconta());
        }
        
        System.out.println("----------------------------------------------------------------------");
    }
    public void depositar(double v){
        System.out.println("----------------------------------------------------------------------");
        if (this.isStatusc() == true){
            this.setSaldoconta(this.getSaldoconta() + v);
            System.out.println("deposito feito " + this.getNomecliente());
        }else{
            System.out.println("Abra uma conta primeiro " + this.getNomecliente());
        }
        
        System.out.println("----------------------------------------------------------------------");
    }
    public void sacar (double v){
        System.out.println("----------------------------------------------------------------------");
        if (this.isStatusc() == true){
            if (this.getSaldoconta() >= v){
                this.setSaldoconta(this.getSaldoconta() - v);
                System.out.println("saque realizado " + this.getNomecliente());
                
            }else{
                System.out.println("Querendo sacar sem dinheiro? " + this.getNomecliente());
            }
                
        }else{
            System.out.println("Nem tem conta aqui " + this.getNomecliente());
        }
        System.out.println("----------------------------------------------------------------------");
    }
    public void pagarmensal(){
        System.out.println("----------------------------------------------------------------------");
        double v;
            if (this.getTipoconta() == "CC"){
                v = 12;
            }else{
                v = 20;
            }
        
        if (this.isStatusc() == true){
            if(this.getSaldoconta() > v){
                this.setSaldoconta(this.getSaldoconta() - v);
                System.out.println("pago " + this.getNomecliente());
            }else{
                System.out.println("Saldo insuficiente " + this.getNomecliente());
            }
        }else{
            System.out.println("Abra uma conta antes " + this.getNomecliente());
        }
        System.out.println("----------------------------------------------------------------------");
    }
    
    public void dados(){
        if (statusc == false){
        this.setStatusconta("Fechada");
    }else{
        this.setStatusconta("Aberta");
        }
        System.out.println("-------------------------------------------------------");              
        System.out.println("Conta: " + this.getNumconta());
        System.out.println("Dono: " + this.getNomecliente());
        System.out.println("Saldo: " + this.getSaldoconta());
        System.out.println("Tipo: " + this.getTipoconta());
        System.out.println("Status: " + this.getStatusconta());
        System.out.println("-------------------------------------------------------");        
    }
    
}
