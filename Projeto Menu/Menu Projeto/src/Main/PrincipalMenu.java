package Main;

import java.util.Scanner;

import ListaSequencial.PrincipalLS;
import PilhaEncadeada.PrincipalPE;
import PilhaSequencial.PrincipalPS;
import ListaEncadeada.PrincipalLE;

public class PrincipalMenu {

	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner (System.in);

	    PrincipalLS LS = new PrincipalLS();
	    PrincipalLE LE = new PrincipalLE();
	    PrincipalPS PS = new PrincipalPS();
	    PrincipalPE PE = new PrincipalPE();

	    int opcao = 0;
	    
	    do 
	    {
	    
			 System.out.println("\n\n    ### MENU DE INTERAÇÃO ###");
		     System.out.println("\n ==============================");
		     System.out.println(" |     1 - Lista Sequencial    |");
		     System.out.println(" |     2 - Lista Encandeada    |");
		     System.out.println(" |     3 - Pilha Sequencial    |");
		     System.out.println(" |     4 - Pilha Encandeada    |");
		     System.out.println(" |     0 - Sair                |");
		     System.out.println(" ==============================\n");
		     
		     System.out.print("Opção -> ");
		     opcao = teclado.nextInt();
		
		     switch(opcao)
		     {
		         case 1:
		        	 LS.LS();
		             break;
		         
		         case 2:
		        	 LE.LE();
		             break;
		             
		         case 3:
		        	 PS.PS();
		             break;
		             
		         case 4:
		        	 PE.PE();
		             break;
		             
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
