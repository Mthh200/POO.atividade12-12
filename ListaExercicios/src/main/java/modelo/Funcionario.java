package modelo;

public class Funcionario {
    public String nome;
    protected int matricula;
    
    public Funcionario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String toString(){
        return "Nome: "+this.getNome()+ "\n"+
               "Matrícula: "+this.getMatricula()+ "\n";
    }

    
    public String getNome() {
        return nome;
    }
    public int getMatricula() {
        return matricula;
    }
    
    
    
}
