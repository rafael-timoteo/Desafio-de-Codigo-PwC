#include <stdio.h>
#include <string.h>

// Função para verificar se uma string é um anagrama de um palíndromo
int isAnagramOfPalindrome(char* str) {
    int length = strlen(str);
    int count[26] = {0}; // Array para contar a ocorrência de cada letra (assumindo letras minúsculas)

    // Conta a ocorrência de cada letra na string
    for (int i = 0; i < length; i++) {
        if (str[i] >= 'a' && str[i] <= 'z') {
            count[str[i] - 'a']++;
        }
    }

    int oddCount = 0; // Contador para o número de letras com contagem ímpar

    // Verifica se há mais de uma letra com contagem ímpar
    for (int i = 0; i < 26; i++) {
        if (count[i] % 2 != 0) {
            oddCount++;
            if (oddCount > 1) {
                return 0; // Não é um anagrama de um palíndromo
            }
        }
    }

    return 1; // É um anagrama de um palíndromo
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

    // Verifica se a string é um anagrama de um palíndromo
    int isAnagramPalindrome = isAnagramOfPalindrome(str);

    // Imprime o resultado
    if (isAnagramPalindrome) {
        printf("A string é um anagrama de um palíndromo (true)\n");
    } else {
        printf("A string não é um anagrama de um palíndromo (false)\n");
    }

    return 0;
}
