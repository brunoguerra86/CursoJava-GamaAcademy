import java.util.ArrayList;
public class Firma {
	public static void main(String args[]) {
		
		
		ArrayList<Pessoa> rh = new ArrayList<Pessoa>();
		ArrayList<Pessoa> op = new ArrayList<Pessoa>();
		ArrayList<Pessoa> ti = new ArrayList<Pessoa>();
		
		rh.add(new Pessoa("Ricardo","ricardo@rh.com"));
		rh.add(new Pessoa("Renata","renata@rh.com"));
		
		op.add(new Pessoa("Osvaldo","osvaldo@op.com"));
		op.add(new Pessoa("Olavo", "olavo@op.com"));
		
		ti.add(new Pessoa("Taeme","taeme@ti.com"));
		ti.add(new Pessoa("Tiago", "tiago@ti.com"));
		
		ArrayList<ArrayList<Pessoa>> empresa;
		empresa = new ArrayList<ArrayList<Pessoa>>();
		
		empresa.add(rh);
		empresa.add(op);
		empresa.add(ti);
		
		for (ArrayList<Pessoa> dep: empresa) {
			for (Pessoa p: dep) {
				System.out.println(p);
			}
		}
	}

}
