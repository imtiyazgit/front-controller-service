package com.example.springbootfrontcontrollerservice;

/**
 * Created by imtiyaz on 8/11/17.
 */
public class CardDetails {
    private User user;
    private String type;
    private int limit;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
