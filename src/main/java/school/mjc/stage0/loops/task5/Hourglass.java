package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        if (height % 2 == 0) {
            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (i == j) {
                        for (int k = 0; k < height - 2 * i; k++) {
                            System.out.print("8");
                        }
                    } else {
                        System.out.print(" ");

                    }
                }
                System.out.println();
            }

            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (i == j) {
                        for (int k = 0; k < height - j * (height / 2 - 1); k++) {
                            System.out.print("8");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else
        {
            for (int i = 0; i < height / 2; i++) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (i == j) {
                        for (int k = 0; k < height - 2 * i; k++) {
                            System.out.print("8");
                        }
                    } else {
                        System.out.print(" ");

                    }
                }
                System.out.println();
            }

            for (int i = 0; i < height; i++) {
                if(i == height/2)
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();

            for (int i = height / 2 - 1; i >= 0; i--) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (i == j) {
                        for (int k = 0; k < height - j * (height / 2 ); k++) {
                            System.out.print("8");
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}