module com.test.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.test.test to javafx.fxml;
    exports com.test.test;
}