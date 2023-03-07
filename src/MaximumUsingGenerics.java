import java.util.ArrayList;

public class MaximumUsingGenerics {
    public static <new_data> void main (String[] args) {


//        Scanner sc=new Scanner(System.in);
        Integer num[]={12,55,33};
        Double dNum[]={12.5,34.6,77.8,99.0};
        Character char_[]={'a','b','c'};
//        maximum(num);
        maximum(1,2,3);

    }


//    public static <I > void maximum(I a[]){
//        I test = a[0];
//        System.out.println();
//        for(I a2:a){
//
//            System.out.println(a2);
//        }
//    }
//    public static Integer maximum(Integer num[]){
//        Integer max=num[0];
//        for (Integer i =0;i<num.length;i++){
//            if(num[i].compareTo(num[i])){
////                num=num[i];
//            }
//        }
//        return null;
//    }
public static Integer maximum(Integer a,Integer b,Integer c){
    Integer max=a;
    if(b.compareTo(max)>0){
        max=b;
    }
    if (c.compareTo(max)>0){
        max=c;
    }
    System.out.println(max);
    return max;
}


}






//class MaxNum<new_data>{
//
//    public MaxNum(new_data[] num) {
//        new_data maxValue  = num[0];
//        for (int i =0;i<num.length;i++){
//            if(num[i].compareTo(maxValue)){
//                maxValue=num[i];
//            }
//        }
//        System.out.println("Max Value is :"+maxValue);
//    }
//}

