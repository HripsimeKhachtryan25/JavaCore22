package homework;

public class FigurePainter33 {

    /*
     *                 *
     *                * *
     *              *  *  *
     *             *  *  *  *
     *              *  *  *
     *               *  *
     *                *
     */


    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" *");
            }
            System.out.println();


        }

        for (int i = 0; i < 4; i++) {
            for (int m = 0; m < i; m++) {
                System.out.print(" ");
            }
            for (int n = 4; n > i; n--) {
                System.out.print(" *");
            }

            System.out.println();


        }
    }


}
