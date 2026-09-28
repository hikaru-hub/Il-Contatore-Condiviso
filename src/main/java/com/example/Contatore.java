package com.example;

public class Contatore {
    private int valore = 0;
    private int valoreMassimo = 10;

        Contatore() {
        }

        public synchronized boolean incrementa (String nomeThread) {
                if(this.valore < this.valoreMassimo) {
                    this.valore++;
                    System.out.println(nomeThread + " ha incrementato il valore del contatore a: " + this.valore);
                    return true;
                }else{
                    return false;
                }
        }
}
