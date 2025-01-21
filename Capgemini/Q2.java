// Problem Statement –

/*  Capgemini in its online written test have a coding question, where in the students are given 
a string with multiple characters that are repeated consecutively. 
You’re supposed to reduce the size of this string using mathematical logic given as in the example below :*/

// Input :
// aabbbbeeeeffggg
// Output:
// a2b4e4f2g3
// Input :
// abbccccc
// Output:
// ab2c5


package Capgemini;
public class Q2{
    public static String reduceString(String str){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length(); i++){
            if(i == str.length()-1){
                sb.append(str.charAt(i));
                sb.append(count);
            }
            else if(str.charAt(i) == str.charAt(i+1)){
                count++;
                
            }else if(count == 1){
                sb.append(str.charAt(i));
            }
            else {
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abbbbeeeeffggg";
        System.out.println(reduceString(str));// Output: a2b4e4f2g3
   
    }
}
