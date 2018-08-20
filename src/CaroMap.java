public class CaroMap {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            drawCaroMap();
        }
        for (int j = 0; j < 16; j++) {
            System.out.print("-");
        }
    }

    private static void drawCaroMap() {
        for (int j = 0; j < 16; j++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                System.out.print("|");
            }
            System.out.print(" ");
        }
        System.out.println();
    }

}
