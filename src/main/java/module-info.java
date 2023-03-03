module com.example.ecommerce1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.ecommerce1 to javafx.fxml;
    exports com.example.ecommerce1;
}