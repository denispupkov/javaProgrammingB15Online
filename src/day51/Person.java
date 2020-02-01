package day51;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//COMPARE BY AGE!!!!!!!!!
//    @Override
//    public int compareTo(Person otherPerson) {
//        if (this.age>otherPerson.age) {
//            return 1;
//        }
//    else if(this.age<otherPerson.age) {
//        return -1;
//        }
//    else {
//        return 0;
//        }
//    }

    //COMPARE BY NAME!!!!!!!!!!!!!!!
    @Override
    public int compareTo(Person otherPerson) {
//        if (this.name.charAt(0)>otherPerson.name.charAt(0)) {
//            return 1;
//        }
//        else if(this.name.charAt(0)<otherPerson.name.charAt(0)) {
//            return -1;
//        }
//        else {
//            return 0;
//        }

        return this.name.compareTo(otherPerson.name); //IT REPLACES THE ENTIRE CODE ABOVE!!!!!!
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public int compareTo(Person o) {
//        return 0;
//    }
}
