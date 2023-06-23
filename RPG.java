import java.util.Random;
import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Witaj w prostym RPG!");
        System.out.print("Podaj imię bohatera: ");
        String heroName = scanner.nextLine();
        System.out.println("\nWybierz klasę bohatera:");
        System.out.println("1. Human");
        System.out.println("2. Elf");
        System.out.println("3. Dwarf");
        int heroClassChoice = scanner.nextInt();
        Human hero;
        switch (heroClassChoice) {
            case 1:
                hero = new Human(heroName);
                break;
            case 2:
                hero = new Elf(heroName);
                break;
            case 3:
                hero = new Dwarf(heroName);
                break;
            default:
                System.out.println("Nieprawidłowy wybór klasy. Twój bohater zostanie ustawiony jako Human.");
                hero = new Human(heroName);
                break;
        }
        System.out.println("\nTwój bohater " + hero.getName() + " został stworzony!");
    }
}

class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Elf extends Human {
    public Elf(String name) {
        super(name);
    }
}

class Dwarf {
    private String name;

    public Dwarf(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
