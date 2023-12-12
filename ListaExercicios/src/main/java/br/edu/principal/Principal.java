package br.edu.principal;
import modelo.*;

public class Principal {

    public static void main(String[] args) {
        FuncSE funcSE = new FuncSE("Erenilson", 1);
        FuncEB funcEB = new FuncEB("Marcelo", 2, "IFCE");
        
        
        System.out.println(funcSE.toString());
        System.out.println(funcEB.toString());
    }
    
}
