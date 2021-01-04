package PilhaEncadeada;

import java.util.Scanner;

import PilhaEncadeada.Pessoa;

public class Pilha
{
	Scanner teclado = new Scanner (System.in);
	Pessoa[] pessoas = new Pessoa[100];

	Pessoa	topo;
	int		quantidade = 0;
	
	public boolean estaVazia() 
	{
		return (topo == null);
	}
	
	public int quantidadeElementos() 
	{
		return quantidade;
	}
	
	public Pessoa top () 
	{
		if (estaVazia())
			return null;
		
		return (topo);
	}
	
	public void push() 
	{
		Pessoa pe = new Pessoa();
		
		System.out.print("\nInsira o nome da pessoa: ");
		pe.nome = teclado.next();
		
		System.out.print("Insira o sexo da pessoa: ");
		pe.sexo = teclado.next();
		
		System.out.print("Insira a idade da pessoa: ");
		pe.idade = teclado.nextInt();
		
		pe.proximo = topo;
		topo = pe;
		quantidade++;
	}
	
	public Pessoa pop () 
	{
		if (estaVazia())
			return null;
		
		System.out.println("A primeira pessoa da pilha foi removida!");
		
		Pessoa aux = topo;
		topo = topo.proximo;
		quantidade--;
		return aux;
	}
	
	public void exibirPessoas () 
	{
		if (estaVazia()) 
		{
			System.out.println("A pilha está vazia");
			return;
		}
		
		Pessoa pe = topo;
		System.out.println("\n=== TOPO ===\n");
		for (int i = 0; i < quantidade; i++) 
		{
			System.out.println("Nome: "+pe.nome+"\nSexo: "+pe.sexo+"\nIdade: "+pe.idade + "\n");
			pe = pe.proximo;
		}
	}
}
