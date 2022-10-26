package com.example.myapplication4;

public class Fruit {

    private String nom;
    private String description;
    private String nomIcon;

    public Fruit(String nom, String desc, String nom_icone)
    {
        this.nom = nom;
        this.description=desc;
        this.nomIcon=nom_icone;
    }

    public String Nom()
    {
        return nom;
    }
    public String Description()
    {
        return description;
    }

    public String NomIcon()
    {
        return nomIcon;
    }
}
