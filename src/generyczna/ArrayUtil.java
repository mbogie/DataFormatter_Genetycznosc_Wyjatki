package generyczna;
// metoda to wyswiwtlania tablicy roznych klas


public class ArrayUtil {

    public <T> void showArray(T[] array){
        for(T element : array){
            System.out.println(element);
        }
    }

    public <T> void changeElement(T[] array, int ind1,int ind2){

        if(ind1>=0 && ind2>=0 && ind1< array.length && ind2< array.length){
            showArray(array);

            T c = array[ind1];
            array[ind1] = array[ind2];
            array[ind2] = c;
            System.out.println("------------------------");
            showArray(array);
        }
    }
    public<T extends Comparable> T getmaxElement(T[] array) {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            T elementOfIndex = array[i];
            if (elementOfIndex.compareTo(max) > 0) {
                max = elementOfIndex;
            }
        }
        return  max;
    }

}
