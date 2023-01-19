package com.serviciodesayuno.threads;

import com.serviciodesayuno.resources.Mesa;

public class Comensal implements Runnable {

    private String nombre;
    private Mesa mesa;
    private final int tiempoConsumo = 10000;

    public Comensal(String nombre, Mesa mesa) {
        this.nombre = nombre;
        this.mesa = mesa;
    }

    @Override
    public void run() {
        try {
            while (mesa.getNumeroMagdalenas() > 0) {
                mesa.cogerMagdalena();
                System.out.println(nombre + " ha cogido una magdalena de la mesa");
                Thread.sleep(tiempoConsumo);
                System.out.println(nombre + " se ha terminado de comer una magdalena");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
