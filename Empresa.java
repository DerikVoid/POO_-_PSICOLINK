package classes;

import java.util.Scanner;

public class Empresa {
	// Atributos

	private static String nome_emp;
	String cnpj_emp;
	String email_emp;
	String senha_emp;

	private static Empresa empresa_criada;

	public static Empresa getEmpresa_criada() {
		return empresa_criada;
	}

	public static void setEmpresa_criada(Empresa empresa_criada) {
		Empresa.empresa_criada = empresa_criada;
	}

	// Construtor
	public Empresa(String nome_emp, String cnpj_emp, String email_emp, String senha_emp) {
		Empresa.nome_emp = nome_emp;
		this.cnpj_emp = cnpj_emp;
		this.email_emp = email_emp;
		this.senha_emp = senha_emp;
	}

	public static String getNome_emp() {
		return nome_emp;
	}

	public static void setNome_emp(String nome_emp) {
		Empresa.nome_emp = nome_emp;
	}

	public String getCnpj() {
		return cnpj_emp;
	}

	public void setCnpj(String cnpj_emp) {
		this.cnpj_emp = cnpj_emp;
	}

	public String getEmail_emp() {
		return email_emp;
	}

	public void setEmail_emp(String email_emp) {
		this.email_emp = email_emp;
	}

	public String getSenha_emp() {
		return senha_emp;
	}

	public void setSenha_emp(String senha_emp) {
		this.senha_emp = senha_emp;
	}

	// Métodos

	// Criar empresa e com o nome dela colocar no método abaixo e so puxar este
	// método de crição no main

	public static Empresa CriacaoEmpresa() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Que bom você estar utilizando nosso sistema para auxiliar na organização de sua empresa! \n"
				+ "Ficamos muito felizes com isto. \n"
				+ "Para sua utilização é necessário alguns dados de sua corporação, ok? \n"
				+ "Digite respectivamente abaixo:");

		System.out.println("Nome da empresa: ");
		String nome_emp = scan.nextLine();

		System.out.println("O CNPJ da empresa: ");
		String cnpj_emp = scan.nextLine();

		System.out.println("O email da empresa: ");
		String email_emp = scan.nextLine();

		System.out.println("E a senha oficial da empresa: ");
		String senha_emp = scan.nextLine();

		// Desta forma ela é armazenada a empresa q for criada pelo usuário
		empresa_criada = new Empresa(nome_emp, cnpj_emp, email_emp, senha_emp);
		return empresa_criada;

	}

	// Criação de empresa Genérica caso uma ainda não tenha sido feita
	// void foi trocado por Empresa pois ele o void não retorna nada e Empresa era o
	// tipo de retorno
	public static Empresa EmpresaGenerica() {
		Empresa empresa_g = new Empresa("PsicoInsight", "38.514.927/0001-62", "corporativo@psicinsight.com",
				"PsiC0rp!2025");
		return empresa_g;
	}

	// Criação de dados de psicologo
	public static String CD /* Criação de Dados */(Psicologo psicologo) {
		// Pegar o email do psicologo de seus atributos e com ele colocar neste formato
		// = "nome@nomedaempresa.com"
		// È preciso criar uma empresa generica caso uma empresa não seja criada para
		// assim o método getNome_emp funcionar
		String email_alt = psicologo.getNome() + "@gmail" + Empresa.getNome_emp();
		return email_alt;

	}
	
	//Método de calcular o salario do PSicologo de acordo com sua quantidade de avaliações
	public static void calcularSalario(Psicologo psicologo) {
		double c_s = (Psicologo.getSessoes() / 10) * 500;
		System.out.printf("O seu salário do mês é este: R$ %.2f", c_s);
		
	}

}