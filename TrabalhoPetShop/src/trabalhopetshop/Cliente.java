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
public class Cliente extends Pessoa {
    
      Cliente(String _nome, int _codigo, int _CPF, String _endereco, int _contato) {
		super(_nome, _codigo, _CPF);
	}
    
    protected String endereco;
    protected int contato;
    //private int codigo;
    //private String nome;
    //private int CPF

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the contato
     */
    public int getContato() {
        return contato;
    }

    /**
     * @param contato the contato to set
     */
    public void setContato(int contato) {
        this.contato = contato;
    }
    public void PrintaCliente(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Contato: " + this.contato + "\n");        
    }
    public void RemoveCliente(){
        this.setNome(null);
        this.setCodigo(0);
        this.setCPF(0);
        this.setEndereco(null);
        this.setContato(0);
    }
    public void CadastraCliente(){
        this.setNome(nome);         
        this.setCodigo(codigo);         
        this.setCPF(CPF);         
        this.setEndereco(endereco);         
        this.setContato(contato);         
    }
}
