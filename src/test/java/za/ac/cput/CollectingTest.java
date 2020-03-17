package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CollectingTest {
Collecting collecting;
    @Before
    public void setUp() throws Exception {
        collecting= new Collecting();
    }

    @Test
    public void addList() {
        int result1 = collecting.totalArrayList();
        collecting.addList("Bro");
        int result = result1+1;
        Assert.assertEquals(result,collecting.totalArrayList());

    }



    @Test
    public void clearList() {
        Assert.assertEquals(0,collecting.totalArrayList());

    }

    @Test
    public void getAllList() {
        Assert.assertNotNull(collecting);
    }

    @Test
    public void removeSelected() {

        collecting.addList("BRuh");
        collecting.addList("Bruh");
        int result1 = collecting.totalArrayList();
        collecting.removeSelected(0);
        int result = result1-1;
        Assert.assertEquals(result,collecting.totalArrayList());

    }


}