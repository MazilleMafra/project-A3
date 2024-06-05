package a3.project.Classes;

public class Instrutores extends Pessoas {

    private String matricula;
    

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
@override
    public String toString(){
        return "Instrutor:" + "/n"+
        "Nome:" + nome + "/n" +
        "Data de Nascimento:" + dataDeNascimento + "/n" +
        "CPF:" + cpf + "/n" +
        "Senha:" + senha + "/n" +
        "Peso:" + peso + "/n" +
        "Altura:" + altura + "/n";
                
    }
    
}
