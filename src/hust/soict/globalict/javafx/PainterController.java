package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private RadioButton radioButtonEraser;

    @FXML
    private RadioButton radioButtonPen;

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (event.getX() >= 0 && event.getY() >= 0) {
            Color inkColor = Color.BLACK;
            int radius = 4;

            // Nếu cục tẩy được chọn
            if (radioButtonEraser.isSelected()) {
                inkColor = Color.WHITE;
                radius = 10;
            }

            Circle newCircle = new Circle(event.getX(), event.getY(), radius, inkColor);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }
}