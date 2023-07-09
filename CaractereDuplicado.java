import java.util.Scanner;

public class CaractereDuplicado {
    /**
     * Remove todos os caracteres duplicados de uma string.
     * @param str A string a ser processada.
     */    
    public static void caractereDuplicado(char[] string) {
        int tamanhoString = string.length;
        int duplicata = 1;

        for(int contador = 1; contador < tamanhoString; contador++) {
            int contador2;
            for(contador2 = 0; contador2 < duplicata; contador2++) { // Corrigido o contador
                if (string[contador] == string[contador2]) {
                    break;
                }
            }
            if(contador2 == duplicata) {
                string[duplicata] = string[contador];
                duplicata++;
            }
        }
        // Indica o fim da string resultante
        string[duplicata] = '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        char[] string = input.toCharArray();

        caractereDuplicado(string);

        System.out.print("String sem caracteres duplicados: ");
        for (int i = 0; i < string.length; i++) {
            if (string[i] == '\0') {
                break;
            }
            System.out.print(string[i]);
        }
        System.out.println();
    }
}
