import java.util.Scanner;

public class Question1 {
    public static int reverse(int n){
        int d=0,rev=0;
        while(n!=0){
            d=n%10;
            if(d==6){
                rev =rev*10+9;
            }
            else{
            rev=rev*10+d;}
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp =sc.next();
        String[] in = inp.split(",");
        int[] arr = new int[in.length];
        int[] res= new int[in.length];
        for(int i=0;i<in.length;i++){
            arr[i] = Integer.parseInt(in[i]);
        }
        for (int i=0;i<arr.length;i++){
            String s=in[i];
            int flag=0;
            for (int j=0;j<s.length();j++){
                if (s.charAt(j)=='6'){
                    int z = reverse(arr[i]);
                    res[i]=z;
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                res[i]=arr[i];
        }
        double avg=0;
        for (int i = 0; i < res.length; i++) {
            avg += res[i];
        }
        double ans=(avg/res.length);
        System.out.println(Math.round(ans*Math.pow(10,2))/Math.pow(10,2));
    }
}
