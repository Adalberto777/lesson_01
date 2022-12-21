package lesson.lesson_01;

public class program {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // String s = "1213vcbcvbc";
        // String s = null;
        // int a = 123;
        // a = a-- - --a;
        int[][] arr = new int[3][5];
        for(int i  = 0; i < arr.length; i++){
            for(int j  = 0; j < arr[i].length; j++){
                System.out.printf("%d", arr[i][j]);
            }
        }
        System.out.println();
    }
    
}

