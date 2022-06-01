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
public class Produto extends Catalogo {
    public Produto(){}
    
    public Produto (String _tipo, int _valor, int _quantidade, String _nome, int _codigo) {
		super(_tipo, _valor, _nome, _codigo);
	}
    
    protected int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void PrintaProduto(){
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo + "\n");
    }
    public void RemoveProduto(){
        this.setTipo(null);
        this.setValor(0);
        this.setQuantidade(0);
        this.setNome(null);
        this.setCodigo(0);
    }
    public void CadastraProduto(){
        this.setTipo(getTipo());         
        this.setValor(getValor());         
        this.setQuantidade(quantidade);         
        this.setNome(nome);         
        this.setCodigo(codigo);         
    }

}
