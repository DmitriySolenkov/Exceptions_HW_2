public class Ex2 {
    public static void main(String[] args) {

        try {
            int d = 0;
            // Не понял, что значит intArray[8]/d. Деление массива на число?
            double catchedRes1 = 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
