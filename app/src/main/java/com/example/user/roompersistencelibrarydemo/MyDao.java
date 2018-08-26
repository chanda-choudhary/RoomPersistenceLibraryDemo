package com.example.user.roompersistencelibrarydemo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

/**
 * Created by Chanda on 25/08/2018
 */

@Dao
public interface MyDao {

    @Insert
    public void addUser(User user);
}
