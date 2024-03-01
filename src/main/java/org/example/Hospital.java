package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private int numeroBoxes;
    private List<Box> boxes;
    private List<Medico> medicos;
    private List<TecnicoSanitario> tecnicos;

    public Hospital(int numeroBoxes) {
        this.numeroBoxes = numeroBoxes;
        this.boxes = new ArrayList<>();
        for (int i = 1; i <= numeroBoxes; i++) {
            boxes.add(new Box(i));
        }
        this.medicos = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
    }

    public int getNumeroBoxes() {
        return numeroBoxes;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public List<TecnicoSanitario> getTecnicos() {
        return tecnicos;
    }

    public void añadirMedico(Medico medico) {
        medicos.add(medico);
    }

    public void añadirTecnico(TecnicoSanitario tecnico) {
        tecnicos.add(tecnico);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "numeroBoxes=" + numeroBoxes +
                ", boxes=" + boxes +
                ", medicos=" + medicos +
                ", tecnicos=" + tecnicos +
                '}';
    }
}
