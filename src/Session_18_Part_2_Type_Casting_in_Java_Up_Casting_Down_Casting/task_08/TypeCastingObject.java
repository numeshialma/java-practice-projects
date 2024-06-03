package Session_18_Part_2_Type_Casting_in_Java_Up_Casting_Down_Casting.task_08;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class TypeCastingObject {
    public static void main(String[] args) {

        Animal animal = new Dog();
        Cat cat = (Cat) animal;   // valid as per rule 2

    }
}
