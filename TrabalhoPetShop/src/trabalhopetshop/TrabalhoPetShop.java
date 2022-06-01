package trabalhopetshop;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TrabalhoPetShop {

    public static void main(String[] args) throws IOException{
        
        Scanner S = new Scanner(System.in);    
        
        List<Dados> dados = new ArrayList<>();
        List<Dados> dados2 = new ArrayList<>();
        List<Dados> dados3 = new ArrayList<>();
        List<Dados> dados4 = new ArrayList<>();
        Dados d = new Dados();
        Dados d2 = new Dados();
        Dados d3 = new Dados();
        Dados d4 = new Dados();
        
        boolean cadastrando = true;
        boolean exit = false;
        String nome = null;
        int codigo = 0;
        int CPF = 0;
        int salario = 0;
        int cargaHoraria = 0;
        String tipo = null;
        int valor = 0;
        int quantidade = 0;
        int horario = 0;
        String endereco = null;
        int contato = 0;

        int menuInput = 13;
        Funcionario f = new Funcionario(nome,codigo,CPF,salario,cargaHoraria);
        Produto p = new Produto(tipo,valor,quantidade,nome,codigo);
        Servico s = new Servico(tipo,valor,horario,nome,codigo);
        Cliente c = new Cliente(nome,codigo,CPF,endereco,contato);
        
        while(!exit){
            
            
           
            menu:
            
            System.out.println("Bem vindo ao PETSHOP! Por favor, insira o número correspondente ao serviço que deseja utilizar: \n");
            System.out.println("Cadastrar funcionário > [1]");
            System.out.println("Cadastrar produto > [2]");
            System.out.println("Cadastrar serviço > [3]");
            System.out.println("Cadastrar cliente > [4]\n");
            System.out.println("Visualizar funcionários > [5]");
            System.out.println("Visualizar produtos > [6]");
            System.out.println("Visualizar serviços > [7]");
            System.out.println("Visualizar clientes > [8]\n");
            System.out.println("Remover funcionário > [9]");
            System.out.println("Remover produto > [10]");
            System.out.println("Remover serviço > [11]");
            System.out.println("Remover cliente > [12]\n");
            System.out.println("Sair > [0]");
            menuInput = S.nextInt();
            S.nextLine();
            
            while(menuInput <= -1 || menuInput > 12){
                System.out.println("\nDigite um número válido!");
                menuInput = S.nextInt();
                S.nextLine();
            }
            
            if(menuInput == 0){   
                exit = true;
                break;  
            }
            
            if(menuInput == 1){      
                cadastrando = true;
		while (cadastrando) {
                    if (dados.isEmpty()){
                        
                        System.out.println("\nCadastro de Funcionário");

                        System.out.println("\nInsira o seu Nome: ");
                        nome = S.nextLine();
                        f.setNome(nome);
                        System.out.println("\nInsira o seu código: ");
                        codigo = S.nextInt();
                        f.setCodigo(codigo);
                        System.out.println("\nInsira o seu CPF: ");
                        CPF = S.nextInt();
                        f.setCPF(CPF);
                        System.out.println("\nInsira o salário: ");
                        salario = S.nextInt();
                        f.setSalario(salario);
                        System.out.println("\nInsira a carga horária: ");
                        cargaHoraria = S.nextInt();
                        f.setCargaHoraria(cargaHoraria);
                        f.PrintaFuncionario();
                        System.out.println("\nAdicionar cadastro (1)");
                        System.out.println("Cancelar cadastro (2)\n");
                        int cadastrar = S.nextInt();
                        S.nextLine();
                        
                        if (cadastrar == 1) {
                            System.out.println("\nAdicionado.\n");
                            dados.add(d);
                            f.CadastraFuncionario();
                            f.PrintaFuncionario();
                        }else{
                            System.out.println("\nCancelado.\n");
                        }

                        //System.out.println("\nContinuar cadastrando (1)");
                        System.out.println("Voltar ao menu (2)\n");
                        int continua = S.nextInt();
                        switch (continua) {
                            /*case 1:
                                cadastrando = true;
                                S.nextLine(); 
                                continue;*/
                            case 2:
                                cadastrando = false;    
                                break;
                            default:
                                System.out.println("\nOpção inválida! \n");
                                cadastrando = false;
                        }
                    }else{
                        System.out.println("\nVocê já cadastrou o número máximo de funcionários\n");
                        System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                        System.in.read();
                        break;
                    }
                }
            }   
            if(menuInput == 2){      
                cadastrando = true;
		while (cadastrando) {
                    if (dados2.isEmpty()){
                        System.out.println("\nCadastro de Produto");



                        System.out.println("\nInsira o tipo do produto: ");
                        tipo = S.nextLine();
                        p.setTipo(tipo);
                        System.out.println("\nInsira o valor: ");
                        valor = S.nextInt();
                        p.setValor(valor);
                        System.out.println("\nInsira a quantidade: ");
                        quantidade = S.nextInt();
                        p.setQuantidade(quantidade);
                        S.nextLine();
                        System.out.println("\nInsira o nome do produto: ");
                        nome = S.nextLine();
                        p.setNome(nome);
                        System.out.println("\nInsira o código do produto: ");
                        codigo = S.nextInt();
                        p.setCodigo(codigo);
                        p.PrintaProduto();
                        System.out.println("\nAdicionar cadastro (1)");
                        System.out.println("Cancelar cadastro (2)\n");
                        int cadastrar = S.nextInt();
                        S.nextLine();

                        if (cadastrar == 1) {
                            System.out.println("\nAdicionado.\n");
                            dados2.add(d2);
                            p.CadastraProduto();
                            p.PrintaProduto();
                        }else{
                            System.out.println("\nCancelado.\n");
                        }

                        //System.out.println("\nContinuar cadastrando (1)");
                        System.out.println("Voltar ao menu (2)\n");
                        int continua = S.nextInt();
                        switch (continua) {
                            /*case 1:
                                cadastrando = true;
                                S.nextLine(); 
                                continue;*/
                            case 2:
                                cadastrando = false;    
                                break;          
                            default:
                                System.out.println("\nOpção inválida! \n");
                                cadastrando = false;
                        }
                    }else{
                        System.out.println("\nVocê já cadastrou o número máximo de produtos\n");
                        System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                        System.in.read();
                        continue;
                    }
		}
            }
            if(menuInput == 3){      
                cadastrando = true;
		while (cadastrando) {
                    if (dados3.isEmpty()){
                        System.out.println("\nCadastro de Serviço");



                        System.out.println("\nInsira o tipo do serviço: ");
                        tipo = S.nextLine();
                        s.setTipo(tipo);
                        System.out.println("\nInsira o valor: ");
                        valor = S.nextInt();
                        s.setValor(valor);
                        System.out.println("\nInsira a carga horária: ");
                        quantidade = S.nextInt();
                        s.setHorario(horario);
                        S.nextLine();
                        System.out.println("\nInsira o nome do serviço: ");
                        nome = S.nextLine();
                        s.setNome(nome);
                        System.out.println("\nInsira o código do serviço: ");
                        codigo = S.nextInt();
                        s.setCodigo(codigo);
                        s.PrintaServico();
                        System.out.println("\nAdicionar cadastro (1)");
                        System.out.println("Cancelar cadastro (2)\n");
                        int cadastrar = S.nextInt();
                        S.nextLine();

                        if (cadastrar == 1) {
                            System.out.println("\nAdicionado.\n");
                            dados3.add(d3);
                            s.CadastraServico();
                            s.PrintaServico();
                        }else{
                            System.out.println("\nCancelado.\n");
                        }

                        //System.out.println("\nContinuar cadastrando (1)");
                        System.out.println("Voltar ao menu (2)\n");
                        int continua = S.nextInt();
                        switch (continua) {
                            /*case 1:
                                cadastrando = true;
                                S.nextLine(); 
                                continue;*/
                            case 2:
                                cadastrando = false;    
                                break;           
                            default:
                                System.out.println("\nOpção inválida! \n");
                                cadastrando = false;
                        }
                    }else{
                        System.out.println("\nVocê já cadastrou o número máximo de serviços\n");
                        System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                        System.in.read();
                        continue;
                    }
		}
            }    
            if(menuInput == 4){      
                cadastrando = true;
		while (cadastrando) {
                    if (dados4.isEmpty()){
                        System.out.println("\nCadastro de Cliente");



                        System.out.println("\nInsira o nome do cliente: ");
                        nome = S.nextLine();
                        c.setNome(nome);
                        System.out.println("\nInsira o código do cliente: ");
                        codigo = S.nextInt();
                        c.setCodigo(codigo);
                        System.out.println("\nInsira o CPF do mesmo: ");
                        CPF = S.nextInt();
                        c.setCPF(CPF);
                        S.nextLine();
                        System.out.println("\nInsira o endereço dele: ");
                        endereco = S.nextLine();
                        c.setEndereco(endereco);
                        System.out.println("\nInsira o número para contato: ");
                        contato = S.nextInt();
                        c.setContato(contato);
                        c.PrintaCliente();
                        System.out.println("\nAdicionar cadastro (1)");
                        System.out.println("Cancelar cadastro (2)\n");
                        int cadastrar = S.nextInt();
                        S.nextLine();

                        if (cadastrar == 1) {
                            System.out.println("\nAdicionado.\n");
                            dados4.add(d4);
                            c.CadastraCliente();
                            c.PrintaCliente();
                        }else{
                            System.out.println("\nCancelado.\n");
                        }

                        //System.out.println("\nContinuar cadastrando (1)");
                        System.out.println("Voltar ao menu (2)\n");
                        int continua = S.nextInt();
                        switch (continua) {
                            /*case 1:
                                cadastrando = true;
                                S.nextLine(); 
                                continue;*/
                            case 2:
                                cadastrando = false;    
                                break;
                            default:
                                System.out.println("\nOpção inválida! \n");
                                cadastrando = false;
                        }
                    }else{
                        System.out.println("\nVocê já cadastrou o número máximo de clientes\n");
                        System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                        System.in.read();
                        continue;
                    }
		}
            } 
            if(menuInput == 5){
                if (dados.isEmpty()) {
                    System.out.println("\nSem funcionários para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Funcionários\n");
                    for (int i = 0; i < dados.size(); i++) {  
			dados.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        f.PrintaFuncionario();
                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		}   
            }
            if(menuInput == 6){
                if (dados2.isEmpty()) {
                    System.out.println("\nSem produtos para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Produtos\n");
                    for (int i = 0; i < dados2.size(); i++) {
			dados2.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        p.PrintaProduto();

                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
                }    
            }
            if(menuInput == 7){
                if (dados3.isEmpty()) {
                    System.out.println("\nSem serviços para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Serviços\n");
                    for (int i = 0; i < dados3.size(); i++) {
			dados3.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        s.PrintaServico();

                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
                }  
            }
            if(menuInput == 8){
                if (dados4.isEmpty()) {
                    System.out.println("\nSem clientes para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Clientes\n");
                    for (int i = 0; i < dados4.size(); i++) {
			dados4.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        c.PrintaCliente();

                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
                }
            }   
            if(menuInput == 9){
                if (dados.isEmpty()) {
                    System.out.println("\nSem funcionários para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Funcionários\n");
                    for (int i = 0; i < dados.size(); i++) {
			dados.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        f.PrintaFuncionario();

                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("\nRemover (1)"); 
                    System.out.println("Voltar ao menu (2)\n");
                    int delete = S.nextInt();
                    switch (delete) {
                        case 1:
                            S.nextLine();
                            System.out.println("Removendo funcionários . . . \n");   
                            f.RemoveFuncionario();
                            dados.clear();
                            System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                            System.in.read();
                            continue;
                        case 2:
                            break;
                        default:
                            System.out.println("\nOpção inválida! \n");
                    }                         
                }
            }    
            if(menuInput == 10){
                if (dados2.isEmpty()) {
                    System.out.println("\nSem produtos para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Produtos\n");
                    for (int i = 0; i < dados2.size(); i++) {
			dados2.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        p.PrintaProduto();

                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("\nRemover (1)"); 
                    System.out.println("Voltar ao menu (2)\n");
                    int delete = S.nextInt();
                    switch (delete) {
                        case 1:
                            S.nextLine();
                            System.out.println("Removendo produtos . . . \n");   
                            p.RemoveProduto();
                            dados2.clear();
                            System.out.println("Produtos removidos com sucesso\n");  
                            System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                            System.in.read();
                            continue;
                        case 2:
                            break;
                        default:
                            System.out.println("\nOpção inválida! \n");
                    }                         
                }
            }    

            if(menuInput == 11){
                if (dados3.isEmpty()) {
                    System.out.println("\nSem serviços para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Servicos\n");
                    for (int i = 0; i < dados3.size(); i++) {
			dados3.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        s.PrintaServico();

                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("\nRemover (1)"); 
                    System.out.println("Voltar ao menu (2)\n");
                    int delete = S.nextInt();
                    switch (delete) {
                        case 1:
                            S.nextLine();
                            System.out.println("Removendo serviços . . . \n");   
                            s.RemoveServico();
                            dados3.clear();
                            System.out.println("Serviços removidos com sucesso\n");  
                            System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                            System.in.read();
                            continue;
                        case 2:
                            break;
                        default:
                            System.out.println("\nOpção inválida! \n");
                    }                         
                }
            }    
            if(menuInput == 12){
                if (dados4.isEmpty()) {
                    System.out.println("\nSem clientes para visualizar!\n");
                    System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                    System.in.read();
                    continue;
		} else {
                    System.out.println("\nLista de Clientes\n");
                    for (int i = 0; i < dados4.size(); i++) {
			dados4.get(i);
			System.out.println("Ordem de cadastro: " + i);
                        c.PrintaCliente();

                    }
                    System.out.println("\nFim da lista\n");
                    System.out.println("\nRemover (1)"); 
                    System.out.println("Voltar ao menu (2)\n");
                    int delete = S.nextInt();
                    switch (delete) {
                       case 1:
                            S.nextLine();
                            System.out.println("Removendo clientes . . . \n");   
                            c.RemoveCliente();
                            dados4.clear();
                            System.out.println("Clientes removidos com sucesso\n");  
                            System.out.println("Pressione 'ENTER' para voltar ao menu.\n");
                            System.in.read();
                            continue;
                        case 2:
                            break;
                        default:
                            System.out.println("\nOpção inválida! \n");
                    }                         
                }
            }    
        }
        if(exit = true){
            S.close();
        }
    }

    private static class Dados {

        public Dados() {
        }
    }
}