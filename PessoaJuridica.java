package entities;

public class PessoaJuridica extends Imposto {
	private Integer numFuncionarios;
	public PessoaJuridica(){
		super();
		
	}
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	@Override
	public double calcularImposto() {
		if(numFuncionarios<10) {
			return getRendaAnual()*16/100;
		}
		else {
			return getRendaAnual()*14/100;
		}
	}
	
}
