import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {

    @Test // indicates the following method is a junit test
    public void addition() { // method header
        assertEquals(2, 1 + 1); // checking whether the first and second params are equal, fail test if not
    }

    @Test
    public void testSnippet1() throws IOException {
        String contents = Files.readString(Path.of("./snp1.md"));
        List<String> expected = List.of("google.com", "`google.com", "ucsd.edu");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet2() throws IOException {
        String contents = Files.readString(Path.of("./snp2.md"));
        List<String> expected = List.of("a.com", "a.com(())", "example.com");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet3() throws IOException {
        String contents = Files.readString(Path.of("./snp3.md"));
        List<String> expected = List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/",
                "https://cse.ucsd.edu/");
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    // -------------------------------------------------------------------------------

    // @Test
    // public void testGetLinks8() throws IOException{
    // String contents =
    // Files.readString(Path.of("C:/Users/jonat/git/markdown-parse/test-file8.md"));
    // List<String> expected = List.of();
    // assertEquals(expected,MarkdownParse.getLinks(contents));
    // }

}