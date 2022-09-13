package com.example.project.data;

import android.content.Context;

import com.example.project.data.dao.CategoryDao;
import com.example.project.data.dao.OrderDao;
import com.example.project.data.dao.OrderDetailDao;
import com.example.project.data.dao.ProductDao;
import com.example.project.data.dao.UserDao;
import com.example.project.data.implement.CategoryDaoImplement;
import com.example.project.data.implement.OrderDaoImplement;
import com.example.project.data.implement.OrderDetailDaoImplement;
import com.example.project.data.implement.ProductDaoImplement;
import com.example.project.data.implement.UserDaoImplement;

public class DatabaseSQlite extends DatabaseDao{
    private Context context;

    public DatabaseSQlite(Context context){
        this.context = context;
    }
    @Override
    public CategoryDao getCategoryDao() {
        return new CategoryDaoImplement(context);
    }

    @Override
    public ProductDao getProductDao() {
        return new ProductDaoImplement();
    }

    public UserDao getUserDao(){ return new UserDaoImplement();}

    public OrderDao getOrderDao(){ return new OrderDaoImplement();}

    public OrderDetailDao getOrderDetailDao(){ return new OrderDetailDaoImplement();}
}
