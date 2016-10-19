package l048mRotateImage;

public class RotateImageO_n2Space {

	public static void main(String[] args) {
		int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(matrix);
		int n = matrix.length;
		for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.print(matrix[i][j]+"\t");
                if(j==n-1){
                	System.out.println();
                }
            }
        }
		System.out.println();
		matrix = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		rotate(matrix);
		n = matrix.length;
		for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                System.out.print(matrix[i][j]+"\t");
                if(j==n-1){
                	System.out.println();
                }
            }
        }
	}
	public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotateMatrix = new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                rotateMatrix[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                matrix[i][j] = rotateMatrix[i][j];
            }
        }
        /*matrix = rotateMatrix;*/ //Wrong answer;
        /*for(int i=0;i<n;++i){
            matrix[i] = rotateMatrix[i];
        }*/ //right but not suggested
    }
}
