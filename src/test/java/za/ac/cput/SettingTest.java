package za.ac.cput;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SettingTest {
Setting setting;
    @Before
    public void setUp() throws Exception {
        setting = new Setting();
    }

    @Test
    public void addSet() {
        setting.addSet("a");
        int result1 = setting.totalSets();
        setting.addSet("b");
        int result2 = result1+1;
        Assert.assertEquals(result2,setting.totalSets());
    }

    @Test
    public void getAll() {
        Assert.assertNotNull(setting);
    }

    @Test
    public void removeSelection() {
      String result1="one";
      String result2 ="Two";
      setting.addSet(result1);
      setting.addSet(result2);
      int result3 =setting.totalSets();
      setting.removeSelection(result2);
      int result4 = result3-1;
      Assert.assertEquals(result4,setting.totalSets());
    }

    @Test
    public void removeAll() {
        Assert.assertEquals(0,setting.totalSets());
    }
}