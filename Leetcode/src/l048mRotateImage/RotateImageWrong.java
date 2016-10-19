package l048mRotateImage;

public class RotateImageWrong {

	public static void main(String[] args) {
		int[][] matrix = {{1,2},{3,4}};
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
	}
	public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j){
                swap(matrix,i,j,j,n-1-i);
            }
        }
    }
    public static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
        int temp = matrix[i1][j1];
        matrix[i1][j1] = matrix[i2][j2];
        matrix[i2][j2] = temp;
    }
}
