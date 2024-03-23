package entities;

public class PessoaFisica extends Imposto {
	private double gastoSaude;
	public PessoaFisica(){
		super();
	}
	public PessoaFisica(String nome, Double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	public double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	@Override
	public double calcularImposto() {
		if(getRendaAnual()<2000) {
			return (getRendaAnual() * 15/100) - (gastoSaude *50/100);
			
		}
		else {
			return (getRendaAnual() * 25/100) - (gastoSaude *50/100);
		}
		
	}
	
}
