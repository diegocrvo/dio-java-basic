import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Obter pela scanner os valores digitados no terminal
        System.out.println("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Digite o número da Agência: ");
        String numeroAgencia = scanner.next();

        scanner.nextLine();
        
        System.out.println("Digite seu Nome Completo: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu Saldo: ");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada 
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, numeroAgencia, numeroConta, saldo);

        System.out.println(mensagem);

        scanner.close();
    }
}
