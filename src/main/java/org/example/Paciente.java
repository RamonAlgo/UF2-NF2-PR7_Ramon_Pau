package org.example;

import java.util.List;

public class Paciente {
    private int gravedad;
    private List<String> necesidadesMedicas;
    private double tiempoAtencion;

    public Paciente(int gravedad, List<String> necesidadesMedicas, double tiempoAtencion) {
        this.gravedad = gravedad;
        this.necesidadesMedicas = necesidadesMedicas;
        this.tiempoAtencion = tiempoAtencion;
    }

    public int calcularPrioridad() {

        return 0;
    }

    public void actualizarEstado() {

    }
}
