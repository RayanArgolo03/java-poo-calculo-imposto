package com.teste.exercicios;

import com.dominio.exercicios.Contribuinte;
import com.dominio.exercicios.PessoaFisica;
import com.dominio.exercicios.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int valor = (int) Math.max(2, 2.2);
        

        Scanner sc = new Scanner(System.in);

        //Lista de Contribuintes
        List<Contribuinte> contribuintes = new ArrayList<>();

        //Qtd Contribuintes
        System.out.print("Digite a quantidade de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do #" + (i + 1) + " contribuinte: ");

            System.out.print("Pessoa Jurídica ou Física? (j/f)");
            char tipo = sc.next().charAt(0);

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Salário Anual: ");
            Double rendaAnual = sc.nextDouble();

            if (tipo == 'j') {

                System.out.print("Número de funcionários: ");
                Integer numeroFuncionarios = sc.nextInt();

                contribuintes.add(new PessoaJuridica(numeroFuncionarios, nome, rendaAnual));

            } else {

                System.out.print("Gastos com saúde: ");
                Double gastosComSaude = sc.nextDouble();

                contribuintes.add(new PessoaFisica(gastosComSaude, nome, rendaAnual));
            }
        }

        System.out.println("Impostos: ");
        Double soma = 0.0d;

        for (Contribuinte contribuinte : contribuintes) {

            System.out.println(contribuinte);
            soma += contribuinte.calcularImposto();

        }

        System.out.print("\n Taxa de imposto total: " + soma);
        sc.close();

    }

}
