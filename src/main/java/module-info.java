module com.zidan.taskmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.zidan.taskmanager to javafx.fxml;
    exports com.zidan.taskmanager;
    exports com.zidan.taskmanager.controller;
    opens com.zidan.taskmanager.controller to javafx.fxml;
}