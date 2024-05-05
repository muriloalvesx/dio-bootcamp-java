import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    //TODO: Conhecer e importar a classe Scanner.
        Scanner in = new Scanner(System.in);

    //Exibir a mensagem de solicitação do Numero da conta para o nosso usuário.
        System.out.println("Por favor, digite o número da Conta !");
    //Obter pelo scanner os valores digitados no terminal.
        int Numero = in.nextInt();
    //Exibir a mensagem de solicitação do Numero da conta para o nosso usuário.
        System.out.println("Por favor, digite o número da Agência !");
    //Obter pelo scanner os valores digitados no terminal.
        String Agencia = in.next();
        in.nextLine();
        //Exibir a mensagem de solicitação do Numero da conta para o nosso usuário.
        System.out.println("Por favor, digite o nome do Cliente !");
    //Obter pelo scanner os valores digitados no terminal.
        String Nome = in.nextLine();
    //Exibir a mensagem de solicitação do Numero da conta para o nosso usuário.
        System.out.println("Por favor, digite o saldo da conta !");
    //Obter pelo scanner os valores digitados no terminal.
        in.useLocale(Locale.US);
        double Saldo = in.nextDouble();
        

    //Exibir a mensagem conta criada.
        System.out.println("Olá, " + Nome + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
