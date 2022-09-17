package Lessons.Exceptions.Lesson3;

import javax.swing.*;
import java.io.IOException;

public class MainAppWindow extends JFrame {
    private ReportExporter reportExporter = new ReportExporter();

    public void onSaveReportButtonClick() {
        String path = generateOutputReportPath();
        String outputData = "very imported date";
        try {
            reportExporter.saveReportToFile(path, outputData);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error! can't save report", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private String generateOutputReportPath() {
        return "lolik" + (int) (Math.random() * 100000000) + ".txt";
    }
}
