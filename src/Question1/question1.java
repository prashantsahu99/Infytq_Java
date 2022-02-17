/*QUESTION 1:
A non-empty string containing only alphabets. print the longest prefix from the input string which is the same as the suffix.
Prefix and Suffix should not be overlapped.
Print -1 if no prefix exists which is also the suffix without overlap.
Do case-sensitive comparison.
Positions start from 1.
Input : xxAbcxxAbcxx
o/p: xx (‘xx’ in the prefix and ‘xx’ in the suffix and this is the longest one in the input string so the output will be ‘xx’).
Input: Racecar
o/p: -1 (There is no prefix which is also a suffix so the output will be -1).

*/
package Question1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class question1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        int half = length / 2;
        for (int i = half; i >= 0; i--) {
            String prefix = str.substring(0, i);
            String suffix = str.substring(length - i, length);
            if (prefix.equals("") || suffix.equals("")) {
                System.out.println("-1");
                break;
            }
            if (prefix.equals(suffix)) {
                System.out.println(prefix);
                break;
            }
        }
    }
}

