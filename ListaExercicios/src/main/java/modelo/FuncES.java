package modelo;

public class FuncES extends Funcionario{
    public String universidade;

    public FuncES(String nome, int matricula, String universidade) {
        super(nome, matricula);
        this.universidade = universidade;
    }
    
    public String toString(){
        return super.toString()+
                "Universidade: "+this.getUniversidade();
    }
    
    public String getUniversidade(){
        return universidade;
    }
    
}
