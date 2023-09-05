import java.util.List;

public class Scramble {
    public static String scrambleWord(String s){
        String word="";
        char[] letter= new char[s.length()];
        for(int i=0;i<s.length();i++){
            letter[i]=s.charAt(i);
        }
        for(int i=0; i<s.length()-1;i++){
            if(letter[i] == 'A'&& !(letter[i+1] =='A')){
                char q=letter[i];
                letter[i]= letter[i+1];
                letter[i+1]=q;
                i++;
            }

        }
        for(int i=0;i<s.length();i++){
            word+=letter[i];
        }

        return word;
    }
    public static List<String> scrambleOrRemove(List<String> l){
        for(int i=0;i<l.size();i++){
           String s=Scramble.scrambleWord(l.get(i));
           if (s.equals(l.get(i))){
               l.remove(i);
               i--;
           }
           else{
               l.set(i,s);
           }
        }

        return l;
    }
}
