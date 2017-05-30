package com.example.sunny.contextualactionmode;

/**
 * Created by Sunny on 5/31/2017.
 */

public class Contact {
    int image_id;
    String name, email;

    public Contact(int image_id, String name, String email) {
        this.image_id = image_id;
        this.name = name;
        this.email = email;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
