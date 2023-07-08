#include <stdio.h>
#include <string.h>

void reverseWords(char* sentence) {
    // Calcula o tamanho da sentença
    int length = strlen(sentence);
  
    // Inverte a ordem das palavras
    int start = 0;
    int end = length - 1;
  
    // Inverte a frase completa
    while (start < end) {
        char temp = sentence[start];
        sentence[start] = sentence[end];
        sentence[end] = temp;
        start++;
        end--;
    }
  
    // Inverte cada palavra individualmente
    start = 0;
    while (start < length) {
        // Ignora espaços em branco no início da palavra
        while (start < length && sentence[start] == ' ') {
            start++;
        }
      
        // Encontra o fim da palavra
        end = start;
        while (end < length && sentence[end] != ' ') {
            end++;
        }
      
        // Inverte a palavra
        int wordStart = start;
        int wordEnd = end - 1;
        while (wordStart < wordEnd) {
            char temp = sentence[wordStart];
            sentence[wordStart] = sentence[wordEnd];
            sentence[wordEnd] = temp;
            wordStart++;
            wordEnd--;
        }
      
        start = end;
    }
}

int main() {
    char sentence[1000];
    printf("Digite uma frase: ");
    fgets(sentence, sizeof(sentence), stdin);
  
    // Remove a quebra de linha do final da frase
    int length = strlen(sentence);
    if (sentence[length - 1] == '\n') {
        sentence[length - 1] = '\0';
    }
  
    // Inverte a ordem das palavras dentro da frase
    reverseWords(sentence);
  
    printf("Frase com palavras invertidas: %s\n", sentence);
  
    return 0;
}
