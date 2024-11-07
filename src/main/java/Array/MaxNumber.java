package Array;

public class MaxNumber {
    public static void main(String[] args){
        int[] num = {5, 7, 3, 14, 65, 0};

        int max = num[0];

        for(int i = 0; i < num.length; i++){
            if(max < num[i]){
                max = num[i];
            }
        }
        System.out.println(max);
    }
}
