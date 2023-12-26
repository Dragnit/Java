import java.util.Scanner;

public class formulaResolvente 
{
    public static void main(String [] args)
    {
        do
        {
            //pedir dados
            int coefA = pedirCoeficiente("A");
            int coefB = pedirCoeficiente("B");
            int coefC = pedirCoeficiente("C");
    
            //aplicaar a formula resolvente
            double factor1 = formulaResolvente(coefA, coefB, coefC, true);
            double factor2 = formulaResolvente(coefA, coefB, coefC, false);
    
            //apresentar resultado
            apresentaResultados(factor1,factor2);

        }while( continuar());

        sair();

    }


    //para evitar repetir codigo criamos um metodo
    //metodo é igual a uma função em C

    static int pedirCoeficiente(String coefA)
    {
        // mensagem ao utilizador
        System.out.println("insira o numero de a"+coefA+":");
        //criamos o acesso ao teclado
        Scanner teclado = new Scanner(System.in);  
        //ler teclado e devolver
        return teclado.nextInt();

        //return (new Scanner (System.in)).nextInt(); esta linha pode substituir as duas de cima
    }

    static double formulaResolvente(int coefA, int coefB, int coefC, boolean sinal)
    {
        double factor = 0;

        //calculo
        double delta = Math.sqrt(coefB * coefB - 4 * coefC);

        if(sinal == false)
        {
            delta = - delta;
        }

        if (coefA != 0)
        {
            factor = (coefA + delta) / 2*coefA; 
        }

        return factor;
    }

    static void apresentaResultados(double factor1, double factor2)
    {
        System.out.println("Factor 1 = "+factor1+" Factor 2 = "+factor2+"");
    }

    static boolean continuar()
    {
        System.out.println("Deseja cotinuar?: [S//N]");
        Scanner teclado = new Scanner(System.in);
        String opcao = teclado.next();

        if(opcao.equalsIgnoreCase("S"))
            return true;
        return false;

        /*este if poderia ser substituido pelos seguintes 
            1o return opcao.equalsIgnoreCase("S");
            2o return teclado.next().equalsIgnoreCase("S");
            3o return (new Scanner (System.in)).next().equalsIgnoreCase("S")
        */
    }

    static void sair()
    {
        System.out.println("A terminar...");
        System.exit(0);
    }
}
