package org.example;

public class Hospital {
    private int numBoxes;
    private int numEspecialistas;
    private int numTecnicos;
    private int capacidadSalaEspera;

    public Hospital(int numBoxes, int numEspecialistas, int numTecnicos) {
        this.numBoxes = numBoxes;
        this.numEspecialistas = numEspecialistas;
        this.numTecnicos = numTecnicos;
        this.capacidadSalaEspera = 5 * numBoxes;
    }

    public void iniciarSimulacion() {

    }

    public void agregarPaciente(Paciente paciente) {

    }

    public void asignarEspecialistas() {

    }

    public void actualizarEstadoPacientes() {

    }

    public void finalizarSimulacion() {

    }
}
