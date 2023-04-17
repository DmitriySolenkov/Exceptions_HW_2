public class Ex3 {
    public static void main(String[] args) {// Убрал throws exception, так как из метода main некуда пробрасывать
                                            // исключение.
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
            // Перенес catch на Trowable в самый конец, так как по иерархии он будет
            // перехватывать все исключения в самом начале.
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // Убрал "throws FileNotFoundException", так как метод не ссылается на файл.
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
