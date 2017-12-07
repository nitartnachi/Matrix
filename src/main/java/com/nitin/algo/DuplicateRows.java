/*
 Find duplicate rows in a  binary matrix
 {1,  0,  0,  1,  0},
 {0,  1,  1,  0,  0},
 {1,  0,  0,  1,  0},
 {0,  0,  1,  1,  0},
 {0,  1,  1,  0,  0}
 
 should print
 1 and 3
 2 and 5
 
 Two ways to solve, one is in this one where we can represent each row by a decimal number and store it in a set, if already there we report, other one could be Trie.
 if we choose int then we cannot have more than 32 cols and if we choose long then max 64 cols
 */
package com.nitin.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRows {
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,1,0,0,1,1,0,0,1,0,0,1,0,0,0,1,1,0,0,1,1,0,0};
		int[][] mat = MatrixUtils.create2DMatrix(arr,5,5);
		MatrixUtils.print2DMatrix(mat, mat.length, mat[0].length);
		System.out.println("Duplicate rows are: " + findDups(mat).toString());
	}

	private static List<Integer> findDups(int[][] mat) {
		if(mat == null || mat.length == 0)
			return Collections.emptyList();
		
		List<Integer> result = new ArrayList<>();
		Set<Double> set = new HashSet<>();
		double dec = 0.0;
		
		for(int i = 0; i < mat.length; i++) {
			dec = 0.0;
			for(int j = 0; j < mat[0].length; j++){
				dec = dec + Math.pow(2, j) * mat[i][j];
			}
			if(set.contains(dec))
				result.add(i + 1);
			else
				set.add(dec);
		}
		return result;
	}

}
