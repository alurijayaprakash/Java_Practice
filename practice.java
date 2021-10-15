// Febnocci series
// 0 1 is there, from now onwards every new term is obtained by adding previous two terms.
// 0 1 2 3 5 8 13 21.......

import java.util.Scanner;

class Practice{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many febnocci numbners you want: ");
        int num = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+ " ");
        System.out.print(b+ " ");

        for(int i = 0; i < num; i++){
            c = a+b;
            System.out.print(c+ " ");
            a = b;
            b = c;
        }

    } 
}

