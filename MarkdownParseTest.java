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
        assertEquals(" ", MarkdownParse.getLinks("test4.md")); // checks if these two parameters are equal
    }

}
