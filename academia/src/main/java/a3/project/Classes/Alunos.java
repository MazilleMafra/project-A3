package a3.project.Classes;

public class Alunos extends Pessoas {
    private double peso;
    private double altura;

    public Alunos(String nome, String dataDeNascimento, String cpf, String senha, double peso, double altura, String email) {
        super(nome, dataDeNascimento, cpf, senha, email);
        this.peso = peso;
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
       return peso / (altura * altura);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome = '" + nome + '\'' +
                ", Data de Nascimento = '" + dataDeNascimento + '\'' +
                ", CPF = '" + cpf + '\'' +
                ", Senha = '" + senha + '\'' +
                ", Peso = " + peso +
                ", Altura = " + altura +
                ", Email = " + email +
                '}';
    }
}

	
