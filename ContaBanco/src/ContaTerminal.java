import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO Conheçer e importar a classe scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem de conta criada
        Scanner scanner = new Scanner(System.in);
        int Numero;
        String Agencia;
        String NomeCliente;
        double saldo = 0;
        String loading = " ..:: BRADESCO DIO BANK ::..";

        System.out.println("Iniciando o Caixa Eletrônico BRADESCO DIO Bank");
        
        for (char caractere : loading.toCharArray()){
            System.out.print(caractere);
            try{
                Thread.sleep(75);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }

        System.out.println("\nPor favor, digite seu Nome e sobremnome !");
        NomeCliente = scanner.nextLine();

        System.out.println("\nBem Vindo " + NomeCliente);
        System.out.println("Por favor, digite o número da Agência !");
        Agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        Numero = scanner.nextInt();

        System.out.println("Por favor, digite o Saldo depositado !");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+ NomeCliente +", obrigado por criar uma conta em nosso "+
        "banco, sua agência é "+ Agencia +", conta "+ Numero +" e seu saldo "+ saldo +" já está disponível para saque");
        scanner.close();
        
    }
}
