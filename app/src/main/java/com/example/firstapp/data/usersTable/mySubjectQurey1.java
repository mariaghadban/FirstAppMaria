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

    @Query("SELECT * FROM mysubject WHERE keyid IN (:userIds)")
    List<MySubject> loadAllByIds(int[] userIds);

    @Query("Delete From MySubject WHERE keyid=:id ")
    void delete(int id);

    @Insert
    void insertAll(MySubject... users);

    @Delete
    void delete(MySubject user);

    @Update
    void update(MySubject...values);


}