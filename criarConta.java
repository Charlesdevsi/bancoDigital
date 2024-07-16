public class criarConta {

        public static void main(String[] args) {
            //obs: o new serve para instanciar uma conta
             
            Conta primeiraConta = new Conta();
            Conta segundaConta = new Conta();
            primeiraConta.saldo = 200;
            segundaConta.saldo = 500;
            primeiraConta.saldo +=150;
            primeiraConta.saldo -=50;
            segundaConta.agencia = 142;
            primeiraConta.agencia = 310;
            
            
            System.out.println("segunda conta tem " + segundaConta.saldo);
            System.out.println("primeira conta tem" + primeiraConta.saldo);
            System.out.println("O número da agência é :" + primeiraConta.agencia);
            System.out.println( primeiraConta.numero);
            System.out.println("O número da agência é :" + segundaConta.agencia);
            
            if (primeiraConta.saldo == segundaConta.saldo) {
                System.out.println("voce ganhou um prêmio");
            }else {
                System.out.println("voce perdeu: ");
            }
            
            
            
            //obs parei no final do modulo 2
            // terminar este curso até sexta 19/11/2022
        }
    }
    

