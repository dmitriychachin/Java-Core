package lesson4.lesson4_task2;

public class Exeption {
    public static class CustomerException extends RuntimeException {
        public CustomerException(String message) { super(message); }
    }
    public static class ProductException extends RuntimeException {
        public ProductException(String message) { super(message); }
    }
    public static class AmountException extends RuntimeException {
        public AmountException(String message) { super(message); }
    }

}
