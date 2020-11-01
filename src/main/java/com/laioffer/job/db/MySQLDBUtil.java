package com.laioffer.job.db;

public class MySQLDBUtil {
    public static final String INSTANCE = "laiproject-instance.cdqdrzroacym.us-east-2.rds.amazonaws.com";
    public static final String PORT_NUM = "3306";
    public static final String DB_NAME = "laiproject";
    public static final String USERNAME = "admin";
    public static final String PASSWORD = "";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}
