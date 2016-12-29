package space.eignatik.zadolbaliparser.AppCore.webhelper;

import org.junit.Test;
import org.testng.Assert;
import space.eignatik.zadolbaliparser.AppCore.Item;

import java.util.List;

public class ParserTest {
    @Test
    public void getTitlesDoesWork() {
        List<Item> list =  Parser.getItems();
        Assert.assertTrue(!list.isEmpty());
    }
}
