package day41;

public class Person {

    private String name;
    private int age;
    private long ssn;

    public String getName() { //GETTER
        return name;
    }

    public void setName(String newName) { // SETTER
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public long getSsn(int newSsn) {
        return ssn;
    }

    public void setSsn(int newSsn) {
        ssn = newSsn;
    }

    //after wrapping up the into the method we can set access
    public void setAll(String newName, int newAge, long newSsn) {
        name = newName;
        age = newAge;
        ssn = newSsn;


    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
}
