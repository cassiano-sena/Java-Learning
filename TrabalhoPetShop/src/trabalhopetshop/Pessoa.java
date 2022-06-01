/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopetshop;

/**
 *
 * @author 7360010
 */
public class Pessoa extends Sistema {
    
   public Pessoa(String _nome, int _codigo, int _CPF) {
		super(_nome, _codigo);	
    }
    
    protected int CPF;

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public void PrintaPessoa(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("CPF: " + this.CPF);
    }
    public void RemovePessoa(){
        this.setNome(null);
        this.setCodigo(0);
        this.setCPF(0);
    }
    
}
