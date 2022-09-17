package Lessons.Exceptions.Lesson3;


import java.util.Arrays;

public class MainApp {
    private static CvImage cvLib;

    public static void main(String[] args) {
        //#region
        try {
            CvImage img = cvLib.loadImage("way");
            cvLib.filters().blur(img, 2);
        } catch (JavaCVException.IllegalFilterParametersException e) {
            System.out.println("incorrect parameters filter");
        } catch (JavaCVException e) {
            System.out.println("Ops");
        }
        //#endregion
        System.out.println(Arrays.toString(transform(new String[]{"1", "2a", "3", "4"})));
    }

    public static int[] transform(String[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            try {
                output[i] = Integer.parseInt(input[i]);
            } catch (NumberFormatException e) {
                throw new ArrayTransformationException(i, input[i]);
            }
        }
        return output;
    }
}
