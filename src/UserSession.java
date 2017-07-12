/**
 * Created by Lenovo on 12.07.2017.
 */
public class UserSession {
    private static UserSession ourInstance = new UserSession();

    public static UserSession getInstance() {
        return ourInstance;
    }

    private UserSession() {
    }
}
