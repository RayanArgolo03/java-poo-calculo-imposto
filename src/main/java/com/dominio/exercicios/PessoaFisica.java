package com.dominio.exercicios;

public class PessoaFisica extends Contribuinte {

    private Double gastosComSaude;

    public PessoaFisica(Double gastosComSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public PessoaFisica() {
        super();
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public String toString() {
        return this.getNome() + ": $ " +calcularImposto();
    }

    @Override
    public Double calcularImposto() {
        
        Double taxaImposto = (this.getRendaAnual() < 20.0000) ? 0.15 : 0.25;
        
        Double imposto = 0.0d;
        
        //Se teve gasto com saúde: 50% de abatimento
        //Se não, apenas calculo do imposto
        
        if (gastosComSaude > 0){
            imposto = (this.getRendaAnual() * taxaImposto) - (gastosComSaude * 0.5);
        } else {
            imposto = this.getRendaAnual() * taxaImposto;
        }
        
        return Math.max(imposto, 0.0d);
    }

}
