package com.example.firstapp.data.usersTable;

import androidx.room.Dao;


import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;


import java.util.List;
@Dao
public interface mySubjectQurey1 {
    @Query("SELECT * FROM MySubject")
    List<MySubject> getAll();

    @Query("SELECT * FROM MyUser WHERE keyid IN (:userIds)")
    List<MySubject> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MyUser WHERE email = :myEmail AND " +
            "passw = :myPassw LIMIT 1")
    MySubject checkEmailPassw(String myEmail, String myPassw);

    @Insert
    void insertAll(MySubject... users);

    @Delete
    void delete(MySubject user);

    @Update
    void update(MySubject...values);


}
