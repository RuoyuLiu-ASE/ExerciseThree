/**
 * @author: Alan
 * @create: 2019-10-17 22:12
 * @function:
 * @version:
 * @important value:
 */
public class TaskTwo {
    public static void main(String []args){
/*        for (int i=1;i<101;){
            for (int j=1;j<11;j++){
                if(i%5 != 0) {
                    System.out.print(" "+i);
                }
                i++;
            }
            System.out.println(" ");
        }
 */

        for (int i=1;i<101;){
                if(i%5 != 0) {
                    System.out.print(" "+i);
                }
                if (i%10 == 0){
                    System.out.println(" ");
                }
                i++;
        }

    }
}
