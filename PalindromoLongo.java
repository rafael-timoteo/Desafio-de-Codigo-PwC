import java.util.Scanner;

public class PalindromoLongo {
    /**
     * Método auxiliar que retorna o tamanho da substring palíndroma
     * @param string A string que será processada;
     * @param esquerda A parte da string que será decrementada para pegar os elementos da esquerda;
     * @param direita A parte da string que será incrementada para pegar os elementos da direita;
     */ 
        private static int expandeString(String string, int esquerda, int direita) {
        int tamanhoString = string.length();

        // Expande a substring
        while (esquerda >= 0 && direita < tamanhoString && string.charAt(esquerda) == string.charAt(direita)) {
            esquerda--;
            direita++;
        }

        // Retorna o tamanho da substring palíndroma encontrada
        return direita - esquerda - 1;
    }

    /**
     * Método para encontrar o maior palíndromo
     * @param string A string que será processada.
     */ 
        private static String palindromoLongo(String string) {
        int tamanhoString = string.length();

        if (tamanhoString < 2) {
            // Se a string é vazia ou tem apenas um caractere, é palíndroma.
            return string;
        }

        int comecoDaSubstring = 0; // Indice de início da substring palíndroma mais longa 
        int tamanhoSubstring = 0; // Comprimento da substring palíndroma mais longa     

        for (int i = 0; i < tamanhoString; i++) {
            // Encontra uma substring palíndroma ímpar
            int tamanho1 = expandeString(string, i, i);
            // Encontra uma substring palíndroma par
            int tamanho2 = expandeString(string, i, i + 1);

            // Atualiza o índice de início e o comprimento da substring palíndroma mais longa
            int len = Math.max(tamanho1, tamanho2);
            if (len > tamanhoSubstring) {
                tamanhoSubstring = len;
                comecoDaSubstring = i - (len - 1) / 2;
            }
        }

        // Retorna a substring palíndroma mais longa
        return string.substring(comecoDaSubstring, comecoDaSubstring + tamanhoSubstring);
    }

    /*
    *public static void main(String[] args) {
    *    Scanner scanner = new Scanner(System.in);
    *    System.out.print("Digite uma string: ");
    *    String str = scanner.nextLine();
    *
    *    // Remove a quebra de linha do final da string
    *    if (str.endsWith("\n")) {
    *        str = str.substring(0, str.length() - 1);
    *    }
    *
    *    // Encontra a substring palíndroma mais longa
    *    String longestPalindrome = palindromoLongo(str);
    *
    *    System.out.println("Substring palíndroma mais longa: " + longestPalindrome);
    *}
    */ 
}

