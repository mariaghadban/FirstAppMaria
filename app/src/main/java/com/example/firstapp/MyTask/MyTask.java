package com.example.firstapp.MyTask;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class MyTask {
    @PrimaryKey(autoGenerate = true)//تحديد الصفة كمفتاح رئيسي والذي يُنتجح بشكل تلقائي
    public long keyId;
    public int importance;
    public String text;
    public long subId;
    public long userId;
    public long time;
    public boolean isCompleted;


    @Override
    public String toString() {
        return "myTask{" +
                "keyId=" + keyId +
                ", importance=" + importance +
                ", text='" + text + '\'' +
                ", subId=" + subId +
                ", userId=" + userId +
                ", time=" + time +
                ", isCompleted=" + isCompleted +
                '}';
    }

    //public List<MyTask> getAllTasks() {
    //}
}
