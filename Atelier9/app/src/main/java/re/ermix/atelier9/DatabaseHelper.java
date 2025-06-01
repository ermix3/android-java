package re.ermix.atelier9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "formation.db";
    public static final String TABLE_NAME = "formation";
    public static final String COL_2 = "titre";
    public static final String COL_3 = "type";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (id INTEGER PRIMARY KEY AUTOINCREMENT, titre TEXT, type TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertFormation(String titre, String type) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_2, titre);
        cv.put(COL_3, type);
        return db.insert(TABLE_NAME, null, cv) != -1;
    }

    public Cursor getAllFormations() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
    }

    public boolean updateFormation(int id, String titre, String type) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COL_2, titre);
        cv.put(COL_3, type);
        return db.update(TABLE_NAME, cv, "id=?", new String[]{String.valueOf(id)}) > 0;
    }

    public boolean deleteFormation(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "id=?", new String[]{String.valueOf(id)}) > 0;
    }
}
