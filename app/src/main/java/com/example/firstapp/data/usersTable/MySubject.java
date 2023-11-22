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
    public long keyId;
    public long name;
    public String tName;

    public long getKeyId() {
        return keyId;
    }

    public long getName() {
        return name;
    }

    public String getName() {
        return tName;
    }

    public void setKeyId(long keyId) {
        this.keyId = keyId;
    }

    public void setName(long name) {
        this.name = name;
    }

    public void setName(String tName) {
        this.tName = tName;
    }

    @Override
    public String toString() {
        return "MySubject{" +
                "keyId=" + keyId +
                ", name=" + name +
                ", tName='" + tName + '\'' +
                '}';
    }
}





