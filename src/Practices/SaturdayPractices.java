package Practices;
/*
write a program that asks to enter 5 numbers and prints the numbers in ascending order
        Ex:  5, 4, 1, 2, 3
        output: 1, 2, 3, 4, 5
 */
import java.util.Arrays;
import java.util.Scanner;

public class SaturdayPractices {
    public static void main(String[] args) {
        int tabInt, tabNumbers, tabTri, temp;


        Scanner input = new Scanner(System.in);
        System.out.print("Entrez le nombre d'elemnts:");
        tabNumbers = input.nextInt();


        int tabSize[] = new int[tabNumbers];
        System.out.println("Entrez les elements de la table:");

        for (tabInt = 0; tabInt < tabNumbers; tabInt++) {
            tabSize[tabInt] = input.nextInt();
        }

        input.close();

        for (tabInt = 0; tabInt < tabNumbers; tabInt++) {
            for (tabTri = tabInt + 1; tabTri < tabNumbers; tabTri++) {
                if (tabSize[tabInt] > tabSize[tabTri]) {

                    temp = tabSize[tabInt];
                    tabSize[tabInt] = tabSize[tabTri];
                    tabSize[tabTri] = temp;
                }


            }
        }
        System.out.println("Tableau en ordre ascendant");
        for (tabInt = 0; tabInt < tabNumbers - 1; tabInt++)
        {
            System.out.print(tabSize[tabInt] + ",");
        }
        System.out.println(tabSize[tabNumbers - 1]);
    }

}




