package com.quickblox.AndroidVideoChat.model;

import com.quickblox.module.users.model.QBUser;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew Dmitrenko
 * Date: 6/17/13
 * Time: 10:17 AM
 */
public class DataHolder {

    private static DataHolder dataHolder;
    private QBUser currentQbUser;

    private DataHolder() {
    }

    public static synchronized DataHolder getInstance() {
        if (dataHolder == null) {
            dataHolder = new DataHolder();
        }
        return dataHolder;
    }

    public void setCurrentQbUser(QBUser currentQbUser) {
        this.currentQbUser = currentQbUser;
    }

    public QBUser getCurrentQbUser() {
        return currentQbUser;
    }

}
