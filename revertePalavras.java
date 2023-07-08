import java.util.Scanner;

public class RevertePalavras {
    /**
     * Inverte a ordem das palavras
     * @param frase Frase que terá a ordem das palavras invertida
     */
    public static void revertePalavras(char[] frase) {
        // Armazena o tamanho da frase
        int tamanhoFrase = frase.length;
    
        // Inverte a frase
        int comeco = 0;
        int fim = tamanhoFrase - 1;
        while (comeco < fim) {
            char temporario = frase[comeco];
            frase[comeco] = frase[fim];
            frase[fim] = temporario;
            comeco++;
            fim--;
        }

        // Inverte as palavras na frase
        comeco = 0;
        while (comeco < tamanhoFrase) {
            // Ignora os espaços na frase
            while (comeco < tamanhoFrase && frase[comeco] == ' ') {
                comeco++;
            }

            // Encontra o fim da palavra
            fim = comeco;
            while (fim < tamanhoFrase && frase[fim] != ' ') {
                fim++;
            }

            // Inverte a palavra
            int comecoDaPalavra = comeco;
            int fimDaPalavra = fim - 1;
            while (comecoDaPalavra < fimDaPalavra) {
                char temporario2 = frase[comecoDaPalavra];
                frase[comecoDaPalavra] = frase[fimDaPalavra];
                frase[fimDaPalavra] = temporario2;
                comecoDaPalavra++;
                fimDaPalavra--;
            }
            
            comeco = fim;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();
        char[] sentence = input.toCharArray();

        // Remove a quebra de linha do final da frase
        int length = sentence.length;
        if (sentence[length - 1] == '\n') {
            sentence[length - 1] = '\0';
            length--;
        }

        // Inverte a ordem das palavras dentro da frase
        revertePalavras(sentence);

        System.out.println("Frase com palavras invertidas: " + new String(sentence, 0, length));
    }
}
