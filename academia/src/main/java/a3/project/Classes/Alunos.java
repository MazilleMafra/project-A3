package classes;

public class Alunos extends Pessoas {
    private double peso;
    private double altura;
    public void setPeso (double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    
    public void setAltura (double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }

public String toString(){
  return "Aluno" + "\n" +
          "Nome:" + nome+ "\n" +
          "DataDeNascimento:" + DataDeNascimento+ "\n" +
          "Cpf:" + cpf+"\n" +
          "Senha:" + senha+"\n" +
          "peso:" + peso+"\n" +
          "altura:" + altura+"\n" ;       
    }

}
