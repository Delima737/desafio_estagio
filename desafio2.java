

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");

        //solicita a entrada de uma frase
        String input = scanner.nextLine();

        //metodo para contar quantas vezes a letra 'a/A' aparece
        int count = contarLetraA(input);
        
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }
        
        scanner.close();
    }

    //analisa a string como argumento e usa loop para olhar cada caractere da string
    public static int contarLetraA(String str) {
        //iniciamos o contador
        int count = 0;

        //adiciona ao contador a cada 'a/A' encontrado
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }
        return count;
    }
}
