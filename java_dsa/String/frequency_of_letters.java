package String;

// count frequency of each letter in a string

public class frequency_of_letters {
    public static void main(String[] args) {
        String s = "hello world how are you";
        frequency(s);
    }

    static void frequency(String s){
        for(int i=0; i<s.length(); i++){
            int freq =0;
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                
                // checking backward if char is already counted
                boolean flag = false;
                for(int k = i-1; k>=0;k--){
                    if(s.charAt(k) == ch){
                        flag = true; // found the ch in backward
                        break;
                        
                    }
                }

                if(flag == false){
                    freq=1; //counting self
                    for(int j=i+1;j<s.length();j++){
                        if(s.charAt(j)== ch){
                            freq++; 
                        }
                    }
                    System.out.println(ch + " - "+ freq);
                }

            }

        }
    }
}
