public class Animal
{
    // class (static) variable; 1 copy only, bound to the Animal class
    private static int currentYear = 2023;

    // attributes/fields/instance variables; one copy per instance/Java object
    private String name;
    private int birthYear;
    // private=data hiding; prevent access from any other class other than Animal

    // (custom) constructor method
    public Animal(String name, int birthYear)
    {
        this.name = name;
        this.birthYear = birthYear;
    }

    // overloading the constructor; if no bY is given, assume it's the current one
    public Animal(String name)
    {
        this.name = name;
        birthYear = currentYear;
    }

    // accessor method aka "getters"
    public String getName()
    {
        return this.name;
    }

    public int getBirthYear()
    {
        return birthYear;
    }

    public int getAge()
    {
        return currentYear - birthYear;
    }

    // mutator/modifier methods
    public void setName(String name)
    {
        this.name = name;
    }

    /*
    public void setBirthYear(int year)
    {
        this.birthYear = year;
    }
    */

    // https://en.wikipedia.org/wiki/List_of_animal_sounds
    public void talk()
    {
        System.out.println(this.getName() + " don't talk!");
    }

    public void eat()
    {
        System.out.println(getName() + " eats food.");
    }

    public String toString()
    {
        String output = "Class: " + getClass().getName() +
        " | Name: " + this.name + "  |  " + "Age: " + this.getAge();
        return output;
        // also
        // return "Name: " + this.name + "    " + "Age: " + this.getAge();
    }

}
