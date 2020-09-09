import java.util.Scanner;
import java.util.*;

class balance_paranthesis{
    public static void main(String []args){
        System.out.println();

        Scanner sc = new Scanner(System.in);
        //    String str =sc.nextLine();
        String str = "{[()]}";
        //  String str = "{[(])}";
        //   String str = "{{[[(())]]}}";
         
       System.out.print(BP(str));
       sc.close();
    }

    public static boolean BP(String str){
        Stack<Character> st = new Stack<Character>();

        for(int i=0 ; i< str.length(); i++){
            char ch = str.charAt(i);

            if(ch =='(' || ch =='[' || ch =='{')
            st.push(ch);

            else if(st.isEmpty()){
                return false;
            }
            
            else if(ch==')' && st.peek() =='('){
                st.pop();
            }

            else if(ch==']' && st.peek()=='['){
                st.pop();
            }
            else if(ch=='}' && st.peek()=='{' ){
                st.pop();
            }

            else {
                return false;
            }
        }
        
        return(st.isEmpty());
    }
}