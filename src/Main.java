import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(permission(19, 13.9));
        System.out.println(permission(generateRandomAge(),16.2));
        System.out.println(permission(16,17.5));
        System.out.println(permission(generateRandomAge(),generateRandomTemperature()));
        System.out.println(permission(18,13.6));
    }

    public static String permission(int age, double temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age <= 20 && temperature >= 0 && temperature <= 20) || (age >= 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        return random.nextInt(70);
    }
    public static double generateRandomTemperature(){
        Random random = new Random();
        return random.nextDouble(40.3);
    }
}