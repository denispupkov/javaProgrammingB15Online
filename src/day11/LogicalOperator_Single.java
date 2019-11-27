package day11;

public class LogicalOperator_Single {

    public static void main(String[] args) {


        // && is called short circuit AND
        //

        //System.out.println(9/0==3);
        System.out.println(5>10 && 9/0==3); //OK (gives false and then does't check other condition
        System.out.println(5>10 & 9/0==3); //ERROR (gives false and continue to check other condition
        System.out.println( 10>5 || 9/0 ==3); //OK (gives false and then does't check other condition after ||
        System.out.println( 10>5 | 9/0 ==3); //ERROR (gives false and continue to check other condition after |

    }
}
