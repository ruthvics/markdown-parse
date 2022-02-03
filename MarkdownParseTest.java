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
        assertEquals("[https://something.com]", MarkdownParse
                .getLinks("[a link!](https://something.com)\nhowever the vector [0,2,3] )(\n![alt text](CSE15L.jpg)")); // checks
                                                                                                                        // if
                                                                                                                        // these
                                                                                                                        // two
                                                                                                                        // parameters
                                                                                                                        // are
                                                                                                                        // equal
    }

}
