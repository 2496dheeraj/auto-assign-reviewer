import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {
    private Main m;
    int[] arr = {1,2,3,4,5};

    @BeforeEach
    public void setup(){
        m = new Main();
    }


    @Test
    void sumValueTest(){
        m.setSum(12);
        assertEquals(12, m.getSum());
    }

    @Test
    void findPairsTest() {
        int pass = m.findPairs(arr,7);
        int fail = m.findPairs(arr,10);
        assertEquals(1, pass);
        assertEquals(-1, fail);
        assertTrue(m.pairs.contains("{2,5}"));
    }

    @Test
    void findTriplets() {
        int pass = m.findTriplets(arr,6);
        int fail = m.findTriplets(arr,15);
        assertEquals(1, pass);
        assertEquals(-1, fail);
    }

}