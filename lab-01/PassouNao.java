/**
 * UFCG - Laboratório de Programção II - Lab. I
 * @author Júlia Fernandes Alves - 117211383. <julia.alves@ccc.ufcg.edu.br>
 */
import java.util.Scanner;

public class PassouNao
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double numero1 = scanner.nextFloat();
        double numero2 = scanner.nextFloat();
        double media = (numero1 + numero2) / 2;

        if(media >= 7){
            System.out.println("pass: True!");
        }else{
            System.out.println("pass: False!");
        }
    }
}