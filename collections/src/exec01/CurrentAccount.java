package exec01;

public class CurrentAccount implements Comparable<CurrentAccount>{
	private double saldo;
	private String nome;
	private String rg;
	
	
	public CurrentAccount(Double saldo, String nome, String rg) {
        this.saldo = saldo;
        this.nome = nome;
        this.rg = rg;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getRg() {
		return this.rg;
    }

    public void setRg (String rg) {
        this.rg = rg;
    }

	public double getSaldo() {
      	return this.saldo;
	}

	public void setDeposit(double deposit) {
	    this.saldo += deposit;
	}

	public void getInfos() {
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.rg);
		System.out.println("Saldo: " + this.saldo);
	}
	
	@Override
	public int compareTo(CurrentAccount otherAccount) {
		return this.nome.compareTo(otherAccount.getNome());
	}	
}
