import java.util.Scanner;

public class CaroMap {
    public static void main(String[] args) {
        int numberOfRows = getNumberOfRows() * 2 + 1;
        int numberOfColumns = getNumberOfColumns() * 2 + 1;
        char[][] array = drawCaroMap(numberOfRows, numberOfColumns);
        displayCaroMap(array);
        int previousCoordinatesRowOfPlayer = -1;
        int previousCoordinatesColumnOfPlayer = -1;
        for (int i = 0; i < 100; i++) {
            int coordinatesOfRow = (getCoordinatesOfRow() - 1) * 2 + 1;
            int coordinatesOfColumn = (getCoordinatesOfColumn() - 1) * 2 + 1;
            if (coordinatesOfRow == previousCoordinatesRowOfPlayer && coordinatesOfColumn == previousCoordinatesColumnOfPlayer) {
                System.out.println("Tọa độ đã được ghi. Mời nhập lại!");
                continue;
            }else {
                if (i % 2 == 0) {
                    displayCaroMap(drawCaroMapWithValueO(coordinatesOfRow, coordinatesOfColumn, array));
                } else {
                    displayCaroMap(drawCaroMapWithValueX(coordinatesOfRow, coordinatesOfColumn, array));
                }
                previousCoordinatesRowOfPlayer = coordinatesOfRow;
                previousCoordinatesColumnOfPlayer = coordinatesOfColumn;
            }
        }
    }

    private static char[][] drawCaroMapWithValueO(int coordinatesOfRow, int coordinatesOfColumn, char[][] array) {
        char[][] arrayDrawed = array;
        for (int i = 0; i < arrayDrawed.length; i++) {
            for (int j = 0; j < arrayDrawed[i].length; j++) {
                if (i == coordinatesOfRow && j == coordinatesOfColumn) {
                    arrayDrawed[i][j] = 'o';
                }
            }
        }
        return arrayDrawed;
    }

    private static char[][] drawCaroMapWithValueX(int coordinatesOfRow, int coordinatesOfColumn, char[][] array) {
        char[][] arrayDrawed = array;
        for (int i = 0; i < arrayDrawed.length; i++) {
            for (int j = 0; j < arrayDrawed[i].length; j++) {
                if (i == coordinatesOfRow && j == coordinatesOfColumn) {
                    arrayDrawed[i][j] = 'x';
                }
            }
        }
        return arrayDrawed;
    }

    private static int getCoordinatesOfColumn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tọa độ cột cho bước đi:");
        return scanner.nextInt();
    }

    private static int getCoordinatesOfRow() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tọa độ hàng cho bước đi:");
        return scanner.nextInt();
    }


    private static int getNumberOfRows() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số hàng của bàn cờ: ");
        return scanner.nextInt();
    }

    private static int getNumberOfColumns() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cột của bàn cờ: ");
        return scanner.nextInt();
    }

    private static void displayCaroMap(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] drawCaroMap(int numberOfRows, int numberOfColumns) {
        char[][] arrayCaroMap = new char[numberOfRows][numberOfColumns];
        for (int i = 0; i < arrayCaroMap.length; i++) {
            for (int j = 0; j < arrayCaroMap[i].length; j++) {
                if (i % 2 == 0) {
                    arrayCaroMap[i][j] = '-';
                } else {
                    if (j % 2 == 0) {
                        arrayCaroMap[i][j] = '|';
                    } else {
                        arrayCaroMap[i][j] = ' ';
                    }
                }
            }
        }
        return arrayCaroMap;
    }

}
