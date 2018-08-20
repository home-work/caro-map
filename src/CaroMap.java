import java.util.Scanner;

public class CaroMap {
    public static void main(String[] args) {
        int numberOfRows = getNumberOfRows() * 2 + 1;
        int numberOfColumns = getNumberOfColumns() * 2 + 1;
        displayCaroMap(drawCaroMap(numberOfRows,numberOfColumns));
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

    private static char[][] drawCaroMap(int numberOfRows,int numberOfColumns) {
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
