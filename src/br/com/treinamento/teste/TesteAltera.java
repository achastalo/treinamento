package br.com.treinamento.teste;

import java.util.List;

import br.com.treinamento.dao.ContatoDao;
import br.com.treinamento.modelo.Contato;

public class TesteAltera {
	private static ContatoDao dao;
	private static List<Contato> contato;

	public static void main(String[] args) {
		dao = new ContatoDao();
		contato = dao.getLista();
		
		Contato c1 = contato.get(0);
		System.out.println("Antes: " +c1.getNome());
		
		c1.setNome("Andre Chastalo");
		dao.altera(c1);
		
		dao = new ContatoDao();
		contato = dao.getLista();
		
		Contato c2 = contato.get(0);
		System.out.println("Depois: " +c2.getNome());
		
	}

}
