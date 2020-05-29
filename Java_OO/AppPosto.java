public class AppPosto {
    public static void main(String args[]){
        Bomba b1 = new Bomba("Gasolina", 5);
        Bomba b2 = new Bomba("Alcool", 3);
        Bomba b3 = new Bomba("Diesel", 1);

        b1.setDisponivel(true);
        b1.abasteceLitros(10);
        b1.resumoAbastecimento();

        b2.setDisponivel(true);
        b2.abasteceValor(90);
        b2.resumoAbastecimento();

        b3.abasteceValor(90);
        b3.resumoAbastecimento();
    }
}