import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    ArrayList<String> pairs = new ArrayList<>();
    ArrayList<String> triplets = new ArrayList<>();
    int[] originalArray = {11, 24, 15, 21, 15, 45};
    int sum = 0;

    public static void main(String[] args) {

        Main m = new Main();
        System.out.println("Enter a value:");
        m.setSum(sc.nextInt());

    }

    public void setSum(int sum){
        this.sum = sum;

        findPairs(originalArray, getSum());
        findTriplets(originalArray, getSum());
    }

    public int getSum(){
        return sum;
    }

    //Method to find pairs
    public int findPairs(int[] arr, int sum) {
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for(int j = 1; j< arr.length; j++){
                if (arr[i] + arr[j] == sum) {
                    if(!pairs.contains("{" + arr[i] + "," + arr[j] + "}"))
                        pairs.add("{" + arr[i] + "," + arr[j] + "}");
                    count++;
                }
            }

        }
        if(count == 0){
            System.out.println("No pairs!");
            return -1;
        }else {
            System.out.println("Pairs are: ");
            for (String i: pairs) {
                System.out.println(i);
            }
            return 1;
        }
    }

    // Method to find triplets
    public int findTriplets(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length-2; i++) {
            for(int j = 1; j< arr.length-1; j++) {
                for(int k = 2; k< arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        if(!triplets.contains("{" + arr[i] + "," + arr[j] + "," + arr[j] + "}"))
                            triplets.add("{" + arr[i] + "," + arr[j] + "," + arr[k] + "}");
                        count++;
                    }
                }
            }
        }
        if(count == 0){
            System.out.println("No triplets found!");
            return -1;
        }else {
            System.out.println("Triplets are: ");
            for (String i: triplets) {
                System.out.println(i);
            }
            return 1;
        }
    }
}


