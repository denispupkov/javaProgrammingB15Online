package day46;

public class Repl187 {


    public static String lameDb(String db, String op, String id, String data) {
        db = "1tst#2bla#3foo";
        // if (op.equals("add")) {

        //    db = db + "#" + id + data;
        //}
        if (op.equals("edit")) {
            db = db.replaceAll(db.substring(db.indexOf(id, db.indexOf("#"))), id + data) + "#" + db.substring(db.indexOf((id)));
            //   db=db.replaceAll("2bla","2bbb");
        }

//if (op.equals("delete")) {
        // db=db.replaceAll(db.substring(db.indexOf(id,db.indexOf("#"))),"");
        //   db=db.replaceAll("1tst","");
//}
//if (op.equals("none")) {
        //   db=db;


        return db;
    }//end lameDb


    public static void main(String[] args) {


        System.out.print(
                lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo", "none", "1", "") + "\n"
        );

    }

}

