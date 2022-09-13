package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.project.data.DatabaseDao;
import com.example.project.data.DatabaseSQlite;
import com.example.project.data.dao.CategoryDao;
import com.example.project.data.model.Category;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rc;
    List<String> studentName = new ArrayList<>();
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void register(){
        btn = findViewById(R.id.btn_register);
    }
    private void nextActivity(){
        Intent intent = new Intent(MainActivity.this, RegisterActivity.class );
        startActivity(intent);
    }

    private void initGUI(){
        rc = findViewById(R.id.rc);
    }
    private void initData(){
//        for (int i = 0; i < 10; i++){
//            studentName.add("Student " + i);
//        }
//        StudentAdapter adapter = new StudentAdapter(studentName);
//        rc.setAdapter(adapter);
//        rc.setLayoutManager(new LinearLayoutManager(this));

        DatabaseDao.init(new DatabaseSQlite(this));
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        Category category = new Category(1,"Rau cu", "Rau cu");
        categoryDao.insert(category);

        List<Category> categoryList = categoryDao.all();
        for (Category cat: categoryList) {
            Log.i("Category", String.format("id:$d - name:%s - description:%s", cat.id, cat.name, cat.description));
        }
        Category find = categoryDao.find(1);
        categoryDao.delete(1);

        category.name = "Rau cu";
        categoryDao.update(category);
    }

}