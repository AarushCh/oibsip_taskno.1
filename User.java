import java.util.HashMap;
import java.util.Map;

public class User {
    private static Map<String, String> userDatabase = new HashMap<>();

    static {
        userDatabase.put("admin", "password");
        userDatabase.put("AUC", "AUC123");
    }

    public static boolean validateUser(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}
