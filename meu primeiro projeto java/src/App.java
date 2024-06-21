package dio_conta_bancaria

import java.utill.scanner;

    public class ContaTerminal {

        public static void main(string[]args) {

            scanner sc = new scanner(system.in);
            int numero;
            string agencia;
            string nomeCliente;
            double saldo:

            system.out.println("----------- Conta Bancaria----------");
            system.out.println();
            system.out.println("Por favor, digitar o número da conta: (1234)");
            numero = sc.nextInt();

            system.out.println("Digite o número da Agência: (123-8)");
            agencia = sc.next();

            system.out.println("Informe seu nome");
            nomeCliente = sc.next();
            sc.nextline();

            system.out.println("Me informe seu saldo atual: ");
            saldo = sc.nextDouble();

            system.out.println();
            system.out.println("Ola %s, obrigado por criar sua conta em "
            + "nosso banco, sua agencia é %s,"
            + "conta %d e seu saldo %.2f já esta disponivel"
            + "para saque.", nomeCliente, agencia, numero,saldo);

            sc.close();
     }