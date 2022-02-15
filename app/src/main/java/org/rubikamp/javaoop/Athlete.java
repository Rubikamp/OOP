package org.rubikamp.javaoop;

public class Athlete {

    String name;
    String lastName;
    int dateOfBirth;
    static int registrationNumber = 0;

    public Athlete(String name, String lastName, int dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        registrationNumber++;
    }

    public void showAthleteInfo() {
        System.out.println("Your name is " + name);
        System.out.println("Your last name is " + lastName);
        System.out.println("Your date of birth is " + dateOfBirth);
        System.out.println("Your registration No is " + registrationNumber);
    }

    public static int showAllAthletes() {
        return registrationNumber;
    }
}
