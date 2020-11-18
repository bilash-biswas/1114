using System.IO;
using System;

class Program
{
    static void Main()
    {
    int a;
    bilash:
    a=Convert.ToInt32(Console.ReadLine());
    while(a!=2002)
    {
        Console.WriteLine("Senha Invalida");
        goto bilash;
    }
    Console.WriteLine("Acesso Permitido");
    }
}
