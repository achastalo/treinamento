package br.com.treinamento.teste;

import java.util.List;

import br.com.treinamento.dao.ContatoDao;
import br.com.treinamento.modelo.Contato;

public class TesteExclui {
	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		List<Contato> contato = dao.getLista();
		
		Contato c1 = contato.get(1);
		
		dao.remove(c1);
		System.out.println("Excluido.");
	}

}
