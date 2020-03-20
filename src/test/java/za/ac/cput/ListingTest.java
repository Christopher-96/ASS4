package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListingTest {
    Listing listing;

    @Before
    public void setUp() throws Exception {
        listing = new Listing();
    }

    @Test
    public void addList() {
        int result1 = listing.totalList();
        listing.addList("Bro");
        int result = result1+1;
        Assert.assertEquals(result,listing.totalList());
    }



    @Test
    public void clearList() {
        Assert.assertEquals(0,listing.totalList());
    }

    @Test
    public void getAllList() {
        Assert.assertNotNull(listing);
    }

    @Test
    public void updateList() {
        listing.addList("bruh");
        listing.addList(0,"Bro");
        listing.addList("bruv");
        String result = "Brother";
        listing.updateList(1,result);
        int num = 1;
        Assert.assertEquals(result,listing.getSelecedList(1));



    }

    @Test
    public void removeSelected() {

        listing.addList("BRuh");
        listing.addList("Bruh");
        int result1 = listing.totalList();
        listing.removeSelected(0);
        int result = result1-1;
        Assert.assertEquals(result,listing.totalList());
    }


}