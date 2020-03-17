package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MappingTest {
Mapping mapping;
    @Before
    public void setUp() throws Exception {
        mapping =new Mapping();
    }

    @Test
    public void addKV() {
        int result1 = mapping.totalMaps();
        mapping.addKV("String",12);
        int result2 = result1+1;
        Assert.assertEquals(result2,mapping.totalMaps());

    }

    @Test
    public void getAllKV() {
        Assert.assertNotNull(mapping);
    }

    @Test
    public void searchK() {
        mapping.addKV("Bruh",1);
        mapping.addKV("Bro",2);
        mapping.searchK("bro");
        Assert.fail();
    }



    @Test
    public void clearAll() {
        Assert.assertEquals(0,mapping.totalMaps());
    }
}