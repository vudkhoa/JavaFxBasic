package processbar_processIndicator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;

public class SampleController implements Initializable {
    
    @FXML
    private ProgressBar progressBar;
    
    @FXML
    private ProgressIndicator progressIndicator;
    
    @FXML
    private Label label;
    
    private DoWork task;
    
    @FXML
    public void start(ActionEvent event) { 
        task = new DoWork();
        progressBar.progressProperty().bind(task.progressProperty());
        progressIndicator.progressProperty().bind(task.progressProperty());
        label.textProperty().bind(task.messageProperty());
        
        // Run the task in a new thread
        new Thread(task).start();
    }
    
    @FXML
    public void cancel(ActionEvent event) { 
        if (task != null) {
            task.cancel();
            progressBar.progressProperty().unbind();
            progressBar.setProgress(0);
            progressIndicator.progressProperty().unbind();
            progressIndicator.setProgress(0);
            label.textProperty().unbind();
            label.setText("Ready");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Initialization logic if necessary
    }        
}

class DoWork extends Task<Void> { // Renamed to DoWork
    @Override
    protected Void call() throws Exception {
        for (int i = 0; i < 10; i++) {
            if (isCancelled()) {
                updateMessage("Cancelled");
                break;
            }
            updateProgress(i + 1, 10);
            updateMessage("Loading " + (i + 1) + "/10");
            Thread.sleep(500); // Simulate work
        }
        if (!isCancelled()) {
            updateMessage("Finished");
        }
        return null;
    }
}
