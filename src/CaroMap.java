public class CaroMap {
    public static void main(String[] args) {
        displayCaroMap(drawCaroMap());
    }

    private static void displayCaroMap(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] drawCaroMap() {
        char[][] arrayCaroMap = new char[5][99];
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
