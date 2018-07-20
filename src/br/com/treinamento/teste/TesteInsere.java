package br.com.treinamento.teste;

import java.util.Calendar;

import br.com.treinamento.dao.ContatoDao;
import br.com.treinamento.modelo.Contato;

public class TesteInsere {
	
	public static void main(String[] args) {
		Contato c1 = new Contato();
		
		c1.setNome("Joao");
		c1.setEmail("andre.chastalo@wssim.com.br");
		c1.setDataNascimento(Calendar.getInstance());
		c1.setEndereco("Av Brasil 123, Centro");
		
		ContatoDao dao = new ContatoDao();
		dao.adiciona(c1);
		System.out.println("Gravado.");
	}
	

}
