package homework6;

class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col) {
        super("Invalid data at cell [" + row + "," + col + "]");
    }
}