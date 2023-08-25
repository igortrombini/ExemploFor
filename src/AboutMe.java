import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome ");
        String nome = scanner.next();

        System.out.println("Digite o Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("qual a sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo" +nome.toUpperCase() +" " +sobrenome);
        System.out.println("Tenho" +idade+"Anos");
        
        System.out.println("minha altura é " +altura+"cm");
        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("os campos idade e altura precisam ser numericos");
        }

    }
}
