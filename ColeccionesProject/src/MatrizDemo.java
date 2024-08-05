import java.util.Arrays;

public class MatrizDemo {
	public static void main(String[] args) {
		int matriz[][]= {
				{1, 2, 3, 4, 5},		//0
				{6, 7, 8, 9, 10},		//1
				{11, 12, 13, 14}	//2
		};//matriz
		
		
		
		
		for (int ren = 0; ren < matriz.length; ren++) {
			for (int col = 0; col < matriz[ren].length; col++) {
				System.out.print(matriz[ren][col] + ", ");
			}//for col
			System.out.println();
		}//for ren
		
		
		int [] nums = new int[5];
		nums[0]=1;
		nums[1]=20;
		nums[2]=8;
		nums[3]=48;
		nums[4]=256;
		
		nums = Arrays.copyOf(nums, 6); //new int[6];
		nums[5]=1;
		
		for( int n : nums) {
			System.out.println(n);
		}//foreach n
		
		
	}//main
}//Class MatrizDemo
