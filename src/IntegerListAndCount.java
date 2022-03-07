import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerListAndCount {

    public static void integerListAndCount(List<Integer> list,int count){
        System.out.println("The Input of IntegerListAndCount: "+list +", "+count);

        int a[]=new int[count];
        int index=0;
        for (int i:list){
            if(i>=0 && i<=10 || i>=90 &&i<=100){
                if(index<count){
                    a[index]=i;
                    index=index+1;
                }
            }
            if (index==count) break;
        }
        System.out.println(Arrays.toString(a));
    }
    }

