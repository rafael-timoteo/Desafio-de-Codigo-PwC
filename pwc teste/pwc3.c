#include <stdio.h>
#include <string.h>
#include <stdlib.h>

// Função auxiliar para expandir uma substring palíndroma centrada em um ponto específico
int expandFromCenter(char* str, int left, int right) {
    int length = strlen(str);

    // Expande a substring enquanto os caracteres à esquerda e à direita são iguais
    while (left >= 0 && right < length && str[left] == str[right]) {
        left--;
        right++;
    }

    // Retorna o tamanho da substring palíndroma encontrada
    return right - left - 1;
}

// Função principal para encontrar a substring palíndroma mais longa
char* longestPalindromeSubstring(char* str) {
    int length = strlen(str);

    if (length < 2) {
        // A string é vazia ou tem apenas um caractere, portanto, é palíndroma
        return str;
    }

    int start = 0; // Índice de início da substring palíndroma mais longa
    int maxLength = 0; // Comprimento da substring palíndroma mais longa

    for (int i = 0; i < length; i++) {
        // Expande em torno do caractere atual para encontrar uma substring palíndroma ímpar
        int len1 = expandFromCenter(str, i, i);
        // Expande em torno dos caracteres atuais e seguintes para encontrar uma substring palíndroma par
        int len2 = expandFromCenter(str, i, i + 1);

        // Atualiza o índice de início e o comprimento da substring palíndroma mais longa
        int len = len1 > len2 ? len1 : len2;
        if (len > maxLength) {
            maxLength = len;
            start = i - (len - 1) / 2;
        }
    }

    // Cria uma nova string para armazenar a substring palíndroma encontrada
    char* result = (char*)malloc((maxLength + 1) * sizeof(char));
    strncpy(result, str + start, maxLength);
    result[maxLength] = '\0';

    return result;
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

    // Encontra a substring palíndroma mais longa
    char* longestPalindrome = longestPalindromeSubstring(str);

    printf("Substring palíndroma mais longa: %s\n", longestPalindrome);

    // Libera a memória alocada para a substring palíndroma
    free(longestPalindrome);

    return 0;
}
