import java.util.*;

public class exercise1 {
    public static void calculateAverage(int a,int b,int c) {
        if(a<0||b<0||c<0) {
            System.out.println("Invalid No.");
            return;
        }
        float sum = a+b+c;
        float avg = sum/3;
        System.out.println("Average of Three No. is "+avg);
        return;
    }

    public static void calculateSumOfOddNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) {
            if(i%2!=0) {
                sum += i;
            }
        }
        System.out.println("Sum of od no. from 1 to "+n+" is "+sum);
        return;
    }

    public static int max(int a,int b) {
        int max=a;
        if(b>max) {
            return b;
        }
        return max;
    }

    public static double circumferenceOfCircle(int r) {
        double cir, pi=3.14;
        cir = 2*pi*r;
        return cir;
    }

    public static void eligibility(int age) {
        if(age<0) {
            System.out.println("Chid is not born Yet.");
        }
        else if(age>18) {
            System.out.println("You are Eligible to Vote.");
        }
        else {
            System.out.println("You are not eligible to Vote");
        }
    }

    public static void infiniteLoop(int n) {
        do {
            System.out.println("My name is Babloo Kumar");
        }while(n>0);
    }

    public static void countNumber(int n) {
        Scanner sc = new Scanner(System.in);
        int positive=0,negative=0,zeros=0;
        System.out.println("Enter "+n+" Integers");
        for(int i=0;i<n;i++) {
            int Integer = sc.nextInt();
            if(Integer>0) {
                positive++;
            }
            else if(Integer<0) {
                negative++;
            }
            else {
                zeros++;
            }
        }
        System.out.println("Positive no. :"+positive);
        System.out.println("Negative no. :"+negative);
        System.out.println("zeros count :"+zeros);
    }

    public static int xToThePowerOfN(int x, int n) {
        int pow=1;
        if(n<0) {
            System.out.println("Invalid no.");
        }
        else if(n>0) {
            for(int i=0;i<=n;i++) {
                pow *= n;
            }
            return pow;
        }
        return pow;
    }

    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
    public static void main(String[] args) {

        // 1st
        // System.out.println("Enter Three No.");
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // calculateAverage(a, b, c);

        // 2nd
        // System.out.println("Enter a no.");
        // int n = sc.nextInt();
        // calculateSumOfOddNumber(n);
        
        // 3rd
        // System.out.println("Enter 2 no.");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println("Max of these two no. "+max(a, b));

        // 4th
        // System.out.println("Enter the radius of a circle.");
        // int r = sc.nextInt();
        // System.out.println("Circumference of the circle is "+circumferenceOfCircle(r));

        // 5th
        // System.out.println("Enter your age in Years");
        // int age = sc.nextInt();
        // eligibility(age);

        // 6th
        // System.out.println("Enter a no.");
        // int n = sc.nextInt();
        // infiniteLoop(n);

        // 7th
        // System.out.println("Enter a no.");
        // int n = sc.nextInt();
        // countNumber(n);

        // 8th
        // System.out.println("Enter a no. and an another no. that is responsible for its power");
        // int n = sc.nextInt();
        // int x = sc.nextInt();
        // System.out.println("x to the power of n : "+xToThePowerOfN(x,n));

        // 9th 
        // System.out.println("Enter two no. for finding gcd");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("gcd of "+a+" and "+b+" :"+gcd(a,b));

        // 10th
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int a=0,b=1;

        System.out.print(a+" ");
        if(n>1) {
            for(int i=0;i<n;i++) {
                System.out.print(b+" ");

                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
}
