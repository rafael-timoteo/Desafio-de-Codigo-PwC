public class LetraMaiuscula {
    /**
     * Transforma todas as primeiras letras de palavras em maiuscula.
     * @param string A string a ser processada.
     */
    public static void letraMaiuscula(char[] string) {    
        int tamanhoString = string.length;
        boolean proximaLetra = true;

        for (int contador = 0; contador < tamanhoString; contador++) {
            if (proximaLetra && Character.isLetter(string[contador])) {
                // Transforma a letra para maiúscula
                string[contador] = Character.toUpperCase(string[contador]);
                proximaLetra = false;
            } else if (string[contador] == ' ') {
                // Define a variável "proximaLetra" como verdadeira quando encontrar os caracteres ".", "!" ou "?"
                proximaLetra = true;
            }
        }
    }
}
