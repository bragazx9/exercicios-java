package ProgramaNotas;

import java.util.Scanner;

class Student {
    private String name;
    private double nota1, nota2, nota3;

    public void setNome(String name) {
        this.name = name;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean isApproved() {
        return notaFinal() >= 60.0;
    }

    public double PontosRestantes() {
        return isApproved() ? 0.0 : 60.0 - notaFinal();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Nota final = %.2f\n", notaFinal()));
        if (isApproved()) {
            result.append("Passou!\n");
        } else {
            result.append("Reprovado!\n");
            result.append(String.format("Faltaram %.2f Pontos\n", PontosRestantes()));
        }
        return result.toString();
    }
}