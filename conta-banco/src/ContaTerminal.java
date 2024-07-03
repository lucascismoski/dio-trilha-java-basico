import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());
        
        System.out.println("Por favor, digite o número da Agência!");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Por favor, digite a Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente!");
        String clienteNome = scanner.next();
        
        BigDecimal saldo;
        try {
            System.out.println("Por favor, digite o saldo!");
            saldo = scanner.nextBigDecimal();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            
            System.out.println("Tente novamente, dessa vez com vírgula!");
            saldo = scanner.nextBigDecimal();
        }
        

        System.out.println("Olá "+clienteNome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroAgencia+" e seu saldo "+saldo+" já está disponível para saque.");       
    }
}
