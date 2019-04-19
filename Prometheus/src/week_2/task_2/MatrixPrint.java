package week_2.task_2;


public class MatrixPrint {
    public static void main(String[] args) {
        int arr [][]  = new int[5][5];
        int x = 1;
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                arr[i][j] = x;
                x++;
            }
        }
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                    if (i == j || j == (4 - i)){
                        System.out.print(" * ");
                    } else if (arr[i][j] <10){
                        System.out.print(" " + arr[i][j] + " ");
                    } else {
                        System.out.print(arr[i][j] + " ");
                    }
            }
            System.out.println("");
        }
    }
}
