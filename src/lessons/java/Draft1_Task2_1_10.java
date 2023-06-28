package lessons.java;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Draft1_Task2_1_10 {

//        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tНеобходимо вывести большими буквами названия всех " +
                "\nпродуктов из магазина электроники, написанного на уроке.\n\nРешение: ");
            /*IntStream.range(0, 5).map(n -> n * n).forEach(a -> System.out.print(a + " "));*/
            /*IntStream.range(0, 5).map(n -> n * n).forEach(System.out::println);*/
            /*IntStream.range(-10, 10).map(x -> x * x - 5 * x - 10).filter(x -> x>0).forEach(System.out::println);*/
            ArrayList<Product> catalog = new ArrayList<>();

            catalog.add(new Product("Nokia 3310", 12345676));
            catalog.add(new Product("Samsung Galaxy S100", 50304));
            catalog.add(new Product("IPhone 20", 392049));
            catalog.add(new Product("Google Pixel 10a", 203421));
            catalog.stream().map((product -> product.name)).forEach(x -> System.out.println(x.toUpperCase()));

    }

    //x^-5x-10
}
class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
//        Конец Примера _ КККККККККККККККК






////        Пример 1 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tНеобходимо вывести большими буквами названия всех " +
//                "\nпродуктов из магазина электроники, написанного на уроке.\n\nРешение: ");
//            /*IntStream.range(0, 5).map(n -> n * n).forEach(a -> System.out.print(a + " "));*/
//            /*IntStream.range(0, 5).map(n -> n * n).forEach(System.out::println);*/
//            /*IntStream.range(-10, 10).map(x -> x * x - 5 * x - 10).filter(x -> x>0).forEach(System.out::println);*/
//            ArrayList<Product> catalog = new ArrayList<>();
//
//            catalog.add(new Product("Nokia 3310", 12345676));
//            catalog.add(new Product("Samsung Galaxy S100", 50304));
//            catalog.add(new Product("IPhone 20", 392049));
//            catalog.add(new Product("Google Pixel 10a", 203421));
//            catalog.stream().map((product -> product.name + " " + product.price)).forEach(System.out::println);
//
//    }
//
//    //x^-5x-10
//}
//class Product {
//    String name;
//    int price;
//
//    public Product(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//}
////        Конец Примера 1 КККККККККККККККК












