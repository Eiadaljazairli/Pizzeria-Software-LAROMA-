module pizzeria {

    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires java.persistence;
    requires java.sql;
    requires org.hibernate.orm.core;

    opens de.brandenburg.th.se.pizzeria.application.jfx;
    opens de.brandenburg.th.se.pizzeria.domain.speisekarte;

}




