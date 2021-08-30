module com.desktop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires java.xml.bind;
    requires net.bytebuddy;
    requires com.fasterxml.classmate;

    opens com.desktop to javafx.fxml;
    opens com.desktop.controller to javafx.fxml;
    opens com.desktop.entity to org.hibernate.orm.core ;

    exports com.desktop;
    exports com.desktop.util;
    exports com.desktop.controller;
    exports com.desktop.entity;
    exports com.desktop.repository;
    exports com.desktop.stage;
    exports com.desktop.repositoryImpl;

}