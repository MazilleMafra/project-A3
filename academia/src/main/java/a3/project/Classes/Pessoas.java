package a3.project.Classes;

public class Pessoas {
    protected String nome;
    protected String dataDeNascimento;
    protected String cpf;
    protected String senha;
    protected String email;
    

    public Pessoas(String nome, String dataDeNascimento, String cpf, String senha, String email) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
    }

    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNascimento(String dataDeNascimento){
        this.dataDeNascimento = dataDeNascimento;
    }
    public String getNascimento(){
        return dataDeNascimento;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    
    
}


