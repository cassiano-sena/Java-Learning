/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopetshop;

/**
 *
 * @author 7649487
 */
public class Catalogo extends Sistema {
    
    public Catalogo(){}
    
    public Catalogo(String _nome, int _codigo, String _tipo, int _valor){
        super(_nome, _codigo);
    }
    
    protected String tipo;
    protected int valor;

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    public void PrintaPessoa(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Valor: " + this.getValor());
    }
    public void RemoveCatalogo(){
        this.setNome(null);
        this.setCodigo(0);
        this.setTipo(null);
        this.setValor(0);
    }
}
