package vst.musicxmltoirealgui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import musicxml.MusicXMLConverter;

import java.io.File;

public class MainController {

    @FXML
    private VBox root;

    @FXML
    public void initialize() {

    }

    public void openFile(ActionEvent e) {
        FileChooser chooser = new FileChooser();

        File file = chooser.showOpenDialog(root.getScene().getWindow());
        chooser.setInitialDirectory(
                new File(System.getProperty("user.home"))
        );

        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("musicxml files", "*.musicxml"));

        MusicXMLConverter converter = new MusicXMLConverter();
        converter.convertPart(file).build();
    }

}