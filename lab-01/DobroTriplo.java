/**
 * UFCG - Laboratório de Programção II - Lab. I
 * @author Júlia Fernandes Alves - 117211383. <julia.alves@ccc.ufcg.edu.br>
 */
import java.util.Scanner;

public class DobroTriplo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int dobro = numero * 2;
        int triplo = numero * 3;

        System.out.println("dobro: " + dobro + ", triplo: " + triplo);
    }
}