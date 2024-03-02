public class MagicSquare {
    private int[][] square;

    public MagicSquare(int[][] square) { 
        this.square = square;
    }

    public int rowSum(int row) {
        int sum = 0;
        for (int i = 0; i < square[row].length; i++) {
            sum += square[row][i];
        }
        return sum;
    }

    public int colSum(int col) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][col];
        }
        return sum;
    }

    public boolean diagSums(int sum) {
        int diag1Sum = 0;
        int diag2Sum = 0;
        for (int i = 0; i < square.length; i++) {
            diag1Sum += square[i][i];
            diag2Sum += square[i][square.length - 1 - i];
        }
        return diag1Sum == sum && diag2Sum == sum;
    }

    public boolean exactlyOnce() {
        int n = square.length;
        boolean[] check = new boolean[n*n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] < 1 || square[i][j] > n*n) {
                    return false;
                }
                if (check[square[i][j] - 1]) {
                    return false;
                }
                check[square[i][j] - 1] = true;
            }
        }
        return true;
    }

    public boolean isMagic() {
        if (!exactlyOnce()) {
            return false;
        }
        int sum = rowSum(0);
        for (int i = 1; i < square.length; i++) {
            if (rowSum(i) != sum || colSum(i) != sum) {
                return false;
            }
        }
        return diagSums(sum);
    }
}