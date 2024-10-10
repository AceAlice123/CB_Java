
public class String1 {
    public static void main(String[] args) {
        // String s1 =new String("Potato");
        // System.out.println(reverse_S(s1));
        String s2 =new String("ababaabaababbb");
        // System.out.println(Plaindrome(s2));
        // System.out.println(MaxOccur_sorted(s2));
        // System.out.println(MaxOccur(s2));
        String s3 =new String("This is a String.");
        System.out.println(reverse_words(s3));
        

    }
    public static StringBuilder reverse_S(String s){
        StringBuilder string = new StringBuilder(s);
        int a=0;
        int b=s.length()-1;
        while(a<b){
            char temp=s.charAt(a);
            string.setCharAt(a,s.charAt(b));
            string.setCharAt(b,temp);
            a++;
            b--;
        }
        return string;
    }
    public static boolean Plaindrome(String s){
        int i =0;
        int j =s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){return false;}
            i++;j--;
        }
        return true;
    }
    public static char MaxOccur_sorted(String s){
        int count =0;
        int max_count=0;
        char ch=s.charAt(0);
        char temp=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(temp==s.charAt(i)) count++;
            else {temp=s.charAt(i); count=1;}
            if(count>max_count){ max_count=count; ch=s.charAt(i);}
        }

        return ch;
    }
    public static char MaxOccur(String s){
        int max_count=0;
        char ch=s.charAt(0);
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            int count =0;
            for(int j=0;j<s.length();j++){
                if(temp==s.charAt(j)) count++;
            }
            if(count>max_count){ max_count=count; ch=s.charAt(i);}
        }
        return ch;
    }
    public static String reverse_words(String s){
        String s1="";
        String[] str=s.split(" ");
        for(int i=str.length-1;i>=0;i--){
            s1+=str[i]+ ' ';
        }
        s1=s1.trim();
        return s1;
    }
}
