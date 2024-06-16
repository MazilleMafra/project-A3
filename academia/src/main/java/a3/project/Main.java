package a3.project;

import java.util.Scanner;

import a3.project.Classes.Alunos;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso = sc.nextDouble();
        Alunos aluno = new Alunos(null, null, null, null, 0, 0, null);
        
        sc.close();
    }
    


    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}