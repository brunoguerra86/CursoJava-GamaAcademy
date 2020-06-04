
public class MainClass {

	public static void main(String[] args) {
		Produto p = new Produto(1,"Laranja",1f,10);
		
		try {
			p.setCodigo(-1);
			p.setDescricao("");
			p.setPreco(-1);
		}
		catch (IsiException e) {
			System.out.println("ISI ERRO | Mensagem: "+ e.getMessage());
		}
		catch (Exception e) {
			System.out.println("ERRO | Mensagem: "+ e.getMessage());
		}
		
		System.out.println(p);

	}

}
