
import java.util.Scanner;

public class VerificaNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Leia a entrada do usuário como uma string representando o número da conta:
        String conta = scanner.nextLine();

        // TODO: Inicialize um bloco try-catch para capturar exceções:
        try{
        // TODO: Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(conta);
        // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage()); // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static boolean verificarNumeroConta(String numeroConta) {
        // TODO: Verifique se o número da conta tem exatamente 8 dígitos:
        if(numeroConta.length() != 8){
            // TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }else{
            // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");
            return true;
        }
    }
}
