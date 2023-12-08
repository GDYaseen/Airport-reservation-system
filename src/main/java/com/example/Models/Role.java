package com.example.Models;

import java.util.ArrayList;

public class Role {
    private ArrayList<Permission> permissions=new ArrayList<Permission>();
    private String name;

    public Role(ArrayList<Permission> permissions, String name) {
        this.permissions = permissions;
        this.name = name;
    }
    //#region getters and setters

    public ArrayList<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //#endregion
}
