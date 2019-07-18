package com.interview.testiFrame;

import java.util.Scanner;

public class TestArrayConcept {
		
		static void reverseArray(int[] arr)
	    {
			int arr_len = arr.length-1;
			
			for(int i=arr_len;i>=0;i--)
            {

            	System.out.print(arr[i]+" ");
            }    
                
            
	    	
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }
	        
	        reverseArray(arr);

	        scanner.close();
	    }
	}

