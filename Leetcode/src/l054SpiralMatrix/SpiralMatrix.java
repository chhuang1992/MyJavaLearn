package l054SpiralMatrix;

import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		List<Integer> result = spiralOrder(matrix);
		System.out.println(result);
		matrix = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		result = spiralOrder(matrix);
		System.out.println(result);
		matrix = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		result = spiralOrder(matrix);
		System.out.println(result);
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0]==null||matrix[0].length==0)
            return null;
        int m = matrix.length;
        int n = matrix[0].length;
        return spiralOrder(matrix,0,m-1,0, n-1);
    }
    public static List<Integer> spiralOrder(int[][] matrix,int rstart,int rend,int cstart, int cend) {
        List<Integer> list = new LinkedList<>();
        if(rstart>rend){
            return list;
        }
        if(cstart>cend){
            return list;
        }
        if(rstart==rend){
            for(int i=cstart;i<=cend;++i){
                list.add(matrix[rstart][i]);
            }
            return list;
        }
        if(cstart==cend){
            for(int i=rstart;i<=rend;++i){
                list.add(matrix[i][cstart]);
            }
            return list;
        }
        for(int i=cstart;i<cend;++i){
            list.add(matrix[rstart][i]);
        }
        for(int i=rstart;i<rend;++i){
            list.add(matrix[i][cend]);
        }
        for(int i=cend;i>cstart;--i){
            list.add(matrix[rend][i]);
        }
        for(int i=rend;i>rstart;--i){
            list.add(matrix[i][cstart]);
        }
        list.addAll(spiralOrder(matrix,rstart+1,rend-1,cstart+1, cend-1));
        return list;
    }
}
