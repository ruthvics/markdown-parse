import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.nio.file.Path;

public class MarkdownParseTest {

    List<String> answ;
    Path test1;

    @Test
    public void addition() {
        assertEquals(2, 1 + 1); // checks if these two parameters are equal
    }

    @Test
    public void parseTestPathOne() {
        // MarkdownParse.getLisnks("test-file.md");
        answ = List.of("https://something.com", "some-page.html");
        // ArrayList<String>(MarkdownParse.getLinks("test-file.md"));
        // ArrayList<Strings> = new ArrayList<Strings>()
        // assertEquals(MarkdownParse.getLinks("test-file.md"), "[https://something.com,
        // some-page.html]");

        test1 = Path.of("test-file.md");

        // List.of("a", "b", "c")
    }

    @Test
    public void testContentOne() {
        assertEquals(answ, MarkdownParse.getLinks(test1));
    }
}
