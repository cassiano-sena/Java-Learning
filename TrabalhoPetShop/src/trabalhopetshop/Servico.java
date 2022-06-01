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
public class Servico extends Catalogo {
    
    public Servico(){}
    
    public Servico (String _tipo, int _valor, int _quantidade, String _nome, int _codigo) {
		super(_tipo, _valor, _nome, _codigo);
	}
    
    protected int horario;
    
    public int getHorario(){
        return horario;
    }
    
    public void setHorario(int horario){
        this.horario = horario;
    }
    
    public void PrintaServico(){
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Horario: " + this.getHorario());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Codigo: " + this.getCodigo() + "\n");
    }
    public void RemoveServico(){
        this.setTipo(null);
        this.setValor(0);
        this.setHorario(0);
        this.setNome(null);
        this.setCodigo(0);
    }
    public void CadastraServico(){
        this.setTipo(getTipo());         
        this.setValor(getValor());         
        this.setHorario(getHorario());         
        this.setNome(getNome());         
        this.setCodigo(getCodigo());         
    }
}
