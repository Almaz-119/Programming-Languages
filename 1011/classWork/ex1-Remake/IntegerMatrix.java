public class IntegerMatrix {
    private int rowNum;
    private int colNum;
    private int[][] data;

    public IntegerMatrix (int rowNum, int colNum, int[] linearData) {
        if (rowNum * colNum != linearData.length) {
            throw new IllegalArgumentException();
        }
        this.rowNum = rowNum;
        this.colNum = colNum;
        data = new int [rowNum][colNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                data[i][j] = linearData[i*colNum+j];

            }
        }
    }
    public String toString() {
        String str = "";
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                if (j < colNum - 1) {
                    str += Integer.toString(data[i][j]) + ",";
                }else {
                    str += Integer.toString(data[i][j]) + ";";
                }
            }
            if (i < rowNum - 1) {
                str += '\n';
            }
        }
        return str;
    }
}