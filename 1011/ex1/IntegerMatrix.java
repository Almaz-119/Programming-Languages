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
            StringBuilder sb = new StringBuilder();
            String rowDelim = "";
            String colDelim = "";

            for (int[] row : data) {
                sb.append(rowDelim);
                //rowDelim = ";";
                //sb.append(data);
                for (int elem : row) {
                    sb.append(colDelim);
                    colDelim = ",";
                    sb.append(elem);
                }
            }
            return sb.toString();
        }
}