package ueb07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;


public class SortierenTest {

    @Test
    public void testSwap() {
        Assertions.assertArrayEquals(new Integer[]{}, Sortieren.swap(new Integer[]{},0, 0));
        Assertions.assertArrayEquals(new Integer[]{1}, Sortieren.swap(new Integer[]{1},0, 0));
        Assertions.assertArrayEquals(new Integer[]{2,3,5}, Sortieren.swap(new Integer[]{2,5,3},1, 2));
        Assertions.assertArrayEquals(new Character[]{'A', 'B', 'c'}, Sortieren.swap(new Character[]{'A','c','B'},1, 2));


    }
    @Test
    public void testSort() {
        Integer[] sorted = new Integer[]{5,2,3,6};
        Sortieren.bubbleSort(sorted);
        Assertions.assertArrayEquals(new Integer[]{2,3,5,6}, sorted);

    }
}
