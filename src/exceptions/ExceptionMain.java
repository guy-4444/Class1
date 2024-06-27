package exceptions;

import shapes.*;

public class ExceptionMain {

    public static void start() {
        System.out.println("!START!");


        int[] arr = new int[]{1, 10, 100, 1000};
        int res = 0;
        try {
            res = foo(3, arr, 4);
        } catch (FooException e) {

        } catch (NegativeException e) {

        }
        System.out.println(res);


        String distance = "50km";
        int dInt = -1;
        try {
            dInt = Integer.parseInt(distance);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Distance in miles = " + (dInt / 1.6));
    }

    private static int foo(int number, int[] arr, int i) throws FooException, NegativeException {
        if (i >= arr.length) {
            throw new FooException("Index to large");
        }
        if (number < 0) {
            throw new NegativeException("Negative number not supported..");
        }
        return number * arr[i];
    }

    /**
     * Exception for overflow indexes..dsfdsfsddfsdfdsf
     */
    public static class FooException extends Exception {
        public FooException(String message) {
            super(message);
        }
    }

    public static class NegativeException extends Exception {
        public NegativeException(String message) {
            super(message);
        }
    }

}
