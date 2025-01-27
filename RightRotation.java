import java.util.*;
public class RightRotation {

	public static void main(String[] args) {
		int[] num;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total no of elements");
		size = sc.nextInt();
		// 5
		num = new int[size];
		for(int i=0;i<size;i++) {
		System.out.println("enter "+(i+1)+" element");
			num[i] = sc.nextInt();
		}
		// 10 20 30 40 50
		System.out.println("before rotation all elements...");
		for(int i=0;i<size;i++) {
			System.out.print(num[i]+" ");
		}
		processRR(num);
	}
		private static void processRR(int[] num) {
			// 10 20 30 40 50
			//  0  1  2  3  4
			// 5
			
			// num[4]==nu[3]
			// num[3]==num[2]
			// num[2]==num[1]
			
			// num[1]==num[0]
			int temp = num[num.length-1];
			for(int i=num.length-1;i>=1;i--) {// len --5
				num[i]= num[i-1];// 
			}
			num[0] = temp;
			System.out.println("\n After rotation all elements...\n");
			for(int i=0;i<=num.length-1;i++) {
				System.out.print(num[i]+" ");
			}	
		}
	}
