package com.example.Database;

import java.sql.Connection;
import java.util.ArrayList;

public interface DAO<T> {
    
    Connection c = DBConnection.getInstance();

    public boolean ajouter(T obj);
    public boolean supprimer(T obj);
    public boolean modifier(T obj);
    public T afficher(int id);
    public ArrayList<T> afficherTous();
}
