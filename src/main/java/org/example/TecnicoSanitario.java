package org.example;

public class TecnicoSanitario {
    private int id;
    private boolean disponible;

    public TecnicoSanitario(int id) {
        this.id = id;
        this.disponible = true;
    }

    public int getId() {
        return id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "TecnicoSanitario{" +
                "id=" + id +
                ", disponible=" + disponible +
                '}';
    }
}
