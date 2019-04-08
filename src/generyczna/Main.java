package generyczna;
import java.time.*;



public class Main {

    public static void main(String[] args) {

        String[] arrayString = {"a","afa","f5g3","fwef"};
        Integer[] arrayInteger = {1,3,4,6,99,0};
        Boolean[] arrayBooean = {true,false,true,true,false};

        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.showArray(arrayBooean);
        arrayUtil.showArray(arrayInteger);
        arrayUtil.showArray(arrayString);


//        Kot[] koty = {new Kot("Mruczek"), new Kot("Filemon"),new Kot("Kalkier")};
//        System.out.println(arrayUtil.getmaxElement(arrayInteger));
//        System.out.println(arrayUtil.getmaxElement(arrayString));
//        System.out.println(arrayUtil.getmaxElement(koty));
        //System.out.println(LocalDateTime.now());
      //  System.out.println("-------");



    }
}
