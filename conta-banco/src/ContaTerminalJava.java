
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminalJava {
    public static void main(String[] args) {
        Double saldo = 0.02;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua Agencia");
        String agencia = scanner.next();
    
        
        System.out.println("Digite sua conta");
        String conta = scanner.next();

        


    }
}
