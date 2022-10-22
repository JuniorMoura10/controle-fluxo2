import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try{
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu nome: ");
        String sobrenome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha atura é de " + altura + "m");

        sc.close();
        }
        catch(InputMismatchException e){
            System.err.println("Os campos idade e altura devem ser numéricos!");
        }
    }
}
