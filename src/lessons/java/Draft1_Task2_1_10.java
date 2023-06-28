package lessons.java;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Draft1_Task2_1_10 {

//        Пример _ ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) {
        System.out.println("Задание : \n1.\tПНеобходимо вывести большими буквами названия всех " +
                "\nпродуктов из магазина электроники, написанного на уроке.\n\nРешение: ");
            /*IntStream.range(0, 5).map(n -> n * n).forEach(a -> System.out.print(a + " "));*/
            IntStream.range(0, 5).map(n -> n * n).forEach(System.out::println);
    }
}

//        Конец Примера _ КККККККККККККККК






////        Пример _ ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание : \n1.\tПНеобходимо вывести большими буквами названия всех " +
//                "\nпродуктов из магазина электроники, написанного на уроке.\n\nРешение: ");
//
//        ArrayList<Product> catalog = ArrayList<>();
//        catalog.add(new Product("Nokia 3310, 12345676"));
//        catalog.add(new Product("Samsung Galaxy S100, 50304"));
//        catalog.add(new Product("IPhone 29, 392049"));
//        catalog.add(new Product("Google Pixel 10a, 203421"));
//        catalog.stream().map((product -> product.price)).forEach(System.out::println);
//    }
//}
//
//class Product {
//}
////        Конец Примера _ КККККККККККККККК






