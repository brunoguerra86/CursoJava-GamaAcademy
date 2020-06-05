package br.com.professorisidro.folha.model;

public class GerenteDeVendas extends Comissionado {
    protected float bonusComissao;
    
    public GerenteDeVendas(int id, String nome, float salario, float comissao, float bonus) {
    	super(id, nome, salario, comissao);
    	this.bonusComissao = bonus;
    }

	public float getBonusComissao() {
		return bonusComissao;
	}

	public void setBonusComissao(float bonusComissao) {
		this.bonusComissao = bonusComissao;
	}
    
    public float calcularSalario() {
    	return super.salario + super.salario*0.10f + super.comissao*0.15f + bonusComissao*0.05f;
    }
}
