/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.programacaodesolucoescomputacionais.lista8rafa;

import java.util.Scanner;

/**
 *
 * @author Adm
 */
public class Empregado {

    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void promover() {
        if (idade > 18) {
            double aumento = salario * 0.25;
            aumentarSalario(aumento);
            System.out.println("Empregado promovido com sucesso!");
        } else {
            System.out.println("O empregado não pode ser promovido, pois é menor de 18 anos.");
        }
    }

    public void aumentarSalario(double valorAumento) {
        salario += valorAumento;
    }

    public void demitir(int motivo) {
        switch (motivo) {
            case 1:
                System.out.println("Empregado demitido por justa causa. Aviso prévio deve ser cumprido.");
                break;
            case 2:
                double multa = salario * 0.4;
                salario -= multa;
                System.out.println("Empregado demitido por decisão do empregador. Multa de 40% aplicada: " + multa + " reais.");
                break;
            case 3:
                double salarioAposentadoria = calcularSalarioAposentadoria();
                salario = salarioAposentadoria;
                System.out.println("Empregado aposentado. Salário de aposentadoria: " + salarioAposentadoria + " reais.");
                break;
        }
    }

    public void fazerAniversario() {
        idade++;
        System.out.println("Feliz aniversário! Idade atualizada.");
    }

    private double calcularSalarioAposentadoria() {
        if (salario >= 1000 && salario < 2000) {
            return 1500;
        } else if (salario >= 2000 && salario < 3000) {
            return 2500;
        } else if (salario >= 3000 && salario < 4000) {
            return 3500;
        } else {
            return 4000;
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Salário: " + salario;
    }
}
