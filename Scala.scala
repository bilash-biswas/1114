import java.util.Scanner;
import scala.util.control.Breaks._
object Main {
  def main(args:Array[String]){ 
    val input = new Scanner(System.in)
    breakable  {
    while(true){
    var a=input.nextInt()
    if(a!=2002)
    {
        printf("Senha Invalida\n")
    }else{
    printf("Acesso Permitido\n")
    break
    }
    }
    }
}
}
 
