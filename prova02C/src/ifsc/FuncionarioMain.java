package ifsc;

import java.util.ArrayList;

public class FuncionarioMain {

	public static void main(String[] args) {
		
		Programador p1 = new Programador();
		Programador p2 = new Programador();
		Programador p3 = new Programador();
		Programador p4 = new Programador();

		p1.setNome("Luka");
		p1.setSalario(7.500);
		p1.setAnosExperiencia(7);
		
		p2.setNome("Ana Clara");
		p2.setSalario(8.500);
		p2.setAnosExperiencia(8);
		
		p3.setNome("Ohana");
		p3.setSalario(9.500);
		p3.setAnosExperiencia(9);
		
		p4.setNome("Emily");
		p4.setSalario(10.500);
		p4.setAnosExperiencia(12);
		
		ArrayList<Programador> listaProg = new ArrayList<>();
			listaProg.add(p1);
			listaProg.add(p2);
			listaProg.add(p3);
			listaProg.add(p4);
			
		for (Programador Programador : listaProg) {
			System.out.println("\n----PROGRAMADOR----");
			System.out.println("Nome: "+Programador.getNome());
			System.out.println("Salário: "+Programador.getSalario());
			System.out.println("Anos de Experiência: "+Programador.getAnosExperiencia());
		}
		
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();
		Vendedor v3 = new Vendedor();
		Vendedor v4 = new Vendedor();
		
		v1.setNome("Britney");
		v1.setSalario(4.500);
		v1.setComissao(5.55);
		
		v2.setNome("Vinny");
		v2.setSalario(6.500);
		v2.setComissao(6.56);
		
		v3.setNome("Kevin");
		v3.setSalario(8.500);
		v3.setComissao(7.57);
		
		v4.setNome("Bruno");
		v4.setSalario(9.500);
		v4.setComissao(8.58);
		
		ArrayList<Vendedor> listaVend = new ArrayList<>();
			listaVend.add(v1);
			listaVend.add(v2);
			listaVend.add(v3);
			listaVend.add(v4);
			
		for (Vendedor Vendedor : listaVend) {
			System.out.println("\n====VENDEDOR====");
			System.out.println("Nome: "+Vendedor.getNome());
			System.out.println("Salário: "+Vendedor.getSalario());
			System.out.println("Comissão: "+Vendedor.getComissao());
		}
	}
}
