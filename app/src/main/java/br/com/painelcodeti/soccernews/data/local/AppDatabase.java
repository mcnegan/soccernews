package br.com.painelcodeti.soccernews.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.painelcodeti.soccernews.domain.News;

@Database(entities = {News.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NewsDao NewsDao();

    public abstract NewsDao newsDao();
}
