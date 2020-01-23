package day46;

public class SqlProgrammer extends Programmer {

    //access modifier in sub class can have same visibility or more visibility
    @Override
    protected void code() {
        super.code();
        System.out.println("write Query");
    }

    @Override
    public void test() {
        super.test();
        System.out.println("testing sql query");
    }

    public void writeSQLQuery() {
        System.out.println("write SQL Query");
    }

}
