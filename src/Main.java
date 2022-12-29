import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner a = new Scanner(System.in);
        int jash = a.nextInt();// konsoldon maani kelet
        System.out.println("menin jashym"+jash );

        System.out.println("jashynyzdy jazynyz");*/

//        int num1, num2, num3, sum;
//        float myLoatNum = 3f;
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("brinchi sandy jaz: ");
//        num1 = sc.nextInt();
//
//        System.out.printf("ekinchi sandy jaz: ");
//        num2 = sc.nextInt();
//
//        System.out.printf("uchunchu sandy jaz: ");
//        num3 = sc.nextInt();
//
//        sc.close();
//        sum = num1 + num2 + num3;
//
//        System.out.printf("%d * %d * %d = %d",num1,num2,num3,num1*num2*num3);
//        System.out.println();
//
//        System.out.printf(num1 +" + " + num2 + " + "+ num3 + " = " + sum);
//        System.out.println();
//
//
//        System.out.println( "(" + num1 +" + " + num2  + " + "+ num3 + ") / 3" +" = " + (num1 + num2  + num3) / myLoatNum);
//


        //System.out.println((num1+ "+" +num2+ "+" +num3)+"/"+"=" +sum/3d);
        /*int   mind,not ;
        Scanner sc=new Scanner (System.in);
        System.out.println("san jazynyz");
        mind=sc.nextInt();
        System.out.println("ekinchi san jazynyz");
        not=sc.nextInt();
        System.out.println("menin jashym");
        System.out.println(25-9);
        System.out.println("menin jashym emes");
        System.out.println(25-5);*/


//        char a, d, b,g;
//        a = 'A';
//        d = 'S';
//        b = 'A';
//        g = 'N';
//        System.out.print( a );
//        System.out.print( d );
//        System.out.print( b );
//        System.out.print( g );


//
        //      System.out.println(num1 + num2);
//        System.out.println(num1 - num2);
//        System.out.println(num1 * num2);
//        System.out.println(num1 / num2);
//        System.out.println( num1 % num2);


//          int f ,d,s, a ,g ;
//          Scanner sc = new Scanner(System.in);
//        System.out.printf("Birinchi san" );
//         f = sc.nextInt();
//        System.out.printf("ekinchi san" );
//        d = sc.nextInt();
//        System.out.printf("uchunchu san" );
//        s = sc.nextInt();
//        System.out.printf("tortunchu san");
//        a = sc.nextInt();
//        System.out.printf("beshinchi san");
//        g = sc.nextInt();
//
////        sc.close();
////        m = f + s + a ;
//        System.out.println( f);
//        System.out.println(a);
//        System.out.println(d + s +g );


//        System.out.printf("");
//        System.out.println( f +" + " + s + " + "+ a + " = " + m );


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int mynum = random.nextInt(1,3);
//        System.out.println(mynum);
//        int mynum3 = 0;
//        int sum = 1;
//        if (1 == mynum || 2 == mynum){
//
//            int mynum2 =scanner.nextInt();
//            while (mynum3 < mynum2);{
//                mynum3++;
//                System.out.println(mynum3 + mynum2);
//
//
//            }
//
//        }
//        Random random = new Random();
//        int[] array = new int[5];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10, 100);
//            System.out.print(array[i] + " ");
//
//
//        }
//
//        int min = array[0];
//        int max = array[0];
//        int num1 = 0;
//        for (int j : array) {
//            min = Math.min(j, min);
//            max = Math.max(j, max);
//        }
//        System.out.println();
//        System.out.println("It's MIN: " + min );
//        System.out.println("IT's MAX: " + max);
//        int[] array = num(2,4,5,6);
//
//        for (int j : array) {
//
//            System.out.println(j);
//        }
//    }
//
//    static int[] num(int ...arr){
//        return arr;
//    }
//    static void string (String...word){
//        for (a:word) {
//
//        }
//        System.out.println();
//        int s =0;
//        int d = 10;
//        for (int i = 10; i <= 100; i +=10) {
//            i +=d;
//            s = i;
//        }
//        System.out.println(s);
        int [] num = new int[100];
        number(num);
    }
    static void number (int ...array){
        int a = 3333;
        for (int i = 10; i < array.length; i+=10) {
            array [i] =i;
            if (array[i]%3==0){
                array[i] = a;
            }
            array[array.length/2]=-1;
            System.out.println(array[i]);
        }
    }
}