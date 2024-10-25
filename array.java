import java.util.*;

public class array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        // int[] marks = {98, 97, 95};

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a no.");
        // int n = sc.nextInt();
        // int array[] = new int[n];
        // System.out.print("Enter "+n+" elements : ");
        // for(int i=0;i<n;i++) {
        //     array[i] = sc.nextInt();
        // }

        // for(int i=0;i<array.length;i++){
        //     System.out.print(array[i]+" ");
        // }

        // 1st
        // System.out.println("Enter a no.");
        // int n = sc.nextInt();
        // String names[] = new String[n];
        // System.out.print("Enter "+n+" names : ");
        // for(int i=0;i<n;i++) {
        //     names[i] = sc.next();
        // }

        // for(int i=0;i<names.length;i++) {
        //     System.out.println("My name is "+names[i]);
        // }

        // 2nd
        // System.out.println("Enter a no.");
        // int n = sc.nextInt();
        // System.out.print("Enter "+n+" integers : ");
        // int list[] = new int[n];
        // for(int i=0;i<n;i++) {
        //     list[i] = sc.nextInt();
        // }
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // for(int i=0;i<list.length;i++) {
        //     if(list[i]>max) {
        //         max=list[i];
        //     }
        //     if(list[i]<min) {
        //         min=list[i];
        //     }
        // }
        // System.out.println("maximum : "+max);
        // System.out.println("minimum :"+min);

        // 3rd
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" integers : ");
        int list[] = new int[n];
        for(int i = 0; i < n ; i++){
            list[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0;i<list.length-1;i++) {
            if(list[i]>list[i+1]) {
                isAscending = false;
            }
        }

        if(isAscending) {
            System.out.println("Yes, It is in ascending order");
        }
        else {
            System.out.println("No, It is not in ascending order");
        }
    }
}
