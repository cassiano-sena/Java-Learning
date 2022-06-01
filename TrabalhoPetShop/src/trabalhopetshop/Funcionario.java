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
public class Funcionario extends Pessoa{
        
     public Funcionario(String _nome, int _codigo, int _CPF, int _salario, int _cargaHoraria) {
		super(_nome, _codigo, _CPF);
	}
    
    protected int salario;
    protected int cargaHoraria;
    
    
    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public void PrintaFuncionario(){
        this.getNome();
        this.getCodigo();
        this.getCPF();
        this.getSalario();
        this.getCargaHoraria();
        System.out.println("Nome: " + this.nome);
        System.out.println("Código: " + this.codigo);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Salário: " + this.salario);
        System.out.println("Carga Horária: " + this.cargaHoraria + "\n");          
    }
    public void RemoveFuncionario(){
        this.setNome(null);         
        this.setCodigo(0);         
        this.setCPF(0);         
        this.setSalario(0);         
        this.setCargaHoraria(0);         
    }
    public void CadastraFuncionario(){
        this.setNome(nome);         
        this.setCodigo(codigo);         
        this.setCPF(CPF);         
        this.setSalario(salario);         
        this.setCargaHoraria(cargaHoraria);         
    }

}
