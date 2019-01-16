package Hoofdstuk12;
import java.applet.Applet;
import java.util.Scanner;

public class opdracht121 extends Applet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("voer het eerste getal: ");
        int num1 = in.nextInt();

        System.out.print("voer het tweede getal: ");
        int num2 = in.nextInt();

        System.out.print("voer het derde getal: ");
        int num3 = in.nextInt();

        System.out.print("voer het vierde getal: ");
        int num4 = in.nextInt();

        System.out.print("voer het vijfde getal: ");
        int num5 = in.nextInt();

        System.out.print("voer het zesde getal: ");
        int num6 = in.nextInt();

        System.out.print("voer het zevende getal: ");
        int num7 = in.nextInt();

        System.out.print("voer het achtste getal: ");
        int num8 = in.nextInt();

        System.out.print("voer het negende getal: ");
        int num9 = in.nextInt();

        System.out.print("voer het tiende getal: ");
        int num10 = in.nextInt();

        System.out.println("Het gemiddelde is: " +
                (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10) / 10);
    }
}