package javaarrays;

public class Java3DArray {
    public static void main(String[] args) {
        int [][][] matrix = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,34},{25,26,27}}};

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                for (int k = 0; k <matrix[i][j].length ; k++) {
                    System.out.println(matrix[i][j][k]);
                }
            }
        }
    }
}
