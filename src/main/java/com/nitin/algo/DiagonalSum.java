/*
 Find the sum of both diagonals
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]

 1 + 9 + 5 = 15
 3 + 9 + 7 = 19
 */
package com.nitin.algo;

import java.util.Arrays;

public class DiagonalSum {

	public static void main(String[] args) {
		int[] arr = {1,2,3,8,9,4,7,6,5};
		int[][] mat = MatrixUtils.create2DMatrix(arr, 3, 3);
		MatrixUtils.print2DMatrix(mat, mat.length, mat[0].length);
		System.out.print("The sum of diagonals of the given matrix is: " + Arrays.toString(diagonalSum(mat)));
	}

	private static int[] diagonalSum(int[][] mat) {
		if(mat == null || mat.length == 0)
			return new int[] {};
		int[] arr = new int[2];
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(i == j)
					arr[0] = arr[0] + mat[i][j];
				if(i + j == mat.length - 1)
					arr[1] = arr[1] + mat[i][j];
			}
		}
		return arr;
	}

}
