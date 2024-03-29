package com.derinmeilham.Contact.controllers;

import android.content.ContentValues;

import com.derinmeilham.Contact.utils.Database;
import com.derinmeilham.Contact.utils.DatabaseContents;

import java.util.List;
//NIM   : 10116004
//NAMA  : Derin Meilham
//Kelas : IF1
//Pengerjaan : 13 Agustus 2019
public class UserController {
    private static Database database;
    private static UserController instance;

    private UserController() {}

    public static UserController getInstance() {
        if (instance == null)
            instance = new UserController();

        return instance;
    }

    /**
     * Sets database for use in this class.
     * @param db database.
     */
    public static void setDatabase(Database db) {
        database = db;
    }

    public ContentValues getDataByEmail(String email) {
        String queryString = "SELECT * FROM " + DatabaseContents.TABLE_USERS + " WHERE email = '"+ email +"'";
        List<Object> contents = database.select(queryString);

        if (contents.isEmpty()) {
            return null;
        }

        ContentValues content = (ContentValues) contents.get(0);
        return content;
    }

    public Object getUsers() {
        List<Object> contents = database.select("SELECT * FROM " + DatabaseContents.TABLE_USERS);

        return contents;
    }

    public int register(ContentValues content) {
        int id = database.insert(DatabaseContents.TABLE_USERS.toString(), content);

        return id;
    }

    public boolean update(ContentValues content) {
        boolean update = database.update(DatabaseContents.TABLE_USERS.toString(), content);

        return update;
    }
}
