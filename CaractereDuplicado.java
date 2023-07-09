public class CaractereDuplicado {
    /**
     * Remove todos os caracteres duplicados de uma string.
     * @param string A string a ser processada.
     */    
    public static void caractereDuplicado(char[] string) {
        int tamanhoString = string.length;
        int duplicata = 0;
        int contador;

        for (contador = 0; contador < tamanhoString; contador++) {
            int contador2;
            for (contador2 = 0; contador2 < duplicata; contador2++) {
                if (string[contador] == string[contador2]) {
                    break;
                }
            }
            if (contador2 == duplicata) {
                string[duplicata] = string[contador];
                duplicata++;
            }
        }

        // Preenche o restante da string com espaços em branco
        for (contador = duplicata; contador < tamanhoString; contador++) {
            string[contador] = ' ';
        }
    }
}
