package Application;

import java.util.Scanner;
import Entity.Person;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person[] = new Person[5];
        person[0] = new Person("Bruno", "M", 27);
        person[1] = new Person("Maria", "F", 23);
        person[2] = new Person("Marcos", "M", 28);
        person[3] = new Person("Fabina", "F", 21);
        person[4] = new Person("Breno", "M", 22);

        int count = 1;
        for (int i = 0; i < person.length; i++) {
            System.out.println(count + " - " + person[i]);
            count++;
        }

        System.out.println("Who are you looking for?");
        String name = sc.next();
        count = 1;

        for (int i = 0; i < person.length; i++) {
            if (name.equals(person[i].getName())) {
                System.out.println(name + " was found in the database at count " + count);
                System.out.println(name + " is " + person[i].getAge() + " years old");

            } else {
                System.out.println(name + " not found in index: " + (count));
                count++;
            }
        }

        sc.close();
    }
}