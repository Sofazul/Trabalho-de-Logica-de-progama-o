#include <stdio.h>
#include <stdlib.h>

int main(){
    int velocidadeMax, velocidadeMot, taxa = 5, velocidadeAcima, multa;

    printf("Digite a velocidade maxima da via: ");
    scanf("%d", &velocidadeMax);

    printf("Digite a velocidade do motorista: ");
    scanf("%d", &velocidadeMot);

    velocidadeAcima = velocidadeMot - velocidadeMax;
    multa = velocidadeAcima * taxa;

    if (multa > 0){
        printf("Velocidade acima do limite, multa aplicada de %d reais", multa);
    }else{
        printf("Velocidade dentro do limite, nao ha multa");
    }

    return 0;
}
