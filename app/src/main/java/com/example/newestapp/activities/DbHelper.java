package com.example.newestapp.activities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DbHelper extends SQLiteOpenHelper {
    private static final String dbName = "GeoGuide.db";
    private static final int dbVersion = 1;
    private static final String tableName = "Users";
    private static final String colID = "ID";
    private static final String colName = "Name";
    private static final String colSurname = "Surname";
    private static final String colAge = "Age";
    private static final String colEmail = "Email";
    private static final String colPhoneNumber = "Phone Number";
    private static final String colPassword = "Password";

    private static final String createTable = "CREATE TABLE " + tableName + " (" +
            colID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + colName + " TEXT NOT NULL, "
            + colSurname + " TEXT NOT NULL, " + colAge + " TEXT NOT NULL, " + colEmail +
            " TEXT UNIQUE NOT NULL, " + colPhoneNumber + " TEXT NOT NULL, " +
            colPassword + " TEXT UNIQUE NOT NULL ";

    public DbHelper(Context context){
        super(context, dbName, null, dbVersion);
    } // constructor pentru crearea definitiva a bazei de date

    public void onCreate(SQLiteDatabase db){
        db.execSQL(createTable);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS", tableName);
        onCreate(db);
    }

    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        messageDigest.reset();
        messageDigest.update(password.getBytes());
        byte[] messageDigestArray = messageDigest.digest();
        StringBuilder stringBuilder = new StringBuilder(messageDigestArray.length * 2);

        for(byte b: messageDigestArray){
            int v = b & 0xff;
            if(v < 16)
                stringBuilder.append('0');
            stringBuilder.append(Integer.toHexString(v));
        }

        return stringBuilder.toString();
    }

    public static String getSalt() throws NoSuchAlgorithmException{ // prevents the collision of passwords that have been registered in the db
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[32];
        secureRandom.nextBytes(salt);
        return android.util.Base64.encodeToString(salt, Base64.NO_WRAP);
    }
    public void addUser(String name, String surname, String age, String email, String phoneNumber, String password){
        //String hashed = BCrypt.hashpw
    }



}
