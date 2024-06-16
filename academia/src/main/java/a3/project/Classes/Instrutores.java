package a3.project.Classes;

public class Instrutores extends Pessoas {

    private String matricula;

    public Instrutores(String nome, String dataDeNascimento, String cpf, String senha, String matricula, String email) {
        super(nome, dataDeNascimento, cpf, senha, email);
        this.matricula = matricula;
    }
           

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public String getMatricula(){
        return matricula;
    }
@Override
    public String toString(){
        return "Instrutor: " + "/n"+
        "Nome: " + nome + "/n" +
        "Data de Nascimento: " + dataDeNascimento + "/n" +
        "CPF: " + cpf + "/n" +
        "Senha: " + senha + "/n" +
        "Matricula: " + matricula + "/n" +
        "Email: " + email + "/n";
                
    }
    
}
