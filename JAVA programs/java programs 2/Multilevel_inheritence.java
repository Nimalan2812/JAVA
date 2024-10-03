import java.util.Scanner;
class Animal {
    protected String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getSpeciesName() {
        return speciesName;
    }
}

class Mammal extends Animal {

    protected boolean hasFur;

    public Mammal(String speciesName, boolean hasFur) {
        super(speciesName); 
        this.hasFur = hasFur;
    }

    public boolean getHasFur() {
        return hasFur;
    }
}

class Dog extends Mammal {
    private String breed;

    public Dog(String speciesName, boolean hasFur, String breed) 
    {
        super(speciesName, hasFur); 
        this.breed = breed;
    }

    public String getBreed()
    {
        return breed;
    }
}

public class Multilevel_inheritence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter species name:");
        String speciesname=scan.nextLine();
        System.out.print("enter hasfur:");
        Boolean hasfur=scan.nextBoolean();
        scan.nextLine();
        System.out.print("enter breed:");
        String breed=scan.nextLine();
        Dog dog = new Dog(speciesname,hasfur,breed);
        System.out.println("Species: " + dog.getSpeciesName());
        System.out.println("Has Fur: " + dog.getHasFur());
        System.out.println("Breed: " + dog.getBreed());
    }
}


