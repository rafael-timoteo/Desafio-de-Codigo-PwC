#include <stdio.h>
#include <string.h>
#include <ctype.h>

void capitalizeFirstLetter(char* str) {
    int length = strlen(str);
    int capitalizeNext = 1; // Variável para controlar quando a próxima letra deve ser capitalizada

    for (int i = 0; i < length; i++) {
        if (capitalizeNext && isalpha(str[i])) {
            // Converte a letra para maiúscula se necessário
            str[i] = toupper(str[i]);
            capitalizeNext = 0;
        } else if (str[i] == ' ') {
            // Define a variável "capitalizeNext" como verdadeira quando encontrar os caracteres ".", "!" ou "?"
            capitalizeNext = 1;
        }
    }
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

    // Coloca em maiúscula a primeira letra de cada frase
    capitalizeFirstLetter(str);

    printf("String com a primeira letra de cada frase em maiúscula: %s\n", str);

    return 0;
}
