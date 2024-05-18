import java.util.Scanner;

public class ControleSaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // TODO: Crie um loop 'for' para iterar sobre os saques:
        for(double i=0;i<limiteDiario;i++){
            // TODO: Solicite ao usuário o valor do saque:
            double saque = scanner.nextDouble();
            // TODO: Verifique se o valor do saque é zero, encerrando as transações:
            // Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario:
            if(saque == 0){
                System.out.println("Transações finalizadas.");
                i = limiteDiario;
            // TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            }else if(saque > limiteDiario){
                System.out.println("Atingido limite diario de saque. Transacoes encerradas.");
                i = limiteDiario;
            }else{
                // TODO: Informe que o saque foi realizado e mostre o limite restante:
                limiteDiario -= saque;
                System.out.println("Saque efetuado. Limite restante: " + limiteDiario);
            }
        }

        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}