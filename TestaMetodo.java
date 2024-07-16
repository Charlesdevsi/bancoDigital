public class TestaMetodo {

        public static void main(String[] args) {
            Conta contaDoCliente = new Conta();
            contaDoCliente.saldo = 150;
            contaDoCliente.deposita(150); //obs para invocar o metodo se usa ();
            System.out.println(contaDoCliente.saldo);
            
            boolean conseguiuRetirar =contaDoCliente.saca(50);
            System.out.println(contaDoCliente.saldo);
            System.out.println(conseguiuRetirar);
            
            
            Conta contaDaMarcela = new Conta();
            contaDaMarcela.deposita(10000);
            
            
            if(contaDaMarcela.transfere(300, contaDoCliente)) {
            System.out.println("transferencia feita com sucesso");
            }else {
                System.out.println("faltou dinheiro");
            }
            System.out.println("saldo da conta do outro cliente " + contaDoCliente.saldo);
            System.out.println("saldo da conta da Marcela: " + contaDaMarcela.saldo);
        }
}
