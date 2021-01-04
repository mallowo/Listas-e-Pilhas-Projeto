package PilhaEncadeada;

public class Pessoa
{	
	String nome;
	String sexo;
	int idade;
	Pessoa proximo;
	
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getSexo() 
	{
		return sexo;
	}
	public void setSexo(String sexo) 
	{
		this.sexo = sexo;
	}
	public int getIdade() 
	{
		return idade;
	}
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	public Pessoa getProximo() {
		return proximo;
	}
	public void setProximo(Pessoa proximo) {
		this.proximo = proximo;
	}
	
}