package com.tracktopell.jaxrsjee7.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

/**
 * /restapi/generic
 * REST Web Service
 *
 * @author Alfredo Estrada
 */
@Path("/generic")
@RequestScoped
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * /restapi/generic/date
     * @return date
     */
    @Path("/date")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getDate() {
        Date today=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(today);
    }

}
