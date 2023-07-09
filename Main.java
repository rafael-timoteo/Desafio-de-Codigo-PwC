public class Main {
    public static void main(String[] args) {
        // Teste da classe RevertePalavras
        char[] frase = "Hello, world! OpenAI is amazing.".toCharArray();
        RevertePalavras.revertePalavras(frase);
        System.out.println("Frase invertida: " + String.valueOf(frase));

        // Teste da classe CaractereDuplicado
        char[] string = "Hello World!".toCharArray();
        CaractereDuplicado.caractereDuplicado(string);
        System.out.println("String sem caracteres duplicados: " + String.valueOf(string));

        // Teste da classe PalindromoLongo
        String palavra = "babad";
        String palindromo = PalindromoLongo.palindromoLongo(palavra);
        System.out.println("Maior palíndromo encontrado: " + palindromo);
    }
}
