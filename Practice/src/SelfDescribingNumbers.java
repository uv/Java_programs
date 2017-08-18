public class SelfDescribingNumbers{
    public static boolean isSelfDescribing(int a){
        String s = Integer.toString(a);
        for(int i = 0; i < s.length(); i++){
            String s0 = s.charAt(i) + "";
            int b = Integer.parseInt(s0); // number of times i-th digit must occur for it to be a self describing number
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                int temp = Integer.parseInt(s.charAt(j) + "");
                if(temp == i){
                    count++;
                }
                if (count > b) return false;
            }
            if(count != b) return false;
        }
        return true;
    }

    public static void main(String[] args){
        for(int i = 0; i < 100000000; i++){
            if(isSelfDescribing(i)){
                System.out.println(i);
             }
        }
    }
}
/*
 There are a number of ways to define "self-describing" numbers or sequences.  
 This program searches for those meeting the above conditions.  
 For example 1210 is a four digit self describing number because 
 position "0" has value 1 and there is one 0 in the number; 
 position "1" has value 2 because there are two 1' s in the number, 
 position "2" has value 1 and there is one 2, and 
 position "3" has value 0 and there are zero 3's
 */
