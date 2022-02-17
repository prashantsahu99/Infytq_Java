import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String[] in= s1.split(",");
        int r=sc.nextInt();
        int[][] matrix = new int[r][2];
        for (int i=0;i<r;i++){
            for(int j=0;j<2;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        String[] ar = new String[r];
        for(int i=0;i<r;i++){
            String s= in[i].replace(in[i].charAt(matrix[i][0]),(char)(97+matrix[i][1]));
            ar[i]=s;
        }
        int lar=Integer.MAX_VALUE;
        String fr="";
        for (int i=0;i<ar.length;i++){
            String s2=ar[i];
            int c=0;
            for(int j=0;j<s2.length();j++){
                if(s2.charAt(j) !='a' && s2.charAt(j) !='e' && s2.charAt(j) !='i' && s2.charAt(j) !='o' && s2.charAt(j) !='u')
                    c++;
            }
            if(c<lar){
                lar=c;
                fr=s2;
            }
        }
        System.out.println(fr);
    }
}
