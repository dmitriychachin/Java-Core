package lesson4;

public class WrongPasswordExeption {
        private static WrongPasswordExeption instance;
        public String value;

        private WrongPasswordExeption(String value){
            System.out.println("WrongPasswordExeption");
            this.value = value;
        }

        public static WrongPasswordExeption getInstance(String value){
            if (instance == null){
                instance = new WrongPasswordExeption(value);
            }
            return instance;
        }
}
