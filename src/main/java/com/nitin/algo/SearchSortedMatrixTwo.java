/*
 Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.

For example, consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.
 */

package com.nitin.algo;

public class SearchSortedMatrixTwo {
	
	public static void main(String[]  args) {
		int[] arr = {1,4,7,11,15,2,5,8,12,19,3,6,9,16,22,10,13,14,17,24,18,21,23,26,30};
		int[][] mat = MatrixUtils.create2DMatrix(arr,5,5);
		MatrixUtils.print2DMatrix(mat, mat.length, mat[0].length);
		
		int num = 4;
		
		System.out.println("The number in the given matrix is present: " + searchSortedMatrixTwo(mat, num));
	}

	private static boolean searchSortedMatrixTwo(int[][] matrix, int target) {
		int m=matrix.length-1;
	    int n=matrix[0].length-1;
	 
	    int i=m; 
	    int j=0;
	 
	    while(i>=0 && j<=n){
	        if(target < matrix[i][j]){
	            i--;
	        }else if(target > matrix[i][j]){
	            j++;
	        }else{
	            return true;
	        }
	    }
	 
	    return false;
	}

}
