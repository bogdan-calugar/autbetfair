package homeworks;

public class Draw {
    public static void main(String[] args) {
        drawShapeOutline(4,5);
        System.out.println("----------");
        drawShapeOutline("6","7");
        System.out.println("----------");
        drawShapeOutline(4);
        System.out.println("----------");

        drawShapeCorners(8,9);
        System.out.println("----------");
        drawShapeCorners("4","7");
        System.out.println("----------");
        drawShapeCorners(7);

    }

    private static void drawShapeOutline(int w, int h) {
        drawFullLine(h);
        for(int i = 0; i < w - 2; i++) {
            drawOutline(h);
        }
        drawFullLine(h);
    }

    private static void drawShapeOutline(String n, String m) {
        drawShapeOutline(Integer.parseInt(n), Integer.parseInt(m));
    }

    private static void drawShapeOutline(int n) {
        drawShapeOutline(n, n);
    }

    public static void drawShapeCorners(int r, int t) {
        drawOutline(t);
        for (int i = 0; i < r - 2; i++) {
            System.out.println(" ");;
        }
        drawOutline(t);
    }

    private static void drawShapeCorners(String n, String m) {
        drawShapeCorners(Integer.parseInt(n), Integer.parseInt(m));
    }

    private static void drawShapeCorners(int n) {
        drawShapeCorners(n, n);
    }

    private static void drawOutline(int w) {
        for (int j = 0; j < w; j++) {
            if (j == 0) {
                System.out.print("*");
            }
            if (j > 0 && j < w - 1) {
                System.out.print(" ");
            }
            if (j == w - 1) {
                System.out.println("*");
            }
        }
    }

    private static void drawFullLine(int m) {
        for(int j = 0; j < m - 1; j++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

}
