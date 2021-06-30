package app.view.menuBarView;

import java.io.File;
import java.nio.file.Paths;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MenuBarController {
    @FXML
    private MenuItem jsonSettings;
    @FXML
    private MenuItem csvFile;
    @FXML
    private MenuItem algoChoose;
    private StringProperty settingFile;
    private StringProperty csvFileString;
    private StringProperty algorithmFile;

    
    public MenuBarController() {
    }

    @FXML
    private void initialize() {
       
        settingFile = new SimpleStringProperty("");
        csvFileString = new SimpleStringProperty("");
        algorithmFile = new SimpleStringProperty("");

    }

    @FXML
    void xmlFileChooser(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new ExtensionFilter("json files", "*.json"));
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        currentPath = currentPath + "/src/files";
        fc.setInitialDirectory(new File(currentPath));
        File f = fc.showOpenDialog(null);
        if (f != null) {
            settingFile.setValue(f.getPath());
        }
    }

    @FXML
    void csvFileChooser(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new ExtensionFilter(" csv files", "*.csv"));
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        currentPath = currentPath + "/src/files";
        fc.setInitialDirectory(new File(currentPath));
        File f = fc.showOpenDialog(null);
        if (f != null) {
            csvFileString.setValue(f.getPath());
        }
    }

    @FXML
    void algoFileChooser(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new ExtensionFilter("Anomaly detector files", "*.class"));
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        currentPath= currentPath+"/out/production/patam2/app/model/algorithms";
        fc.setInitialDirectory(new File(currentPath));
        File f = fc.showOpenDialog(null);
        if (f != null) {
            algorithmFile.setValue(f.getPath());
        }
    }

    public MenuItem getJsonSettings() {
        return jsonSettings;
    }

    public void setJsonSettings(MenuItem jsonSettings) {
        this.jsonSettings = jsonSettings;
    }

    public MenuItem getCsvFile() {
        return csvFile;
    }

    public void setCsvFile(MenuItem csvFile) {
        this.csvFile = csvFile;
    }

    public MenuItem getAlgoChoose() {
        return algoChoose;
    }

    public void setAlgoChoose(MenuItem algoChoose) {
        this.algoChoose = algoChoose;
    }

    public StringProperty getSettingFile() {
        return settingFile;
    }

    public void setSettingFile(StringProperty settingFile) {
        this.settingFile = settingFile;
    }

    public StringProperty getCsvFileString() {
        return csvFileString;
    }

    public void setCsvFile(StringProperty csvFileString) {
        this.csvFileString = csvFileString;
    }

    public StringProperty getAlgorithmFile() {
        return algorithmFile;
    }

    public void setAlgorithmFile(StringProperty algorithmFile) {
        this.algorithmFile = algorithmFile;
    }


}
