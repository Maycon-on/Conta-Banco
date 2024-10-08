
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminalJava {
    public static void main(String[] args) {
        // Dado armazenado da conta
        Double saldo = 0.02;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite sua Agencia");
            String agencia = scanner.next();
    
        
            System.out.println("Digite sua conta");
            String contaBancaria = scanner.next();

        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco.");
        System.out.println("sua agência é " + agencia+", conta " + contaBancaria +
        " e seu saldo "+ saldo +" já está disponível para saque.");

    }
}
