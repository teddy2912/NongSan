package com.example.project.ui.constract;

import com.example.project.data.model.Product;

import java.util.List;

public interface HomeConstract {
    interface IView{
        void setProductListToView(List<Product> productList);
        void showProductDetail(Product product);
    }

    interface IPresenter{
        void setView(IView view);
        void getProductList();
        void getProduct(int productId);
    }
}
