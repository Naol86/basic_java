package basic_java;

public class selection_sort {
    public static void main(String[] args){
        int num[]={1,5,2,4,3};
        for (int i=0 ;i<num.length;i++){
            int Index = i;
            for (int j=i+1 ;j<num.length;j++){
                if(num[j]<num[Index])
                    Index = j ;
            }
            //swap the minimum element with current number at ith position in array
            int temp = num[i];
            num[i] = num[Index];
            num[Index]=temp;
            for (int k = 0; k < num.length; k++) {
                System.out.print(num[k]+" ");
            }
            System.out.println();
        }
    }
}
