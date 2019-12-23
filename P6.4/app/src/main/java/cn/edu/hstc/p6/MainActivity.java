package cn.edu.hstc.p6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List <File> list = new ArrayList<>();

    //1.声明相对应对象
    EditText editTextInsert;
    EditText editTextUpdateBefore;
    EditText editTextUpdateAfter;
    EditText editTextDel;

    TextView textViewDisplay;

    Button buttonInsert;
    Button buttonUpdate;
    Button buttonDel;
    Button buttonQuery;
    Button buttonClean;

    MySQLiteOpenHelper dbHelper;
    SQLiteDatabase db;
    public void onDestroy() {

        super.onDestroy();
        if (db!=null) {
            db.close();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //2.关联
        editTextInsert =findViewById(R.id.editTextInsert);
        editTextUpdateBefore =findViewById(R.id.editTextUpdateBefore);
        editTextUpdateAfter =findViewById(R.id.editTextUpdateAfter);
        editTextDel=findViewById(R.id.editTextDel);

        textViewDisplay=findViewById(R.id.textViewDisplay);

        buttonInsert=findViewById(R.id.buttonInsert);
        buttonUpdate=findViewById(R.id.buttonUpdate);
        buttonDel=findViewById(R.id.buttonDel);
        buttonQuery=findViewById(R.id.buttonQuery);
        buttonClean=findViewById(R.id.buttonClean);


        dbHelper=new MySQLiteOpenHelper(MainActivity.this,"My_Database",null,1);
        db=dbHelper.getWritableDatabase();







        //3.监听
        //buttonInsert
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String insert_data=editTextInsert.getText().toString().trim();
                ContentValues values=new ContentValues();
                values.put("name",insert_data);
                db.insert("user",null,values);
                Cursor cursor=db.query("user",new String []{"name"},null,null,null,null,null,null);
//                File f=new File(insert_data);
//                list.add(f);
//


            }
        });
        //buttonUpdate
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String before_data=editTextUpdateBefore.getText().toString().trim();
                String after_data=editTextUpdateAfter.getText().toString().trim();
                ContentValues values2=new ContentValues();
                values2.put("name",after_data);
                db.update("user",values2,"name=?",new String[]{before_data});
                Cursor cursor=db.query("user",new String []{"name"},null,null,null,null,null,null);
                //String data="";
//                while(cursor.moveToNext())
//                {
//                    String  name= cursor.getString(cursor.getColumnIndex("name"));
//                    File f=new File(name);
//                    list.add(f);
//                    //data=data+"\n"+name;
//                }
//                //textViewDisplay.setText(list);
//                cursor.close();




            }
        });
        //buttonDel
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String del_data=editTextDel.getText().toString().trim();
                db.delete("user","name=?",new String []{del_data});
                Cursor cursor=db.query("user",new String []{"name"},null,null,null,null,null,null);
                //String data="";
//                while(cursor.moveToNext())
//                {
//                    String  name= cursor.getString(cursor.getColumnIndex("name"));
//                    File f=new File(name);
//                    list.add(f);
//                    //data=data+"\n"+name;
//                }
//                //textViewDisplay.setText(list);
//                cursor.close();
//
            }
        });
        //buttonQuery
        buttonQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int i=0;

           Cursor cursor=db.query("user",new String []{"name"},null,null,null,null,null,null);
             //String data="";
                File fn=new File("最新查询结果为");
                list.add(fn);
               while(cursor.moveToNext())
              {
                    String  name= cursor.getString(cursor.getColumnIndex("name"));
                   File f=new File(name);
                    list.add(f);


                    //data=data+"\n"+name;
                }



                //textViewDisplay.setText("");
                cursor.close();

                MyAdapter adapter;
                RecyclerView recycler=(RecyclerView)findViewById(R.id.recycler);
                StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
               recycler.setLayoutManager(layoutManager);
               adapter=new MyAdapter(list);
               recycler.setAdapter(adapter);
                //i++;




            }
        });








        //buttonClean
        buttonClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //把文本框清空
                editTextInsert.setText(" ");
                editTextUpdateBefore.setText(" ");
                editTextUpdateAfter.setText(" ");
                editTextDel.setText(" ");
                //textViewDisplay.setText(" ");

            }
        });






    }
}
