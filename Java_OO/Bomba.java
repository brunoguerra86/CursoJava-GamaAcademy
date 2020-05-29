public class Bomba {
    private String combustivel;
    private double valorLitro;
    private double qtdLitros;
    private double valorTotal;
    private boolean disponivel;

    public Bomba(String combustivel, double valorLitro){
        this.combustivel = combustivel;
        this.valorLitro = valorLitro;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean abasteceLitros(double qtdLitros){
        if( disponivel ){
            this.qtdLitros = qtdLitros;
            valorTotal = qtdLitros * valorLitro;
            return true;
        }
        else
            return false;
    }

    public boolean abasteceValor(double valorTotal){
        if( disponivel ){
            this.valorTotal = valorTotal;
            qtdLitros = valorTotal / valorLitro;
            return true;
        }
        else
            return false;
    }

    public void resumoAbastecimento(){
        if (disponivel){
            System.out.println("+------------------------------+");
            System.out.printf("|%-30s|\n",combustivel);
            System.out.printf("|  Valor (litro)    %.2f       |\n", valorLitro);
            System.out.printf("|  Qtde Abastecida %.2f       |\n", qtdLitros);
            System.out.println("+------------------------------+");
            System.out.printf("|  Total R$:       %.2f       |\n", valorTotal);
            System.out.println("+------------------------------+");
        }
        else{
            System.out.println("+------------------------------+");
            System.out.println("+ BOMBA INDISPONIVEL           +");
            System.out.println("+------------------------------+");
        }

    }
}