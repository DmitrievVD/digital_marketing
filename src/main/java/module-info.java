module com.example.digital_marketing {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.digital_marketing to javafx.fxml;
    exports com.example.digital_marketing;
}