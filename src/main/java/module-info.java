module vst.musicxmltoirealgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires MusicXMLToIRealLib;

    opens vst.musicxmltoirealgui to javafx.fxml;
    exports vst.musicxmltoirealgui;
}