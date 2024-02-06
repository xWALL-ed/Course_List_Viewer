module com.example.depsubviewer {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.depsubviewer to javafx.fxml;
    exports com.example.depsubviewer;
}