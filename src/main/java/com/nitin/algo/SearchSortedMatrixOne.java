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
	}

}
