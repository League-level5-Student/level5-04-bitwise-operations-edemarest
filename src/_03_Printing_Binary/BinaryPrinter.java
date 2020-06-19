package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	public static void main(String[] args) {
		byte b = 100;
		BinaryPrinter bp = new BinaryPrinter();
		short s = 23423;
		bp.printByteBinary(b);
		bp.printShortBinary(s);
		int num = 300;
		bp.printIntBinary(num);
	}
	
	public void printByteBinary(byte b) {
	  for(int i = 7; i >= 0; i--) {
		  System.out.print((b>>i) & 1);
	  }
	}
	
	public void printShortBinary(short s) {
		byte a= (byte)(s >> 8);
		byte b= (byte)(s & 0b11111111);
		System.out.println("");
		  for(int i = 7; i >= 0; i--) {
			  System.out.print((a>>i) & 1);
		  }
		  for(int i = 7; i >= 0; i--) {
			  System.out.print((b>>i) & 1);
		  }
	}
	
	public void printIntBinary(int decimalNum) {
		
		String binaryStr = "";
	    
        do {
            // 1. Logical right shift by 1
            int quotient = decimalNum >>> 1;
        
            // 2. Check remainder and add '1' or '0'
            if( decimalNum % 2 != 0 ){
                binaryStr = '1' + binaryStr;
            } else {
                binaryStr = '0' + binaryStr;
            }
            
            decimalNum = quotient;
            
        // 3. Repeat until number is 0
        } while( decimalNum != 0 );
        System.out.println();
        System.out.print(binaryStr);
	}
	
	public void printLongBinary(long l) {
		
	}
}
