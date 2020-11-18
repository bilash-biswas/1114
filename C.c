#include<stdio.h>
int main()
{
    int a;
    bilash:
    scanf("%d",&a);
    while(a!=2002)
    {
        printf("Senha Invalida\n");
        goto bilash;
    }
    printf("Acesso Permitido\n");
    return 0;
}
