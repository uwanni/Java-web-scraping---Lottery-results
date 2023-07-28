import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class LotteryNumbers {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("https://www.dlb.lk/").get();

        Elements element = doc.getElementsByClass("col-md-8 no_padding");

        for (Element x : element){

            if(x.text().contains("Jayoda")) {
                System.out.println(x.text());
            }
        }
    }
}