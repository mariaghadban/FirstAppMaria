package com.example.firstapp.data.usersTable;

import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Entity
public class MySubject {


    @PrimaryKey(autoGenerate = true)//تحديد الصفة كمفتاح رئيسي والذي يُنتجح بشكل تلقائي
    public long name;
    public String tName;

    @Override
    public String toString() {
        return "name{" +
                "=" +
                ", tName='" + tName + '\'' +

                '}';
    }


}





