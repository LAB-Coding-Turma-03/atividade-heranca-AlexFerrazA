package br.com.impacta.lab;
public class Conta {
    public int numero;
    public int agencia;
    public String tipo;



    public Conta(int n,int ag,String tp){
        super();
        this.numero = n;
        this.agencia = ag;
        this.tipo = tp;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

    public String montarResumoDaConta(){
        return "Numero: " + this.getNumero() + 
		" - Agencia: " + this.getAgencia() +
		" - Tipo: " + this.getTipo();
    }

}