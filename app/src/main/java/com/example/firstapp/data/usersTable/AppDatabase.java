package com.example.firstapp.data.usersTable;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import MyTask.myTask;

//3
@Database(entities = {myUser.class, myUserQurey.class, myTask.class},version = 5)
public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase db;

    public abstract myUserQurey getMyUserQuery();

    public abstract mySubjectQuery getMySubjectQuery();

    public abstract MyTaskQuery getMyTaskQuery();

    public static AppDatabase getDB(Context context) {
        if (db == null) {
            db = Room.databaseBuilder(context,
                            AppDatabase.class, "database-name")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return db;
    }
}