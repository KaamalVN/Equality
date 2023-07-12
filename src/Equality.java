import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        System.out.println(time_to_equality(array, size));
    }

    private static int time_to_equality(int[] array, int size) {
        int max_element=array[0];
        int array_sum=0;
        for(int i=0;i<size;i++){
            array_sum+=array[i];
            if(array[i]>max_element){
                max_element=array[i];
            }
        }
        return (max_element*(size-1))-(array_sum-max_element);
    }
}
