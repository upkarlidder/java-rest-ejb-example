/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upkar.example.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author upkar
 */
@javax.ws.rs.ApplicationPath("resources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> list = new java.util.HashSet<Class<?>>();
        return list;
    }
    
}
