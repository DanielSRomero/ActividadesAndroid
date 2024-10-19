package com.example.actividad5;

public class ClaseA {
    private String atributo1;
    private int atributo2;
    private boolean atributo3;
    public ClaseA() {
    }
    public ClaseA(String atributo1, int atributo2, boolean atributo3) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    public boolean isAtributo3() {
        return atributo3;
    }

    public void setAtributo3(boolean atributo3) {
        this.atributo3 = atributo3;
    }

    @Override
    public String toString() {
        return "ClaseA{" +
                "atributo1='" + atributo1 +
                ", atributo2=" + atributo2 +
                ", atributo3=" + atributo3 +
                '}';
    }
}
