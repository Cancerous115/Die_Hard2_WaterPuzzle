import java.util.Scanner;
public class Assignment4C {
    public static void main(String[] args) {
        int g5 = 0;
        int g3 = 0;

        System.out.println("[4 Gallons of Water]");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("The 3 gallon has " + g3 + "gallons of water and the 5 gallon has " + g5 + "gallons of water");
            System.out.println("Options");
            System.out.println("1) Fill the 5 gallon can from the fountain");
            System.out.println("2) Fill the 3 gallon can from the fountain");
            System.out.println("3) Pour the 5 gallon can into the 3 gallon jug");
            System.out.println("4) Pour the 3 gallon can into the 5 gallon jug");
            System.out.println("5) Empty the 5 gallon can into the fountain");
            System.out.println("6) Empty the 3 gallon can into the fountain");
            System.out.println("What will you do?");
            int inp = sc.nextInt();
//might need to use if statements for each calculation. "Keep testing.
            switch (inp) {
                case 1:
                    g5 = 5;
                    break;
                case 2:
                    g3 = 3;
                    break;
                case 3:
                    //Looked ahead a few chapters to learn/incorporate Math.min/max.
                    int transfer= Math.min(g5,3-g3);
                    g5 = g5-transfer;
                    g3=g3+transfer;
                    break;
                case 4:
                    transfer=Math.min(g3,5-g5);
                    g3= g3-transfer;
                    g5 = g5+transfer;
                    break;
                case 5:
                    g5 = 0;
                    break;
                case 6:
                    g3 = 0;
                    break;
            }}
        while(g5 != 4);{
            System.out.println("The 3 gallon has " + g3 + "gallons of water and the 5 gallon has " + g5 + "gallons of water");
            System.out.println("You saved Bruce Willis and Samuel L. Jackson! You Win!");
        }
        }
    }



