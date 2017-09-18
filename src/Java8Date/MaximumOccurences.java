package Java8Date;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurences {

    public static void main(String args[]){

        String[] words = {"Tom","Gopal","Jack","Tom","Jerry","Gopal","Bob","Gopal","Jack","Hari","Gopal"};
                                                            
        Map<String,Integer> occurences = new  HashMap<String,Integer>();

        for (String w: words
             ) {
                Integer temp = occurences.get(w);
                occurences.put(w,(temp == null)?1:temp+1);
        }
        int max = 0;
        String ans = null;
        for(Map.Entry<String, Integer> m : occurences.entrySet()){

            if(m.getValue() > max){
                max = m.getValue();
                ans = m.getKey();
            }
        }

        System.out.println(ans);

    }
}
