package a3.project.Classes;

public class Pessoas {
    protected String nome;
    protected String dataDeNascimento;
    protected String cpf;
    protected String senha;
    protected String peso;
    protected String altura;

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
    public void setPeso(String peso){
        this.peso = peso;
    }
    public String getPeso(){
        return peso;
    }
    public void setAltura(String altura){
        this.altura = altura; 
    }
    public String getAltura(){
        return altura;
    }
    
}


