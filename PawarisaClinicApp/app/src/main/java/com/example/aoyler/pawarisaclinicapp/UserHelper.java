package com.example.aoyler.pawarisaclinicapp;

        import android.content.Context;
        import android.content.SharedPreferences;
        import android.content.SharedPreferences.Editor;

public class UserHelper {

    Context context;
    SharedPreferences sharedPerfs;
    Editor editor;

    // Prefs Keys
    static String perfsName = "UserHelper";
    static int perfsMode = 0;

    public UserHelper(Context context) {
        this.context = context;
        this.sharedPerfs = this.context.getSharedPreferences(perfsName, perfsMode);
        this.editor = sharedPerfs.edit();
    }

    public void createSession(int sX, int sY) { // sUserID = RelativeID
        editor.putInt("X", sX);
        editor.putInt("Y", sY);
        editor.commit();
    }

    public void createSession(String sUserID, int sCount) { // sUserID = RelativeID
        editor.putString("UserID", sUserID);
        editor.putInt("CountPatient", sCount);
        editor.commit();
    }

    public void deleteSession() {
        editor.clear();
        editor.commit();
    }

    public boolean getLoginStatus() {
        return sharedPerfs.getBoolean("LoginStatus", false);
    }

    public String getUserName() {
        return sharedPerfs.getString("Username", null);
    }

    public String getUserID() {
        return sharedPerfs.getString("UserID", null);
    }

    public int getCountPatient() {
        return sharedPerfs.getInt("CountPatient", 0);
    }

    public int getX() {
        return sharedPerfs.getInt("X", 0);
    }

    public int getY() {
        return sharedPerfs.getInt("Y", 0);
    }

    public String getEmail() {
        return sharedPerfs.getString("Email", null);
    }
}
