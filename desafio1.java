
import java.util.ArrayList;
import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número: ");

        //ler entrada
        int number = scanner.nextInt();
        
        //gerar a sequencia ate o numero inserido
        ArrayList<Integer> fSequencia = geradorDaSequencia(number);
        
        //verifica se o numero escolhido faz parte da sequencia e imprime a mensagem informando
        if (fSequencia.contains(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
    
// incia a sequencia com o valores 0 e 1
    public static ArrayList<Integer> geradorDaSequencia(int n) {
        ArrayList<Integer> fSequencia = new ArrayList<>();
        fSequencia.add(0);
        fSequencia.add(1);

        //calcula os proximos valores da sequencia ate ser maior que n
        while (true) {
            int nextValue = fSequencia.get(fSequencia.size() - 1) + fSequencia.get(fSequencia.size() - 2);
            if (nextValue > n) {
                break;
            }
            fSequencia.add(nextValue);
        }
    
        return fSequencia;
    }
}