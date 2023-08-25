import java.util.Scanner;

public class Saque {
    public static void main(String[] args){ 

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite o saldo total");
        int saldoTotal = scanner.nextInt();

        System.out.println("Digite o valor do saque");
        int valorSaque = scanner.nextInt();
    

        fazerSaque(saldoTotal,valorSaque);

        scanner.close();
    }

        //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.


        public static void fazerSaque(int saldoDisponivel, int valorSaque){
        if(saldoDisponivel >= valorSaque){
        saldoDisponivel -= valorSaque;
        System.out.println("Saque realizado com sucesso! Novo Saldo : "+saldoDisponivel);
        }else{
        System.out.println("Saldo Insuficiente. Saque nao realizado");
        }
    }
    }