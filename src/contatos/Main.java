package contatos;

import java.util.ArrayList;
import java.util.List;

public class Main {
	

	public static void main (String[] args) {
		
		List<Contato> listaContatos = new ArrayList<>();
		
		Contato mae = new Contato("Mãe", "mae@gmail.com", "2199887876", "21/10");
		Contato pai = new Contato("pai", "pai@gmail.com", "2188447876", "12/10");
		Contato irmao1 = new Contato("irmao1", "irmao1@gmail.com", "2199777876", "23/6");
		Contato filha = new Contato("filha", "filha@gmail.com", "2145887876", "22/04");
		
		listaContatos.add(mae);
		listaContatos.add(pai);
		listaContatos.add(irmao1);
		listaContatos.add(filha);
		
		System.out.println(listaContatos.size());
		System.out.println(listaContatos.isEmpty());
		System.out.println(listaContatos.indexOf(irmao1));
		
		System.out.println(irmao1.getAniversario());
		System.out.println(filha);
		System.out.println(pai.getEmail());
		
		System.out.println(listaContatos.toString());
		
		Contato cachorro = new Contato("chloe", "cao@gmail", "2199557733", "10/06");
		listaContatos.add(cachorro);
		
		System.out.println(listaContatos.toString());
		System.out.println(listaContatos.size());		
		System.out.println(listaContatos.indexOf(cachorro));
		System.out.println(listaContatos.contains(mae));
		System.out.println(listaContatos.indexOf(mae));
		
		for (Contato contatos : listaContatos) {
			System.out.println("Contatos: " + contatos);
		}

		System.out.println();
		
		for (int i = 0; i < listaContatos.size(); i++) {
			Contato Contatos = listaContatos.get(i);
			System.out.println("Contatos => " + Contatos);
		}
		
	}

}
