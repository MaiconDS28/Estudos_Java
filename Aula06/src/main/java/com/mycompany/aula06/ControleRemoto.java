package com.mycompany.aula06;

public class ControleRemoto implements Controlador {

//ATRIBUTOS    
    private int volume;
    private boolean ligado;
    private boolean tocando;

//METODOS ESPECIAIS
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean isTocando(boolean to) {
        return tocando;
    }

    private void setTocando(boolean t) {
        this.tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligando? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando(true));
        System.out.print("Volume está em " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 5) {
            System.out.print("/");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 1);
        }

    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }

    }

    @Override
    public void DesligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(20);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando(true))) {
            this.isTocando(true);
            System.out.println("Está tocando");
        }

    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando(true)) {
            this.isTocando(false);
            System.out.println("Está em pausa");
        }

    }

}
