/*
Given a set of numbers and a digit in each iteration, if the digit exists in any of  the numbers, 
remove its occurrences and ask for the next digit till the list becomes empty.
*/
import java.util.*;
class Number{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
     	List<String> list=new ArrayList<>();
     	list.add("111");
     	list.add("267823");
     	list.add("02849174");
     	list.add("456");


     	while(!list.isEmpty()){
     		System.out.println("Enter a digit to remove:");
     		char ch=sc.next().charAt(0);

     		list=removeoccurrences(ch,list);

     		System.out.println("Updated List "+list);
     	}
    }

    static List<String> removeoccurrences(char ch,List<String> list){
    	List<String> UpdatedList=new ArrayList<>();

    	for(String num:list){
    		StringBuilder sb=new StringBuilder();
    		char chr[]=num.toCharArray();
    		for(char c:chr){
    			if(c!=ch){
    				sb.append(c);
    			}
    		}

    		if (sb.length() > 0) {
                UpdatedList.add(sb.toString());
            }
    	}

    	return UpdatedList;

    }
}