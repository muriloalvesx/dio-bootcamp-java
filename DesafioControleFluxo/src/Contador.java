import java.util.Scanner;

public class Contador{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int NUM1, NUM2;
        System.out.println("Digite o primeiro número: ");
        NUM1 = in.nextInt();
        System.out.println("\nDigite o segundo número: ");
        NUM2 = in.nextInt();

        try{
                //chamando o método contendo a lógica de contagem
            contar(NUM1, NUM2);

        }   catch(ParametrosInvalidosException exception){
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");

        }
    }

    static void contar(int NUM1, int NUM2) throws ParametrosInvalidosException{
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(NUM1 > NUM2)
        throw new ParametrosInvalidosException();

        int contagem = NUM2 - NUM1;
            //realizar o for para imprimir os números com base na variável contagem
        for (int cont = 1; cont <= contagem; cont++)
        System.out.println("Imprimindo o número: " + cont);


    }
}