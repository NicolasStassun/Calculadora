import java.util.Scanner;

public class Ex1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for (int calculadora = 1; calculadora != 0;calculadora=calculadora){
            System.out.println("Informe a operação desejada: \n" +
                    "1 - Soma \n" +
                    "2 - Subtração \n" +
                    "3 - Divisão \n" +
                    "4 - Multiplicação \n" +
                    "0 - Sair \n");
            calculadora = sc.nextInt();


            switch(calculadora){

                case 1:

                    soma();

                    break;

                case 2:

                    subtracao();

                    break;

                case 3:
                    divisao();

                    break;

                case 4:

                    multiplicacao();

                    break;
            }
        }
    }
    public static void soma(){

        double x=0.0,y=0.0,z=0.0;

        System.out.println("Informe o primeiro número: ");
        x = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        y = sc.nextDouble();

        z=x+y;

        System.out.println(x+" + "+y+" = "+z);
    }
    public static void subtracao(){

        double x=0.0,y=0.0,z=0.0;

        System.out.println("Informe o primeiro número: ");
        x = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        y = sc.nextDouble();

        z=x-y;

        System.out.println(x+" - "+y+" = "+z);

    }
    public static void divisao(){

        double x=0.0,y=0.0,z=0.0;

        System.out.println("Informe o primeiro número: ");
        x = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        y = sc.nextDouble();

        z=x/y;

        System.out.println(x+" / "+y+" = "+z);

    }
    public static void multiplicacao(){

        double x=0.0,y=0.0,z=0.0;

        System.out.println("Informe o primeiro número: ");
        x = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        y = sc.nextDouble();

        z=x*y;

        System.out.println(x+" * "+y+" = "+z);

    }

}
