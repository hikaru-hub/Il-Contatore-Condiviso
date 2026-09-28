package com.example;

public class Lavoratore implements Runnable {
    private Contatore c;
    private String nome;

    Lavoratore(Contatore c, String nome) {
        this.c = c;
        this.nome = nome;
    }

    @Override
    public void run() {
        while(c.incrementa(this.nome)) {
            c.incrementa(this.nome);

            try {
                Thread.sleep((int)(Math.random() * (500-100)) + 100);
            } catch (Exception e) {
                System.out.println("errore");
            }
        }
    }
}
