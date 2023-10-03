package com.example.firstapp;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.firstapp.data.usersTable.myUser;
import com.example.firstapp.data.usersTable.myUserQurey;

//3
@Database(entities = {myUser.class, my.class, MyTask.class},version = 5)
public abstract class AppDatabase extends RoomDatabase
{
    private static AppDatabase db;
    public abstract myUserQurey getMyUserQuery();
    public abstract MySubjectQuery getMySubjectQuery();
    public abstract my getMyTaskQuery();
    public static AppDatabase getDB(Context context)
    {
        if(db==null)
        {
            db = Room.databaseBuilder(context,
                            AppDatabase.class, "database-name")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return db;
    }
}
