package io.javabrains.course_api_data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Topic {
    
    @Id
    private String id;
    private String name;
    private String description;

    public Topic(){}

    public Topic (String id, String name, String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getid() {
        return id;
    }
    public void setid(String id) {
        this.id = id;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getdescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description = description;
    }
}
