package com.example.firstapp.data.usersTable;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface myUserQurey {
    @Query("SELECT * FROM MyUser")
    List<myUser> getAll();

    @Query("SELECT * FROM MyUser WHERE keyid IN (:userIds)")
    List<myUser> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MyUser WHERE email = :myEmail AND " +
            "passw = :myPassw LIMIT 1")
    myUser checkEmailPassw(String myEmail, String myPassw);

    @Insert
    void insertAll(myUser... users);

    @Delete
    void delete(myUser user);

    @Query("Delete From myUser WHERE keyid=:id ")
    void delete(int id);

    @Insert
    void insert(myUser myUser);
    @Update
    void update(myUser...values);

}
