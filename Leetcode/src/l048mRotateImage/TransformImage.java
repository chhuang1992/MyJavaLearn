package l048mRotateImage;

public class TransformImage {

	public static void main(String[] args) {
		int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		antiRotate(matrix);
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
		antiRotate(matrix);
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
	public static void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        /*for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }*/
    }
	public static void reverseHorizon(int[][] matrix) {
        int n = matrix.length;
        /*for(int i=0;i<=n/2-1;++i){
            int[] temp = matrix[i];
            matrix[i] = matrix[n-1-i];
            matrix[n-1-i] = temp;
        }*/
        for(int i=0;i<=n/2-1;++i){
        	for(int j=0;j<n;++j){
        		int temp = matrix[i][j];
                matrix[i][j] = matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
        	}
        }
    }
	public static void reverseVertical(int[][] matrix) {
        int n = matrix.length;
        /*for(int[] arr : matrix){
        	for(int j=0;j<=n/2-1;++j){
                int temp = arr[j];
                arr[j] = arr[n-1-j];
                arr[n-1-j] = temp;
            }
        }*/
        for(int i=0;i<n;++i){
        	for(int j=0;j<=n/2-1;++j){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
	public static void rotate(int[][] matrix){
		/*transpose(matrix);
		reverseVertical(matrix);*/
		reverseHorizon(matrix);
		transpose(matrix);
	}
	public static void antiRotate(int[][] matrix){
		/*transpose(matrix);
		reverseHorizon(matrix);*/
		reverseVertical(matrix);
		transpose(matrix);		
	}
}
