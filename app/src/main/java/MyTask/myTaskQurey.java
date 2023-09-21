package MyTask;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
//واجهة استعلامات على جدول معطيات
public interface myTaskQurey {

    /**
     * اعادة جميع رمعطيات الجدول
     * @return قائمةمن.المهمات
     */
    @Query("SELECT * FROM MyUser")
    List<myTask> getAll();

    /**
     *
     * '@param userid_p
     * '@param isCompleted_p
     * '@return
     */
    @Query("SELECT * FROM myTask WHERE userId=:userid_p AND isCompleted=:isCompleted_p "
            +"ORDER BY importance DESC")
    List<myTask> taskOrderBy(long userid_p, boolean isCompleted_p);

    @Query("SELECT * FROM myTask WHERE userId=: userid_p " +
             " ORDER BY time DESC " )
    List<myTask> taskByTime(long userid_p);
    /**
     * ادخال مهمات
     * @param tasks مجموعة مهمات
     */
    @Insert
    void insertAll(myTask... tasks);// تلت نقط يعني مجموعة

    /**
     * حذف مهمات
     * '@param user
     */
    @Delete
    void delete(myTask user);

    @Query("Delete From myTask WHERE keyId=:id ")
    void deleteTask(long id);


    @Insert
    void insert(myTask task);

    /**
     * تعديل المهمات
     * '@param tasks
     */
    @Update
    void update(myTask...tasks);

}
