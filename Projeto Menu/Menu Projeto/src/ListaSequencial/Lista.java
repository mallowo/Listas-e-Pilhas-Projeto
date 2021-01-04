package ListaSequencial;

import java.util.Scanner;

public class Lista extends Pessoa
{
	Scanner teclado = new Scanner (System.in);
	Pessoa[] pessoas = new Pessoa[100];
	
	int tamanho = 0;
	
	public boolean estaVazia() 
	{
		return(tamanho == 0);
	}
	
	public boolean estaCheia() 
	{
		return(tamanho == pessoas.length);
	}
	
	public int tamanhoLista() 
	{
		return(tamanho);
	}
	
	private void deslocarParaDireita(int pos) 
	{
		for (int i = tamanho; i > pos; i--)
			pessoas[i] = pessoas[i - 1];
	}
	
	public boolean inserirPessoa (int pos) 
	{
		Pessoa pe = new Pessoa();
		
		System.out.print("\nInsira o nome da pessoa: ");
		pe.nome = teclado.next();
		
		System.out.print("Insira o sexo da pessoa: ");
		pe.sexo = teclado.next();
		
		System.out.print("Insira a idade da pessoa: ");
		pe.idade = teclado.nextInt();
		
		System.out.print("Seu número é " + pos);
		
		if (estaCheia() || (pos > tamanho) || (pos < 0))
			return false;
		
		if(estaVazia())
		{
			pessoas[0] = pe;
		}
		else
		{
			deslocarParaDireita(pos);
			pessoas[pos] = pe;
		
		}
		
		tamanho++;
		return true;
	}
	
	public void deslocarParaEsquerda(int pos) 
	{
		for (int i = pos; i < (tamanho - 1); i++)
			pessoas[i] = pessoas[i + 1];
	}
	
	public boolean removerPessoa (int pos) 
	{
		if ((pos > tamanho) || (pos < 0))
			return false;
		deslocarParaEsquerda(pos);
		tamanho--;
		
		System.out.println("A pessoa de número "+ pos +" foi removida!");
		
		return true;
	}
	
	public void exibirLista() 
	{
		for (int i = 0; i < tamanho; i++)
			System.out.println("\nPessoa nº "+i+"\nNome: "+pessoas[i].nome+"\nSexo: "+pessoas[i].sexo+"\nIdade: "+pessoas[i].idade + "\n");
	}
	
}