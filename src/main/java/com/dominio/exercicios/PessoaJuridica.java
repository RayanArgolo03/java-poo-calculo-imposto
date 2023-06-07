
package com.dominio.exercicios;


public class PessoaJuridica extends Contribuinte{

    private Integer numeroFuncionarios;

    public PessoaJuridica(Integer numeroFuncionarios, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public PessoaJuridica() {
        super();
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public String toString() {
        return this.getNome()+ ": $ " +String.format("%.2f", calcularImposto());
    }
    
    
    
    @Override
    public Double calcularImposto() {
        
        Double taxaImposto = (numeroFuncionarios > 10) ? 0.16 : 0.14;
        
        Double imposto = this.getRendaAnual() * taxaImposto;
        
        return Math.max(imposto, 0.0d);
    }    
    
}

