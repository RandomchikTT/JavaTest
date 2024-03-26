public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;
    // mvn compile, mvn test, mvn package, mvn clean, mvn install
    public Tester(String name, String surname) {
        this(name, surname, 0, "Beginner", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 0.0);
    }
    // Maven - это инструмент для автоматизации сборки проектов,
    // управления зависимостями и производства отчетов по проекту.
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    // Gradle - это система автоматизации сборки и управления зависимостями,
    // которая используется в разработке программного обеспечения.
    public void introduce() {
        System.out.println("Hello, I'm " + name + " " + surname);
    }

    public void introduce(String greeting) {
        System.out.println(greeting + ", I'm " + name + " " + surname);
    }

    public void introduce(String greeting, String position) {
        System.out.println(greeting + ", I'm " + name + " " + surname + ", " + position);
    }

    public static void staticMethodExample() {
        Tester tester1 = new Tester("John", "Doe");
        Tester tester2 = new Tester("Jane", "Smith", 5);
        Tester tester3 = new Tester("Alice", "Johnson", 3, "Advanced", 5000.0);

        System.out.println("Tester 1:");
        tester1.introduce();
        System.out.println();

        System.out.println("Tester 2:");
        tester2.introduce();
        System.out.println();

        System.out.println("Tester 3:");
        tester3.introduce();

        System.out.println("Это статический метод.");
    }
}

