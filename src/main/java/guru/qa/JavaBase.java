package guru.qa;

public class JavaBase {

    public static void main(String[] args) {

        //boolean - хранит значение true или false
        boolean isActive = false;
        boolean isAlive = true;
        System.out.println(isActive);
        System.out.println(isAlive);

        //String — строковые переменные, не представляют собой примитивы и хранят в себе целые строки.
        String name = "Kot";
        System.out.println("example of String: " + "Привет, " + name);

        //Bite - хранит целое число от -128 до 127 и занимает 1 байт
        byte aByte = 2;
        byte bByte = 10;
        System.out.println(aByte + bByte);

        //Int - от хранит целое число от -2147483648 до 2147483647 и занимает 4 байта
        int aInt = 2;
        int bInt = 12;
        System.out.println(bInt / aInt);

        //Long - хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
        long aLong = 2;
        long bLong = 12;
        System.out.println(aLong - bLong);

        //Short - хранит целое число от -32768 до 32767 и занимает 2 байта
        short aShort = 13;
        short bShort = 5;
        System.out.println(aShort * bShort);

        //Double - хранит число с плавающей точкой от ±4.9*10-324 до ±1.8*10308 и занимает 8 байт
        double aDouble = 1.5;
        double bDouble = 15;
        System.out.println(aDouble % bDouble);

        //Float - хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
        float aFloat = 1.5f;
        System.out.println(aFloat);

        //Char - хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
        char aChar = '1';
        System.out.println(aChar);

        //переполнение max
        int cInt = 2147483647;
        int dInt = 2147483647;
        int eInt = cInt + dInt;
        System.out.println(eInt);

        //переполнение min
        int fInt = -1500000000;
        int gInt = -2000000000;
        int hInt = fInt + gInt;
        System.out.println(hInt);

        //Вычисления комбинаций типов данных (int и double)
        int jInt = 5;
        double cDouble = 1.5;
        System.out.println(jInt + cDouble);

        //вычисления комбинаций типов данных (int и long)
        int iInt = 5;
        long cLong = 12;
        System.out.println(cLong - iInt);

        //if
        if (aInt != 222 && aByte < 15)
            System.out.println("OK");

        //if+else
        int age = 70;
        boolean isSenior = (age > 65);
        if (isSenior) {
            System.out.println("Old");
        } else {
            System.out.println("Young");
        }
    }
}