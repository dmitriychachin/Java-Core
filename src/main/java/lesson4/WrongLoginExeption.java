package lesson4;

public final class WrongLoginExeption {
    private static WrongLoginExeption instance;
    public String value;

    private WrongLoginExeption(String value){
        System.out.println("WrongLoginExeption");
        this.value = value;
    }

    public static WrongLoginExeption getInstance(String value){
        if (instance == null){
            instance = new WrongLoginExeption(value);
        }
        return instance;
    }
}
