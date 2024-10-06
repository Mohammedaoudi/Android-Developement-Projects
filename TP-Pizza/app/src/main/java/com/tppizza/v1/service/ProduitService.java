package com.tppizza.v1.service;

import com.tppizza.v1.beans.Produit;
import com.tppizza.v1.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;
    private List<Produit> favProduits;

    private static ProduitService instance;

    public ProduitService() {
        this.produits = new ArrayList<>();
        this.favProduits = new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : produits) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void addToFavorites(Produit produit) {
        if (!favProduits.contains(produit)) {
            favProduits.add(produit);
        }
    }

    public void removeFromFavorites(Produit produit) {
        favProduits.remove(produit);
    }

    public List<Produit> getFavorites() {
        return favProduits;
    }
}
