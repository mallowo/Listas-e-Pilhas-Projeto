package ListaSequencial;

import java.util.Scanner;

public class PrincipalLS
{
	public void LS()

	{
  
		Scanner teclado = new Scanner (System.in);
		
		Lista lista = new Lista();
		
		int opcao = 0;
		int pos = 0;
		
		do 
		{
		    System.out.println("\n\n ### MENU LISTA SEQUENCIAL ###");
		    System.out.println("\n ==============================");
		    System.out.println(" |     1 - Inserir Pessoa     |");
		    System.out.println(" |     2 - Remover Pessoa     |");
		    System.out.println(" |     3 - Exibir Pessoas     |");
		    System.out.println(" |     4 - Voltar             |");
		    System.out.println(" |     0 - Sair               |");
		    System.out.println(" ==============================\n");
		
		    System.out.print("Opção -> \n");
		    opcao = teclado.nextInt();
		
		    switch(opcao)
		    {
		        case 1:
		            lista.inserirPessoa(pos);
		            pos++;
		            break;
		
		        case 2:
		            System.out.print("\nDigite o número da pessoa: ");
		            pos = teclado.nextInt();
		
		            lista.removerPessoa(pos);
		            break;
		
		        case 3:
		            lista.exibirLista();
		            break;
		
		        case 4:
		        	return;
		            
		        case 0:
		        	break;
		
		        default:
		            System.out.println("Opção Inválida!");
		                break;
	        }
	
	    }while (opcao != 0);
	
	    teclado.close();
	}
}