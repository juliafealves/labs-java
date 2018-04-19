/**
 * UFCG - Laboratório de Programção II - Lab. I
 * @author Júlia Fernandes Alves - 117211383. <julia.alves@ccc.ufcg.edu.br>
 */
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Object.ArrayUtils;

public class FuncaoMonotona
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        
        for(int i = 0; i < 4; i++){
            numeros[i] = scanner.nextInt();
        }

        System.out.println(verificarCrescente(numeros));
        System.out.println(verificarDecrescente(numeros));
        System.out.println(Arrays.toString(numeros));
    }

    private static boolean verificarCrescente(int[] numeros){
        int[] crescente = new int[4];
        System.arraycopy(numeros, 0, crescente, 0, 4);
        Arrays.sort(crescente);

        return Arrays.equals(crescente, numeros);
    }

    private static boolean verificarDecrescente(int[] numeros){
        int[] decrescente = new int[4];
        System.arraycopy(numeros, 0, decrescente, 0, 4);
        ArrayUtils.reverse(decrescente);

        return Arrays.equals(decrescente, numeros);
    }
}
