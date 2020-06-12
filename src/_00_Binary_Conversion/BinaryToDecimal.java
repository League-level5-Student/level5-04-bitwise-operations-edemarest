package _00_Binary_Conversion;

import javax.swing.JOptionPane;

public class BinaryToDecimal {
	public static void main(String[] args) {
		// Binary numbers in Java can be represented with the '0b' prefix.
		// For example:

		//This prints 7, because 111 is 7 in binary.
		
		//EXAMPLE: Convert 0 1 0 1 1 0 from binary to decimal
		
		/*To convert binary to decimal, use the following algorithm:
			1. Start from the right most digit of the binary number and assign that bit the value of 1.
		 	 	eg: 0	1	0	1	1	0
		                      			1 
			2. As you move to the left, assign the next digit a value that is double the previous digit.
				eg: 0	1	0	1	1	0
				    32	16	8	4	2	1
				    
			3. For every 1 in the binary number, add all of the corresponding values together.
				eg: 0	1	0	1	1	0
				    32	16	8	4	2	1
				    
				    16 + 4 + 2 = 22
				    010110 in binary is equal to 22 in decimal!
		 
		 */
		String num = JOptionPane.showInputDialog("Enter a binary:");
		int[] numA = new int[num.length()];
		int[] values = new int[num.length()];
		for(int i = num.length()-1; i >= 0; i--) {
			numA[i] = Integer.parseInt(Character.toString(num.charAt(i)));
		}
		int sum = 1;
		int dec = 0;
		values[0] = 1;
		for(int i = num.length()-1; i >= 1; i--) {
			sum = sum *2;
			values[i] = sum;
			dec += values[i];
			//System.out.println(values[i]);
		}
		
		System.out.println(num +" is equal to "+dec+" in decimal!");
		
		
		
	}
}
