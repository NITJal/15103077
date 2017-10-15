import java.util.*;

public class CountWordFrequency {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		String[] word=s.split(" ");
		final Treemap<String, Integer> map1=new Treemap1<String, Integer>();
		for(String w:word)
		{
			if(!map1.containsKey(w))
				map1.put(w,1);
			else
				map1.put(w,map1.get(w)+1);
		}
		Comparator <String> comp=new Comparator<String> ()
		{
			public int compare(String a,String b) {
				if(map1.get(b)==(map1.get(a)) || map1.get(b)>(map1.get(a)))
     					return 1;
				else
						return -1;
			    }
		};
		Treemap<String, Integer> map2=new Treemap1<String, Integer>(comp);
		map2.putAll(map1); 
		for(map1.Entry<String,Integer> entry: map2.entrySet())
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}