package com.serviciodesayuno.resources;

public class Mesa {
    private int numeroMagdalenas;

    public Mesa(int numeroMagdalenas) {
        this.numeroMagdalenas = numeroMagdalenas;
    }

    public int getNumeroMagdalenas() {
        return numeroMagdalenas;
    }

    public synchronized void cogerMagdalena() {
            numeroMagdalenas -= 1;
    }
}
