module com.example.myfirstprogram {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.myfirstprogram to javafx.fxml;
    exports com.example.myfirstprogram;
}