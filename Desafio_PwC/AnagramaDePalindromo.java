public class AnagramaDePalindromo {
    /**
     * Verifica se uma string é um anagrama de um palíndromo.
     * @param string A string a ser processada.
     */    
    public static boolean anagramaDePalindromo(String string) {
        // Remove os espaços entre as palavras da string e converte os caracteres para minusculo
        String novaString = string.replaceAll("\\s+", "").toLowerCase();
        int tamanhoString = novaString.length();
        int[] contaLetra = new int[26]; // Array para contar a ocorrência de cada letra (do alfabeto)
        int contaImpar = 0; // Contador para o número de letras com contagem ímpar

        // Contagem de cada letra na string
        for (int contador = 0; contador < tamanhoString; contador++) {
            // Recebe os caracteres da string
            char caractere = novaString.charAt(contador);
            if (caractere >= 'a' && caractere <= 'z') {
                contaLetra[caractere - 'a']++;
            }
        }

        // Verifica se há mais de uma letra com contagem ímpar
        for (int contador = 0; contador < 26; contador++) {
            // Verifica se é ímpar
            if (contaLetra[contador] % 2 != 0) {
                contaImpar++;
                if (contaImpar > 1) {
                    return false; // Não é um anagrama de um palíndromo
                }
            }
        }

        return true; // É um anagrama de um palíndromo
    }
}
