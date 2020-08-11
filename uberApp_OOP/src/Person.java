/** Superclass: Person
 * 
 * Inheritance
 * 
 * Encapsulation
* 
* mechanism of wrapping the data (variables) and code acting on the data (methods) 
* together as a single unit; provides you control over accesibility of data members of a class
* 
* Getters (read-only) and setters (write only) are ways to encapsulate members
* 
* Encapsulation allows you to control what members of a class are changeable by a client (ex. Account balance)
* 
* It also allows you to validate the change being made (ex. Age)
 */

//  Person siphe = new Person("siphe", "sinare", "07838282", 123.12);
// siphe.name = "Siphe2";
//  Person siphe = new Person("Siphe", "sinare", "07838282", 123.12);

public class Person {

    //instance variables: attributes
   //Instance variables hold values that must be referenced by more than one method or a constructor .
  
    private String name;
    private String surname;
    private String phone_number;
    private double cash;

    //constructor
    // the constructors are used to initialize the object class and also it does not have a return type
    Person(String name, String surname, String phone_number, double cash) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.cash = cash;
    }

    //methods: behaviour
    
    //setters
    //setters is the method that can updated the value of the variable
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    //getters
    //getters it a method that reads the value of tthe variable
    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }
    
    public String getPhoneNumber(){
        return this.phone_number;
    }
    
    public double getCash(){
        return this.cash;
    }
//toString method
    //used to return the representation of an object
    //it is used to return name of the person and thier surname
    
    public String toString() {
        return this.name + " " + this.surname;
    }
}
