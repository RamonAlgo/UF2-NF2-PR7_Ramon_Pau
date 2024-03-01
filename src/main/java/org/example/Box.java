package org.example;

public class Box {
    private int id;
    private boolean ocupado;
    private Paciente paciente;

    public Box(int id) {
        this.id = id;
        this.ocupado = false;
        this.paciente = null;
    }

    public int getId() {
        return id;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", ocupado=" + ocupado +
                ", paciente=" + paciente +
                '}';
    }
}
