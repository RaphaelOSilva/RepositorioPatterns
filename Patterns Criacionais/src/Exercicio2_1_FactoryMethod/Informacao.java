package Exercicio2_1_FactoryMethod;

/**
 * 
 * @author Raphael de Oliveira Silva 816110743 SI3AN-MCA
 * 			
 *
 */

public class Informacao extends Nome{
	
	public Informacao(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		System.out.println(nome + " " + sobrenome + "\n" + sobrenome + ", " + nome);
	}
	
}
