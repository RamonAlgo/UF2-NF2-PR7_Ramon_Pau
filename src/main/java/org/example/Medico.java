package org.example;

public class Medico {
    private int id;
    private String especialidad;
    private boolean disponible;

    public Medico(int id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + id +
                ", especialidad='" + especialidad + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
