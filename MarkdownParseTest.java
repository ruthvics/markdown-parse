import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    ArrayList<String> answ = new ArrayList<String>();
    Path test1;

    public void setAnsw() {
        answ.add("https://something.com");
    }

    @Test
    public void addition() throws IOException {
        setAnsw();
        assertEquals(answ, MarkdownParse.getLinks(Files.readString(Path.of("test2.md")))); // checks
                                                                                           // if
                                                                                           // these
                                                                                           // two
                                                                                           // parameters
                                                                                           // are
                                                                                           // equal
    }

}
