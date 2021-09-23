import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class MergeAlgoTest {
    /*static int[] unsorted;
    static int[] sorted;

    @BeforeAll
    public static void init() {
       unsorted = new int[]{10,40,23,12,22,77};
       sorted = new int[]{10,12,22,23,40,77};
       System.out.println("hallo");
    }*/


    int[] unsorted;
    int[] sorted;


    @BeforeEach
    public void init() {
        unsorted = new int[]{10,40,23,12,22,77};
        sorted = new int[]{10,12,22,23,40,77};
        System.out.println("hallo");
    }




    @Test
    void main() {

        int neu[] = MergeAlgo.halbieren(unsorted);

        for(int i = 0; i < sorted.length; i++){

            Assertions.assertEquals(sorted[i], neu[i]);

        }

    }



    @org.junit.jupiter.api.Test
    void halbieren() {




    }
}
