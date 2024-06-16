package a3.project;

import java.util.Scanner;

import a3.project.Classes.Alunos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Insira o peso (kg): ");
        double peso = sc.nextDouble();
        System.out.print("Insira a altura (m): ");
        double altura = sc.nextDouble();

        sc.close();
        
        Alunos aluno = new Alunos (null, null, null, null, peso, altura, null);

        double imc = aluno.calcularIMC();
        System.out.printf("IMC do aluno: %.2f", imc);
    }
    
}
