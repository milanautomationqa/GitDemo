package com.interview.testiFrame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


	public class TestSumAVeryNumberArray {
		
		private static final Scanner scanner = new Scanner(System.in);
		

	    // Complete the aVeryBigSum function below.
	    static long aVeryBigSum(long[] ar) {
	    	Long totalSumofArray=0l;
	        
	    	int arr_len = ar.length;
	        
	        for(int i=0;i<arr_len;i++)
	        {
	        	totalSumofArray = totalSumofArray+ar[arr_len];
	        }	
	            
	        return totalSumofArray;


	    }

	

    public static void main(String[] args) throws IOException {
        
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arItems[i]);
            ar[i] = arItem;
        }

        long result = aVeryBigSum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
