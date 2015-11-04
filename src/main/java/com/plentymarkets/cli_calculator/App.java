package com.plentymarkets.cli_calculator;

import java.util.InputMismatchException;

/**
 * Hello world!
 *
 */
public class App {
    private static double zahl1;

    public static void main(String[] args) {
        /*System.out.println( "Hello World!" );
        int zahl1 ;
        int zahl2 ;

        zahl1 = 4;
        zahl2 = 2;


        System.out.println(zahl1 + zahl2);


        System.out.println(zahl1 - zahl2);*/

        try {
            // Das Ergebnis

            double result = 0;

            // Fragen, welche Rechenart
            System.out.println("Moin! was willst du rechnen ? '+' '-' '*' '/'");
            String name = new java.util.Scanner(System.in).nextLine();

            // Fragen welche erste Zahl
            System.out.println("Was ist die erste Zahl?◉_◉");
            double zahl1 = new java.util.Scanner(System.in).nextDouble();

            // Fragen welche zweite Zahl
            System.out.println("Was ist die zweite Zahl?ʕ•ᴥ•ʔ");
            double zahl2 = new java.util.Scanner(System.in).nextDouble();

            if (name.equals("+")) {
                // Summieren
                result = sum(zahl1, zahl2);
            } else if (name.equals("-"))
            {
                // Subtrahieren
                // TODO
                result = sub(zahl1, zahl2);}

                else if (name.equals("*"))

                    result = Multiply(zahl1, zahl2);

             else if (name.equals("/"))

            {
                result = Devide(zahl1, zahl2);
            } else

            {
                System.out.println("Ich kenne diese Rechenart nicht (¬_¬)!");
            }

            // Ergebnis zeigen
            System.out.println("Das Ergebnis ist: " + result);
        } catch (Exception e) {
            if (e instanceof InputMismatchException) {
                // TODO das muss eher überprüft werden
                showError("Da hast du wohl was falsche eingegeben ┌( ಠ_ಠ)┘");
            } else {
                showError(e.getMessage());
            }
        }


        /*System.out.printf( "addieren oder subtrahieren", name );
        int age = new java.util.Scanner( System.in ).nextInt();
        System.out.printf( "Aha, %s Jahre, das ist ja die Hälfte von %s.%n",
                age, age * 2 );
        System.out.println( "Sag mal, was ist deine Lieblingsfließkommazahl?" );
        double value = new java.util.Scanner( System.in ).nextDouble();
        System.out.printf( "%s? Aha, meine ist %s.%n",
                value, Math.random() * 100000 );*/


    }

    private static double sub(double zahl1, double zahl2) {
        Subtraction subtraction = new Subtraction(zahl1, zahl2);
        subtraction.doSubtraction();
        double result = subtraction.getResult();

        return result;
    }

    private static double sum(double zahl1, double zahl2) {
        Sum sum = new Sum(zahl1, zahl2);
        sum.doSum();
        double result = sum.getResult();

        return result;
    }

    private static void showError(String errorMessage) {
        System.out.println("FEHLER: " + errorMessage);
    }

    private static double Devide(double zahl1, double zahl2) throws Exception

    {
        if(zahl2 == 0 || zahl1 == 0)
        {
            throw new Exception("Nicht durch 0 teilen ༼ つ ◕_◕ ༽つ");
        }
        else
        { devide Devide = new devide(zahl1, zahl2);
          Devide.dodevide();
          double result = Devide.getResult();

            return result;
        }

    }


    private static double Multiply(double zahl1, double zahl2)

    {
        Multiply multiply = new Multiply(zahl1, zahl2);
        multiply.doMultiply();
        double result = multiply.getResult();

        return result;
    }

     {
    }
}
