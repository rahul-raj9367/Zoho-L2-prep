/*

*/
import java.util.*;
class Flippingbits{
	static long flippingBits(long n){
		
		long one=(long)Math.pow(2,32)-1;
		// System.out.println(one);
		return n^one;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            long n = scanner.nextLong();
            System.out.println(flippingBits(n));
        }

	}
}