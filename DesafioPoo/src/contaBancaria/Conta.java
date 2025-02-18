package contaBancaria;
public class Conta {
    // Atributos
	private String agencia;
    private String numeroConta;
    private String titular;
    private double saldo;
    private double limite;

    // Construtor
    public Conta(String agencia, String numeroConta, String titular, double saldoInicial) {
    	this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
        calLimite(saldoInicial);
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
    	if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            
        }else if(valor > 0 && valor <= (saldo + limite) ){
        	saldo	-= valor;
        	limite += saldo;
            System.out.println("Saque de R$"+ valor + " realizado utilizando o Limite");
    	
        } else {
        	System.out.println("Saque não realizado saldo insuficiente !");
        }
    }

    // Método para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }

    // Método para exibir dados da conta
    public void exibirDados() {
    	System.out.println("Sua agencia: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite: R$" + limite);
    }

    // Getters e Setters (opcional, mas recomendado para boas práticas)
    public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
    
    
    public String getNumeroConta() {
        return numeroConta;
    }

	public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public double getLimite() {
    	return limite;
    }
    
    public void setLimite (double limite) {
    	this.limite = limite;
    }
    
    public double calLimite(double saldoInicial) {
    	if(saldoInicial <= 500) {
    		saldoInicial = 50;
    		setLimite(saldoInicial);
    	}else {
    		saldoInicial = saldoInicial * 0.50;
    		setLimite(saldoInicial);
    	}
    	return saldoInicial;
    }
    
    public void pagBoleto(String codigoBoleto, double valorBoleto) {
    	
    	String codigo = codigoBoleto;
    	double valor = valorBoleto;
    	
    	if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("O baleto no valor de código: " + valor + " foi pago com sucesso.");
            
        }else if(valor > 0 && valor <= (saldo + limite) ){
        	saldo	-= valor;
        	limite += saldo;
            System.out.println("O baleto no valor de : " + valor + " e o código: "+ codigo + "foi pago com sucesso. utilizando o Limite");
    	
        } else {
        	System.out.println("Saque não realizado saldo insuficiente !");
        }
    	
    }

}