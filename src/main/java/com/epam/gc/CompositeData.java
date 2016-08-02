package com.epam.gc;

import java.util.Date;

/**
 * Created by Sergey_Stefoglo on 7/31/2016.
 */
public class CompositeData {
    private String title;
    private String metadata;
    private Date created;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public CompositeData(String title, String metadata) {
        this.title = title;
        this.metadata = metadata;
        this.created= new Date();
    }
}