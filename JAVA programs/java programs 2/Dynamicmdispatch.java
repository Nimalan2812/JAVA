class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class Dynamicmdispatch{
    public static void printSound(Animal a){
        a.makeSound();
    }

    public static void main(String a[]){
        Animal myAnimal = new Animal();
        printSound(myAnimal);
        myAnimal = new Dog();

        printSound(myAnimal);
    }
}
