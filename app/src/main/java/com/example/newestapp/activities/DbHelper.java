package com.example.newestapp.activities;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class DbHelper extends SQLiteOpenHelper {
    private static final String dbName = "GeoGuide.db";
    private static final int dbVersion = 2;
    private static final String tableName = "Users";
    private static final String colID = "ID";
    private static final String colName = "Name";
    private static final String colSurname = "Surname";
    private static final String colUsername = "Username";
    private static final String colAge = "Age";
    private static final String colEmail = "Email";
    private static final String colPhoneNumber = "Phone_Number";
    private static final String colPassword = "Password";

    private static final String createTable = "CREATE TABLE " + tableName + " (" +
            colID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            colUsername + " TEXT NOT NULL, " +
            colName + " TEXT NOT NULL, " +
            colSurname + " TEXT NOT NULL, " +
            colAge + " TEXT NOT NULL, " +
            colEmail + " TEXT UNIQUE NOT NULL, " +
            colPhoneNumber + " TEXT NOT NULL, " +
            colPassword + " TEXT UNIQUE NOT NULL"+");";

    public DbHelper(Context context){
        super(context, dbName, null, dbVersion);
    } // constructor pentru crearea definitiva a bazei de date

    public void onCreate(SQLiteDatabase db){
        db.execSQL(createTable);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + tableName);
        onCreate(db);
    }

    public static String hashPassword(String password) throws NoSuchAlgorithmException { // this is exception handling
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
    public boolean addUser(String name, String surname, String username, String age, String email, String phoneNumber, String password){
        try {
            String hashPass = hashPassword(password);
        }catch(Exception e){
            System.out.println("Password error.");
            return false;
        }

        SQLiteDatabase dbUser = this.getWritableDatabase();
        ContentValues content = new ContentValues();
        content.put(colName, name);
        content.put(colSurname, surname);
        content.put(colUsername, username);
        content.put(colAge, age);
        content.put(colEmail, email);
        content.put(colPhoneNumber, phoneNumber);

        try {
            content.put(colPassword, hashPassword(password));
        }catch(Exception e){
            System.out.println("Database error.");
            return false;
        }

        long id;
        try{
            id = dbUser.insert(tableName, null, content);
        }catch (Exception e){
            System.out.println("Database error");
            return false;
        }

        return id != -1;
    }

    public boolean checkUser(String userName, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(tableName, new String[] {colPassword}, colUsername + "=?", new String[] {userName}, null, null, null);

        if(cursor != null && cursor.moveToFirst()){
            String storedHash = cursor.getString(cursor.getColumnIndexOrThrow(colPassword));
            try {
                return storedHash.equals(hashPassword(password));
            }catch(Exception e){
                System.out.println("Database error");
            }
            finally{cursor.close(); db.close();}
        }
        return false;
    }





}
