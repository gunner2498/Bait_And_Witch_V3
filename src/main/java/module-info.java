module com.example.bait_and_witch_v3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.bait_and_witch_v3 to javafx.fxml;
    exports com.example.bait_and_witch_v3;
}