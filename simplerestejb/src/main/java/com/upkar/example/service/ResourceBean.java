/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upkar.example.service;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author upkar
 */
@Singleton
public class ResourceBean {
    String jsonString;
    
    @PostConstruct
    private void init()
    {
        jsonString = "["
                + "{name:'john smith',email:'john@example.org},"
                + "{name:'adam benson',email:'adam@example.org}"
                + "]";
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }
}
