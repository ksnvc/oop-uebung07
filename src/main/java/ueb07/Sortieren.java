package ueb07;

public class Sortieren {

   public static <T> T[] swap(T[]array, int a, int b){
       if(array.length>1){
        T hilf=array[a];
        array[a] = array[b];
        array[b] = hilf;}
        return array;

    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array){
     int a = array.length;
       for(int n = a; n>1; n--){
            for (int i = 0; i < n - 1; i++) {
                for (int j = 1; j < n; j++) {
                    if (array[i].compareTo(array[j])>0)
                        swap(array, i, j);

                }
            }
        }
   }

}

