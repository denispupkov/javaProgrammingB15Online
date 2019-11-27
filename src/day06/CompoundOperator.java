package day06;
public class CompoundOperator {

    public static void main(String[] args) {

    int studentOnline =263;
    studentOnline=studentOnline+5; //5 people added

        System.out.println(studentOnline);
        studentOnline=studentOnline-3; //3 people left
        System.out.println(studentOnline);
        studentOnline=studentOnline*2; // people doubled
        studentOnline=studentOnline-(studentOnline/3); //dropped by third
        System.out.println(studentOnline);

        // using +=, -=, *=, /=, %= for above examples to make it simplier
        studentOnline-=3;
        System.out.println(studentOnline);
        studentOnline*=2;
        System.out.println(studentOnline);
        studentOnline/=3;
        System.out.println(studentOnline);
    }
}
