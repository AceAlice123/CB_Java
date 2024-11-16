import java.util.*;
public class Test {
    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int t=scn.nextInt();
		for(int i =0;i<t;i++){
			String word = scn.nextLine();
			char [] st= word.toCharArray();
			boolean ans=false;
			Map<Character , Integer> fmap= new HashMap<>();
			for(int j=0;j<st.length;j++){
				Integer a = fmap.get(st[j]);
				if(a==null){fmap.put(st[j],1);}
				else{fmap.put(st[j],a+1);}
			}
			for(int j =0;j<st.length;j++){
				if(fmap.get(st[j])==1){
					System.out.println(st[j]);
					ans=true;
					break;
				}
			}
            System.out.println(fmap.get('d'));
			if(!ans){System.out.println("-1");}
		}

    }
}