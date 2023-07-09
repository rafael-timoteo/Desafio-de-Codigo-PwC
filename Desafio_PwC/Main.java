public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        
        // Teste da classe RevertePalavras
        char[] frase = "Hello, world! OpenAI is amazing.".toCharArray();
        RevertePalavras.revertePalavras(frase);
        System.out.println("Frase invertida: " + String.valueOf(frase));
        System.out.println("\n");

        // Teste da classe CaractereDuplicado
        char[] string = "Hello World!".toCharArray();
        CaractereDuplicado.caractereDuplicado(string);
        System.out.println("String sem caracteres duplicados: " + String.valueOf(string));
        System.out.println("\n");

        // Teste da classe PalindromoLongo
        String palavra = "babad";
        String palindromo = PalindromoLongo.palindromoLongo(palavra);
        System.out.println("Maior palindromo encontrado: " + palindromo);
        System.out.println("\n");

        // Teste da classe LetraMaiuscula
        char[] frase2 = "hello. how are you? i'm fine, thank you.".toCharArray();
        LetraMaiuscula.letraMaiuscula(frase2);
        System.out.println("String com a primeira letra de cada palavra em maiuscula: " + String.valueOf(frase2));
        System.out.println("\n");

        // Teste da classe AnagramaDePalindromo
        String string2 = "racecar";
        boolean isAnagramPalindrome = AnagramaDePalindromo.anagramaDePalindromo(string2);
        System.out.println("Verifica se uma string e um anagrama de um palindromo: ");
        System.out.println(string2 + ": " + isAnagramPalindrome);
        System.out.println();
    }
}
