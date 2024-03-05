package org.example;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private int numPacientes;
    private List<Paciente> pacientes;
    private boolean[] especialistasDisponibles;
    private boolean[] tecnicosDisponibles;

    public Box() {
        this.numPacientes = 0;
        this.pacientes = new ArrayList<>();
        this.especialistasDisponibles = new boolean[3]; // 3 tipos de especialistas: cirugía, traumatología, diagnóstico
        this.tecnicosDisponibles = new boolean[3]; // 3 técnicos sanitarios
    }

    public void agregarPaciente(Paciente paciente) {

    }

    public void atenderPaciente(Paciente paciente) {

    }

    public void liberarBox() {

    }
}
