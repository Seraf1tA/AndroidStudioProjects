package com.example.seraf.babiarz.krzysztof.mydailyplanner;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHandler extends SQLiteOpenHelper{

    // database version
    private static final int DATABASE_VERSION = 1;

    // database name
    private static final String DATABASE_NAME = "tasks.db";

    // database tasks
    private static final String TASKS = "tasks";

    // tasks column
    private static final String TASK_MON = "taskMon";
    private static final String TASK_TUE = "taskTue";
    private static final String TASK_WED = "taskWed";
    private static final String TASK_THU = "taskThu";
    private static final String TASK_FRI = "taskFri";
    private static final String TASK_SAT = "taskSat";
    private static final String TASK_SUN = "taskSun";

    String CREATE_TASK_TABLE = "CREATE TABLE " + TASKS + "(" + TASK_MON + " TEXT," + TASK_TUE
            + " TEXT," + TASK_WED + " TEXT," + TASK_THU + " TEXT," + TASK_FRI + " TEXT," + TASK_SAT
            + " TEXT," + TASK_SUN + " TEXT" + ")";

    public SqliteHandler(Context context){

        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    // need this overide otherwise do error
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TASK_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TASKS);

        onCreate(db);

    }
}
