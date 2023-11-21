package com.example.firstapp;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.firstapp.MyTask.MyTask;
import com.example.firstapp.MyTask.MyTaskQurey;
import com.example.firstapp.UsersTable.MyUser;
import com.example.firstapp.UsersTable.myUserQurey;
import com.example.firstapp.data.usersTable.MySubject;
import com.example.firstapp.data.usersTable.mySubjectQurey;

//3
@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version = 5)
public abstract class AppDatabase extends RoomDatabase
{
    private static AppDatabase db;
    public abstract myUserQurey getMyUserQuery();
    public abstract mySubjectQurey getMySubjectQuery();
    public abstract MyTaskQurey getMyTaskQuery();
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
