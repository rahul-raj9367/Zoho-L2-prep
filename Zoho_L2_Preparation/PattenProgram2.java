/*
--3--
-323-
32123
-323-
--3--
*/
class PatternProgram2 {
    public static void main(String[] args) {
        int n = 5; // the middle value
        int size = n * 2 - 1; // the total number of rows/columns in the pattern
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                if (min < n) {
                    System.out.print(n - min);
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
