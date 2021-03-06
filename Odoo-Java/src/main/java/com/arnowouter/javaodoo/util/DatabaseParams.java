/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arnowouter.javaodoo.util;

/**
 *
 * @author Arno
 */
public class DatabaseParams {
    private String databaseName;
    private String databaseLogin;
    private String databasePassword;

    public DatabaseParams(String databaseName, String databaseLogin, String databasePassword) {
        this.databaseName = databaseName;
        this.databaseLogin = databaseLogin;
        this.databasePassword = databasePassword;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getDatabaseLogin() {
        return databaseLogin;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    @Override
    public String toString() {
        return "OdooDatabaseParams{" + "databaseName=" + databaseName + ", databaseLogin=" + databaseLogin + ", databasePassword=" + databasePassword + '}';
    }
    
}
