#include <stdio.h>
#include <stdlib.h>

int main(){
    float nota1, nota2, media = 0, exameFinal = 0;

    printf("Digite a nota 1 do aluno: ");
    scanf("%f", &nota1);
    printf("Digite a nota 2 do aluno: ");
    scanf("%f", &nota2);

    media = (nota1 + nota2)/2;

    if (media >= 70){
        printf("Aluno aprovado com media de %2.2f", media);
    }else if (media >= 40){
        printf("Aluno em exame final com media de %2.2f\n", media);
        printf("Digite a nota do exame final: ");
        scanf("%f", &exameFinal);
        if (exameFinal + media >= 100){
            printf("Aluno aprovado com nota final %2.2f", exameFinal+media);
        }else{
            printf("Aluno reprovado com nota final de %2.2f", exameFinal+media);
        }
    }else{
        printf("Aluno reprovado com media de %2.2f", media);
    }

    return 0;
}