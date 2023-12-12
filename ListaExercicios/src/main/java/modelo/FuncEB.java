package modelo;

public class FuncEB extends Funcionario{
    public String escola;

    public FuncEB(String nome, int matricula, String escola) {
        super(nome, matricula);
        this.escola = escola;
    }
    
    
    
    
    public String toString(){
        return super.toString()+
                "Escola: "+ this.getEscola();
    }
    
    public String getEscola(){
        return escola;
    }
    
}
