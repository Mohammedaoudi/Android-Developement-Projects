package com.tppizza.v1.dao;

import com.tppizza.v1.beans.Produit;

import java.util.List;

public interface IDao <T>{
    boolean create(T o);
    boolean update(T o);
    boolean delete(T o);
    List<T> findAll();
    T findById(int id);
}
