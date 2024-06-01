/*
Given four different points in space. Find whether these points can form a square or not.

Example 1:
Input:
x1 = 20, y1 = 10, x2 = 10, y2 = 20, 
x3 = 20, y3 = 20, x4 = 10, y4 = 10 
Output:
Yes
Explanation:
The points (20,10), (10,20), (20,20),
(10,10) forms a square.

Example 2:
Input:
x1 = 2, y1 = 1, x2 = 10, y2 = 20, 
x3 = 5, y3 = 6, x4 = 10, y4 = 10 
Output:
No
Explanation:
The points (2,1), (10,20), (5,6),
(10,10) doesn't form a square.
*/
class IsSquare{
	static String findIsSquare(int x1,int x2,int x3,int x4,int y1,int y2,int y3,int y4){
		if(x1 == x2 && x3 == x4 && y1 == y2 && y3 == y4) return "No";

	    if(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)) == ((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3))) {
	        return "Yes";
	    }

       return "No";
	}
	public static void main(String[] args) {
		int x1 = 20, y1 = 10, x2 = 10, y2 = 20, x3 = 20, y3 = 20, x4 = 10, y4 = 10;
		System.out.println(findIsSquare(x1,x2,x3,x4,y1,y2,y3,y4));
	}
} 