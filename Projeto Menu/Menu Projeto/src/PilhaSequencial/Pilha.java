package PilhaSequencial;

import PilhaSequencial.Pessoa;

import java.util.Scanner;

public class Pilha
{
	Scanner teclado = new Scanner (System.in);
	Pessoa[] pessoas = new Pessoa[100];

	int	topo = -1;
	
	public boolean estaVazia() 
	{
		return (topo == -1);
	}
	
	public boolean estaCheia() 
	{
		return (topo == pessoas.length - 1);
	}
	
	public int quantidadeElementos( ) 
	{
		return (topo+1);
	}
	
	public Pessoa top() 
	{
		if (estaVazia())
			return null;
		
		return pessoas[topo];
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
		
		if (estaCheia())
			return;
		
		topo++;
		pessoas[topo] = pe;
	}
	
	public Pessoa pop() 
	{
		if (estaVazia())
			return null;
		
		System.out.println("A primeira pessoa da pilha foi removida!");

		Pessoa valor = pessoas[topo];
		pessoas[topo] = null;
		topo--;
		return valor;
	}
	
	public void exibirElementos() 
	{
		System.out.println("\n=== TOPO ===\n");
		for (int i = topo; i >= 0; i--)
			System.out.println("Nome: "+pessoas[i].nome+"\nSexo: "+pessoas[i].sexo+"\nIdade: "+pessoas[i].idade + "\n");
	}
}
