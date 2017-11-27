/*
 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has properties:

1) Integers in each row are sorted from left to right. 2) The first integer of each row is greater than the last integer of the previous row.

For example, consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 */

package com.nitin.algo;

public class SearchSortedMatrixOne {
	
	public static void main(String[]  args) {
		int[] arr = {1,3,5,7,10,11,16,20,23,30,34,50};
		int[][] mat = MatrixUtils.create2DMatrix(arr,3,4);
		MatrixUtils.print2DMatrix(mat, mat.length, mat[0].length);
		int num = 4;
		
		System.out.println("The number in the given matrix is present: " + searchSortedMatrix(mat, num));
	}

	private static boolean searchSortedMatrix(int[][] matrix, int num) {
		if(matrix==null || matrix.length==0 || matrix[0].length==0) 
            return false;
		int m = matrix.length;
        int n = matrix[0].length;
 
        int start = 0;
        int end = m * n -1;
 
        while(start <= end) {
            int mid = (start + end)/2;
            int midX = mid/n;
            int midY = mid%n;
 
            if(matrix[midX][midY] == num) 
                return true;
 
            if(matrix[midX][midY] < num) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
 
        return false;
    }
}
