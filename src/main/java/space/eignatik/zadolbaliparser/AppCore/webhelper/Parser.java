package space.eignatik.zadolbaliparser.AppCore.webhelper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import space.eignatik.zadolbaliparser.AppCore.Item;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static final Logger logger = LogManager.getLogger(Parser.class.getName());
    private static String baseURL = "http://zadolba.li";

    public static List<Item> getItems() {
        List<Item> titleList = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(baseURL).get();
            Elements titles = doc.select(".story > h2 > a");
            Elements metas = doc.select(".story > .meta");
            Elements text = doc.select(".story > .text");
            Elements ids = doc.select(".story > .id");
            for (int i = 0; i < titles.size(); i++) {
                titleList.add(new Item(ids.get(i).text(), titles.get(i).text(), text.get(i).text(), metas.get(i).text()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return titleList;
    }

}
