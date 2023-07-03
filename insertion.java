package basic_java;

public class insertion{
    public static void main(String[] args) {
        int num[] = { 3, 4, 1, 5, 6, 0, 9, 7 ,8,200,11,15,10};
        for (int i=1 ;i<num.length;i++){
            for(int j=i;j>0;j--){
                if(num[j]<num[j-1]){
                    int temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                }
            }
            for (int k = 0; k < num.length; k++) {
                System.out.print(num[k] + " ");
            }
            System.out.println();
        }
    }
}