package MyTask;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao //واجهة استعلامات على جدول معطيات
public interface myTaskQurey {
    @Query("SELECT * FROM MyUser")
    List<myTask> getAll();

    @Query("SELECT * FROM MyUser WHERE keyid IN (:userIds)")
    List<myTask> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM MyUser WHERE email = :myEmail AND " +
            "passw = :myPassw LIMIT 1")
    myTask checkEmailPassw(String myEmail, String myPassw);

    @Insert
    void insertAll(myTask... users);

    @Delete
    void delete(myTask user);

    @Query("Delete From myTask WHERE keyid=:id ")
    void delete(int id);

    @Insert
    void insert(myTask myUser);
    @Update
    void update(myTask...values);

}
