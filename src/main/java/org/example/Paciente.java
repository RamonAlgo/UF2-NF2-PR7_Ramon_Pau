package org.example;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private int id;
    private int gravedad;
    private List<String> necesidades;
    private int tiempoEspera;
    private int tiempoAtencion;

    public Paciente(int id, int gravedad) {
        this.id = id;
        this.gravedad = gravedad;
        this.necesidades = new ArrayList<>();
        this.tiempoEspera = 0;
        this.tiempoAtencion = 0;
    }

    public int getId() {
        return id;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    public List<String> getNecesidades() {
        return necesidades;
    }

    public void añadirNecesidad(String especialidad) {
        this.necesidades.add(especialidad);
    }

    public void eliminarNecesidad(String especialidad) {
        this.necesidades.remove(especialidad);
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void actualizarTiempoEspera(int tiempo) {
        this.tiempoEspera += tiempo;
    }

    public int getTiempoAtencion() {
        return tiempoAtencion;
    }

    public void actualizarTiempoAtencion(int tiempo) {
        this.tiempoAtencion += tiempo;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", gravedad=" + gravedad +
                ", necesidades=" + necesidades +
                ", tiempoEspera=" + tiempoEspera +
                ", tiempoAtencion=" + tiempoAtencion +
                '}';
    }
}
