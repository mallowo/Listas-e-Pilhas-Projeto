package ListaEncadeada;

import java.util.Scanner;

import ListaEncadeada.Pessoa;

public class Lista extends Pessoa 
{
	Scanner teclado = new Scanner (System.in);
	Pessoa[] pessoas = new Pessoa[100];

	Pessoa primeiro = null;
	Pessoa ultimo = null;
	int tamanho = 0;
	
	public boolean estaVazia() 
	{
		if (tamanho == 0) 
		{
			return true;
		}
		return false;
	}
	
	public void inserirPessoa () 
	{
		Pessoa pe = new Pessoa();
		
		System.out.print("\nInsira o nome da pessoa: ");
		pe.nome = teclado.next();
		
		System.out.print("Insira o sexo da pessoa: ");
		pe.sexo = teclado.next();
		
		System.out.print("Insira a idade da pessoa: ");
		pe.idade = teclado.nextInt();
		
		if (estaVazia()) 
		{
			primeiro  = ultimo = pe;
		}
		else {
			ultimo.proximo = pe;
			ultimo = pe;
		}
		tamanho++;
	}
	
	public void exibirLista ( ) 
	{
		Pessoa pe = primeiro;
		for (int i = 0; i < tamanho; i++) 
		{
			System.out.println("Pessoa nº "+i+"\nNome: "+pe.nome+"\nSexo: "+pe.sexo+"\nIdade: "+pe.idade + "\n");
			pe = pe.proximo;
		}
		System.out.println("");
	}
	
	public int tamanhoDaLista() 
	{
		return tamanho;
	}
	
	public void removerPessoaPorNome (String nomeprocurado) 
	{
		if (estaVazia()) 
		{
			System.out.println("A lista esta vazia e não tem o que remover.");
			return;
		}
		
		if (tamanho == 1) 
		{
			if (primeiro.nome.contentEquals(nomeprocurado)) 
			{
				primeiro = ultimo = null;
				tamanho--;
	
				return;
			}
			else {
				System.out.println("O nome "+nomeprocurado+" procurado não está na lista.");
				return;
			}
		}
		Pessoa alunofrente = primeiro;
		Pessoa alunotras = null;
		
		for (int i = 0; i < tamanho; i++) 
		{
			if (nomeprocurado.contentEquals(alunofrente.nome)) 
			{
				if (i == 0) {
					System.out.println("Achei o nome na primeira posição da lista");
					primeiro = primeiro.proximo;
					tamanho--;
					return;
				}
				else 
				{
					alunotras.proximo = alunofrente.proximo;
					tamanho--;
					return;
				}
			}
			else 
			{
				System.out.println("Procurando...");
				alunotras = alunofrente;
				alunofrente = alunofrente.proximo;
			}
			
			System.out.println("\n"+ nomeprocurado +" foi removido(a) da lista!");
		}
		

	}
}
