package com.example.firstapp.MyTask;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

//واجهة استعلامات على جدول معطيات
@Dao
public interface MyTaskQurey {

    /**
     * اعادة جميع رمعطيات الجدول
     * @return قائمةمن.المهمات
     */
    @Query("SELECT * FROM MyTask")
    List<MyTask> getAll();

    /**
     *
     * '@param userid_p
     * '@param isCompleted_p
     * '@return
     */
    @Query("SELECT * FROM myTask WHERE userId=:userid_p AND isCompleted=:isCompleted_p "
            +"ORDER BY importance DESC")
    List<MyTask> taskOrderBy(long userid_p, boolean isCompleted_p);

    @Query("SELECT * FROM myTask WHERE userId=:userid_p " +
             " ORDER BY time DESC " )
    List<MyTask> taskByTime(long userid_p);
    /**
     * ادخال مهمات
     * @param tasks مجموعة مهمات
     */
    @Insert
    void insertAll(MyTask... tasks);// تلت نقط يعني مجموعة

    /**
     * حذف مهمات
     * '@param user
     */
    @Delete
    void delete(MyTask user);

    @Query("Delete From myTask WHERE keyId=:id ")
    void deleteTask(long id);


    @Insert
    void insert(MyTask task);

    /**
     * تعديل المهمات
     * '@param tasks
     */
    @Update
    void update(MyTask...tasks);

    List<MyTask> getAllTasks();
}
