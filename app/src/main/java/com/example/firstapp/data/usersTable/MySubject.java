package com.example.firstapp.data.usersTable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

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





