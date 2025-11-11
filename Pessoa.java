
package psicolink;

import java.util.Scanner;
import java.util.ArrayList;

public class Pessoa {
	//Atributos
	String nome;
	int idade;
	String senha;
	String email;
	int id;
	String sexo;
	
	
	//Construtor
	public Pessoa(String nome,int idade, String senha, String email,int id,String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.senha = senha;
		this.email = email;
		this.id = id;
		this.sexo = sexo;
	}
	
	//Encapsulamento com getters e seters
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//Métodos
	//Método com a ideia de as mensagens serem guardadas em uma lista e com a condição de visualiza-las ou não
	
	public void Anotacao() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> mensagens = new ArrayList<>();
		
		System.out.println("Digite suas anotações: ");
		
		while(true) {
			System.out.print("... ");
			String mensagem = scanner.nextLine();
			mensagens.add(mensagem);
			
			System.out.println("Deseja continuar? \n sim? \n não?");
			String esc = scanner.nextLine();
		
			
			//Realiza uma comparação entre os dois nãos se eles são verdadeiros de acordo com a String
			//se for verdade ele quebra a lista
			if(esc.equalsIgnoreCase("não") || esc.equalsIgnoreCase("nao")) {
				break;
			}
			
			System.out.println("Deseja visualizar as anotações? ");
			String esc_2 = scanner.nextLine();
			if(esc_2.equalsIgnoreCase("sim")) {
				for(String visualizacao : mensagens) {
					System.out.println("..." + visualizacao);
				}
			}
		}
	}
}