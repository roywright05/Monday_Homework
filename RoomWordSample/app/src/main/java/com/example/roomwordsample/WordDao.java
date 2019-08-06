package com.example.roomwordsample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insert(Word word);

    @Query("DELETE FROM word_table")
    public void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC")
    public LiveData<List<Word>> getAllWords();
}
