package streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PersonResponse {
    String name;
    int age;

    public PersonResponse(){}

    public PersonResponse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "PersonResponse [name=" + name + ", age=" + age + "]";
    }
}


class Person {
    String name;
    int age;
    String password;

    public Person(){}

    public Person(String name, int age,String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}


public class MapExample {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();

        Person p1=new Person("John",17,"user123");
        Person p2=new Person("Ram",25,"user123");
        Person p3=new Person("Shyam",21,"user123");
        Person p4=new Person("Hari",18,"user123");
        Person p5=new Person("Gita",30,"user123");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        personList.stream()
                .filter(person -> person.age>20)
                .forEach(person -> System.out.println(person.name));

        // map ->
        List<PersonResponse> personResponseList= personList.stream()
                .filter(person -> person.age>20)
                .map(person->{
                    PersonResponse personResponse=new PersonResponse(person.name,person.age);
                    return personResponse;
                })
                .collect(Collectors.toList());

        System.out.println(personResponseList.toString());

    }
}
