package a3.project.Classes;

public class Alunos extends Pessoas {
    private double peso;
    private double altura;

    public Alunos(String nome, String dataDeNascimento, String cpf, String senha, double peso, double altura) {
        super(nome, dataDeNascimento, cpf, senha);
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
        if (altura > 0) {
            return peso / (altura * altura);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", senha='" + senha + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

	
