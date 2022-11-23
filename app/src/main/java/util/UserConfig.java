package util;

import android.app.Application;

public class UserConfig extends Application {
    private String username;
    private String userId;
    private static UserConfig instance;

    public static UserConfig getInstance() {
        if (instance == null)
            instance = new UserConfig();
        return instance;

    }

    public UserConfig(){}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
