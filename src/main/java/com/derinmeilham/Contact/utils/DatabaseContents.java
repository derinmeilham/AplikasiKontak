package com.derinmeilham.Contact.utils;

//NIM   : 10116004
//NAMA  : Derin Meilham
//Kelas : IF1
//Pengerjaan : 13 Agustus 2019

public enum DatabaseContents {

    DATABASE("loginsederhana.db"),
    TABLE_USERS("tbl_users");

    private String name;

    /**
     * Constructs DatabaseContents.
     * @param name name of this content for using in database.
     */
    private DatabaseContents(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
