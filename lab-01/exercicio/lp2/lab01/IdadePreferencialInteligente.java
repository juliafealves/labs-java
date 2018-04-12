package lp2.lab01;
/**
 * UFCG - Laboratório de Programção II - Lab. I
 * @author Júlia Fernandes Alves - Matrícula. <julia.alves@ccc.ufcg.edu.br>
 */
public class IdadePreferencialInteligente
{
    public static void main(String[] args)
    {
        int idade = 2018 - 1985;
        int criancasColo = 0;
        boolean gravida = false;

        if(idade >= 60){
            System.out.println("Preferencial Idoso: Você tem " + idade + " anos. Você pode usar o atendimento especial.");
        else if(gravida)
            System.out.println("Preferencial Gestante. Você pode usar o atendimento especial.");
        else if(criancasColo > 0){
            System.out.println("Preferencial pois está com " + criancasColo + " crianças de colo.");            
        }else{
            System.out.println("Você tem " + idade + " anos. Você não pode ainda usar o atendimento especial.");
        }
    }
}