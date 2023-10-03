module es.ieslosmontecillos.animacionyefectosvisuales {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.animacionyefectosvisuales to javafx.fxml;
    exports es.ieslosmontecillos.animacionyefectosvisuales;
}