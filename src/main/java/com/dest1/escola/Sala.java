package com.dest1.escola;

public class Sala {

    public String nomeSala;
    public String aulas;
    public int cadeiras;
    public int mesas;

    public Sala(String nomeSala, String aulas, int cadeiras, int mesas) {
        this.nomeSala = nomeSala;
        this.aulas = aulas;
        this.cadeiras = cadeiras;
        this.mesas = mesas;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public String getAulas() {
        return aulas;
    }

    public void setAulas(String aulas) {
        this.aulas = aulas;
    }

    public int getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(int cadeiras) {
        this.cadeiras = cadeiras;
    }

    public int getMesas() {
        return mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }
}
