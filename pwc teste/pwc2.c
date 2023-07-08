#include <stdio.h>
#include <string.h>

/**
 * Remove todos os caracteres duplicados de uma string.
 * @param str A string a ser processada.
 */
void removeDuplicates(char* str) {
    int length = strlen(str);
    int tail = 1;

    for (int i = 1; i < length; ++i) {
        int j;
        for (j = 0; j < tail; ++j) {
            if (str[i] == str[j]) {
                break;
            }
        }
        if (j == tail) {
            // Caractere não encontrado, adiciona à parte única da string
            str[tail] = str[i];
            ++tail;
        }
    }

    // Adiciona o caractere nulo para indicar o fim da string resultante
    str[tail] = '\0';
}

int main() {
    char str[1000];

    printf("Digite uma string: ");
    fgets(str, sizeof(str), stdin);

    // Remove a quebra de linha do final da string
    int length = strlen(str);
    if (str[length - 1] == '\n') {
        str[length - 1] = '\0';
    }

    // Remove os caracteres duplicados
    removeDuplicates(str);

    printf("String sem caracteres duplicados: %s\n", str);

    return 0;
}
