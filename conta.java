class Conta {
	double saldo;
	int agencia ;
	int numero;
	String titular;
	//obs: modulo 4.

	void deposita(double valor) {
		// o void 
		
		this.saldo =  + valor;// this é uma referencia para algum objeto.
	}
	 public boolean saca(double valor) {
		 if (this.saldo >= valor) {
			 this.saldo =  - valor;
			 return true;
		 }else {
			 return false;
		 }
		 
		 }
	 public boolean transfere(double valor, Conta destino) {
		 
		 if (this.saldo >= valor) {
			 this.saldo -= valor;
			 destino.deposita(valor);
			 return true;
		 }else {
			 return false;
		 }
		 }
	 }
	 
