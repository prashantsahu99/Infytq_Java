package question01;

public class abc {
     static int a;
     static int[] result = new int[1000];
    public static void armstrong(int z){
        int t=z;
        int d=0,c=0,flag=0;
        int sum=0;
        while(t!=0){
            c++;
            t=t/10;
        }
        t=z;
        while(t!=0){
            d=t%10;
            sum += (int)Math.pow(d,c);
            t=t/10;
        }
        if(sum==z) {
            for (int k = 0; k < a; k++) {
                if (sum == result[k]) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                result[a]=sum;
                a++;}
               //System.out.println(sum);

        }
    }

    public static void main(String[] args) {
         int[] arr = {15, 3, 1, 70, 53, 71};
         String s ="";
        for (int i =0;i<arr.length;i++){
            s="";
            for (int j=i+1;j<arr.length;j++){
                s=s + arr[i]+arr[j];
                int z= Integer.parseInt(s);
                armstrong(z);
                s="";
            }
        }
        for (int i = 0; i < a-1; i++) {
            System.out.print(result[i]+", ");
        }
        System.out.println(result[a-1]);
    }
}
