package org.example.parteDois;

public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double imposto;



    public double calcularSalario(){
        return salarioBase - (salarioBase * imposto);
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        if(imposto >= 0.0 && imposto <= 1.0){
            this.imposto = imposto;
        }
        throw new RuntimeException("Imposto deve ser entre 0 e 1");
    }
}
