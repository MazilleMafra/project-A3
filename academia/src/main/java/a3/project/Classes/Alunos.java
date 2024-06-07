package a3.project.Classes;

public class Alunos extends Pessoas {
    private String peso;
    private String altura;

    public void setPeso (String peso){
        this.peso = peso;
    }
    public String getPeso(){
        return peso;
    }
    
    public void setAltura (String altura){
        this.altura = altura;
    }
    public String getAltura(){
        return altura;
    }
@Override
public String toString(){
  return "Aluno" + "\n" +
          "Nome:" + nome+ "\n" +
          "DataDeNascimento:" + dataDeNascimento+ "\n" +
          "Cpf:" + cpf+"\n" +
          "Senha:" + senha+"\n" +
          "peso:" + peso+"\n" +
          "altura:" + altura+"\n" ;       
    }

}
