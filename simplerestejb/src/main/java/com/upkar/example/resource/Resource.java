/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upkar.example.resource;

import com.upkar.example.service.ResourceBean;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author upkar
 */
@Path("resources")
@Stateless
public class Resource {
    @EJB
    private ResourceBean bean;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getResource()
    {
        return bean.getJsonString();
    }
}
