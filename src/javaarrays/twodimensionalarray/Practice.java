package javaarrays.twodimensionalarray;

public class Practice {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int col1=0;
        int col2=0;
        int col3=0;

        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                if (j == 0) {
                    col1 += matrix[i][j];
                } else if (j == 1) {
                    col2 +=matrix[i][j];
                } else{
                    col3 +=matrix[i][j];
                }
            }

        }
        System.out.println(col1);
        System.out.println(col2);
        System.out.println(col3);

        matrix[1][2]= 9;

        Object [][] matrix1 = {{"Name", "Roll No"},{"Monsur",1},{"Rayhan",2},{"Boris",3}};

    }
}
