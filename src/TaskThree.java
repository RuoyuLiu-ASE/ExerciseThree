/**
 * @author: Alan
 * @create: 2019-10-18 11:01
 * @function:
 * @version:
 * @important value:
 */
public class TaskThree {
    public static void main(String[] args) {
        int []values = {13,9,22,49,5,-27,-8};
        int lengthofvalues = values.length;
        int sum=0;
        double ave=0.0;
        for(int m=0;m < lengthofvalues;m++){
            sum = sum+values[m];
            ave = (double) sum/(m+1);
            System.out.println("The sum of the array until number "+values[m]+" is: "+ sum);
            System.out.println("***************************");
            System.out.println("The average of the array until number "+ values[m]+ " is:"+ ave);
            System.out.println("***************************");
        }
    }
}

