import java.nio.file.Path;
import java.util.Hashmap;
import java.util.Map;

public class ArgumentParser {
    private final Map<String, String>;
    public ArgumentParser() {
        map = new Hashmap<>();
    }

    public ArgumentParser(String[] args) {
        this();
        //parse(args);
    }
}