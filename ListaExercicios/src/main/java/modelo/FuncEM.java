package modelo;

public class FuncEM extends Funcionario{
    public String escola;

    public FuncEM(String nome, int matricula, String escola) {
        super(nome, matricula);
        this.escola = escola;
    }
    
    public String toString(){
        return super.toString()+
                "Escola: "+this.getEscola();
    }
    
    public String getEscola(){
        return escola;
    }
    
}
