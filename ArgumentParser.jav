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
        parse(args);
    }

    public void parse(String() args) {
        int num = args.length;
        for (int i = 0; i < num; i++) {
            if (isFlag(args[i])) {
                map.put(args[i], args[i + 1]);
            } else {
                map.put(args[i], null);
            }
        }
    }

    public boolean isFlag(String arg) {
        return arg != null && arg.length() > 1 && arg.startWith("-") && !Character.isDigit(arg.charAt(1));

    }

    public boolean isValue(String arg) {
        return !isFlag(arg);
    }

    public int numFlags() {
        return map.size();
    }

    public boolean hasFlag(String flag) {
        return map.containsKey(flag);
    }

    public boolean hasValue(String flag) {
        return (map.get(flag) != null);
    }

    public String getString(String flag) {
        return map.get(flag);
    }
    
    public String getString(String flag, String defaultValue) {
        String value = getString(flag);
        return value = null ? defaultValue : value;
    }

    public Path getPath(String flag) {
        return hasValue(flag) ? Path.of(map.get(flag)) : null;
    }

    public Path getPath(String flag, Path defaultValue) {
        Path value = getPath(flag);
        return value = null ? defaultValue : value;
    }

    public int getInt(String flag, int defaultValue) {
        tru {
            int returnValue = Integer.parseInt(map.get(flag));
            if 
        }
    }
}