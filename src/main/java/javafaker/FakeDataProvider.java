package javafaker;

import com.github.javafaker.Faker;

public class FakeDataProvider {

    static Faker  faker = new Faker();

    public static void main(String[] args) {

        System.out.println(generateFakeName());
        System.out.println(generateFakeLastname());
        System.out.println(generateFakeMailAddress());
        System.out.println(generateFunnyWord());
    }

    public static String generateFakeName(){
        return faker.name().firstName().toString();
    }

    public  static  String generateFakeLastname(){
        return faker.name().lastName();
    }

    public static String generateFakeMailAddress(){
        return faker.internet().emailAddress();
    }

    public static String generateFunnyWord(){
        return faker.chuckNorris().fact();
    }
}
