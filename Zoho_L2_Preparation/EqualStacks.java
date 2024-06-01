/*
You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.
Find the maximum possible height of the stacks, such that all of the stacks are the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they are all the same height, then print the height. The removals must be performed in such a way as to maximize the height.
Note: An empty stack is still a stack.
Input Format
The first line contains three space-separated integers n1, n2, n3 describing the respective number of cylinders in stacks 1, 2, 3. The subsequent lines describe the respective heights of each cylinder in a stack from top to bottom:
The second line contains n1 space-separated integers describing the cylinder heights in the stack.
The third line contains n2 space-separated integers describing the cylinder heights in the stack.
The fourth line contains n3 space-separated integers describing the cylinder heights in the stack,
Sample Input 1:
534

32111
432
1141
Sample Output 1:
5
*/
import java.util.*;
class EqualStacks{
	static int findEqualStacks(List<Integer> h1,List<Integer> h2,List<Integer> h3){
		int height1=0;
		int height2=0;
		int height3=0;

		for(int i=0;i<h1.size();i++){
			height1+=h1.get(i);
		}
		for(int i=0;i<h2.size();i++){
			height2+=h2.get(i);
		}
		for(int i=0;i<h3.size();i++){
			height3+=h3.get(i);
		}
		int i=0,j=0,k=0;
		while(true){

			if(i==h1.size() || j==h2.size() || k==h3.size()){
				return 0;
			}
			if(height1==height2 && height2==height3){
				return height1;
			}

			if(height1>=height2 && height1>=height3){
				height1-=h1.get(i++);
			}else if(height2>=height1 && height2>=height3){
				height2-=h2.get(j++);
			}else{
				height3-=h3.get(k++);
			}
		}

	}
	public static void main(String[] args) {
		List<Integer> h1=new ArrayList<>();
		List<Integer> h2=new ArrayList<>();
		List<Integer> h3=new ArrayList<>();
		h1.add(3);
		h1.add(2);
		h1.add(1);
		h1.add(1);
		h1.add(1);

		h2.add(4);
		h2.add(3);
		h2.add(2);

		h3.add(1);
		h3.add(1);
		h3.add(4);
		h3.add(1);

		System.out.println(findEqualStacks(h1,h2,h3));

	}
}
/*
OUTPUT
5
*/