package question01;

import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input =sc.next();
        int c=0;
        for(int t=0;t<input.length();t++)
            if(input.charAt(t)==',')
                c++;
        int[] arr = new int[c+1];
        String[] mid =input.split(",");
        for (int a = 0; a < mid.length; a++) {
            arr[a] = Integer.parseInt(mid[a]);
        }
        int l=0;
        int[] res = new int[arr.length];
        int[]  a= new int[arr.length];
        int v=0;
        for (int i = 0; i < a.length; i++) {
            if(arr[i]<0){
                a[v]=arr[i];v++;}
        }

        for(int j = 0; j < arr.length; j++) {
            if(arr[j]>0){
                a[v]=arr[j];
            v++;}
        }
        for (int k = 0; k < a.length - 1; k++) {
            int num1 =a[k];
            int num2=a[k+1];
            int sum=0;
            if((num2-num1)<1)
            {
                res[l]=0;l++;
            }
            else if ((num2-num1)>1){
                for (int x = num1+1; x <num2 ; x++) {
                    sum+=x;
                }
                res[l]=sum;
                l++;
            }

        }
        for (int d = 0; d < l-1; d++) {
            System.out.print(res[d]+",");
        }
        System.out.println(res[l-1]);
    }

}
