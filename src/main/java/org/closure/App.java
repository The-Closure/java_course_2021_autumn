package org.closure;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        ArrayList<String> kaaabour = new ArrayList<>();
        kaaabour.add(0, "zero element");
        kaaabour.clear();
        kaaabour.add("6 element");
        kaaabour.add("1 element");
        kaaabour.add("4 element");
        kaaabour.add("3 element");
        kaaabour.add("1 element");
        kaaabour.add("6 element");
        kaaabour.set(0, "2 element");
        Consumer<String> printConsumer = t -> {
            System.out.println(t);
        };
        kaaabour.forEach(t -> System.out.println(t));
        // Predicate
        
        kaaabour.stream().map(t -> t.charAt(0)).toList().forEach(t-> System.out.println(t));
        kaaabour.stream().filter(t-> {
            char c = t.charAt(0);
            int a = c;
            a = a - 48;
            return a >= 5;
        }).forEach(t-> System.out.println("filtered items : "+t));
        
        kaaabour.stream().sorted((u,v)->{
            char c = u.charAt(0);
            int a = c;
            a = a - 48;

            char d = v.charAt(0);
            int b = d;
            b = b - 48;

            return a - b;
        }).forEach(t->System.out.println("sorted items : " + t));
        kaaabour.removeIf(e -> true);
        HashMap<String, User> map = new HashMap<String, User>();
        map.put("admin", new User(1, "name"));
        map.put("emp", new User(2, "employee"));
        map.put("guest", new User(3, "Guest"));
        
        
    }

}
