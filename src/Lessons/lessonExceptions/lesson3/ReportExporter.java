package Lessons.lessonExceptions.lesson3;

import java.io.IOException;
import java.io.PrintWriter;

public class ReportExporter {
    public void saveReportToFile(String path, String data) throws IOException {
        String modifiedOutputData = data;
        try (PrintWriter writer = new PrintWriter(path)){
            writer.println(modifiedOutputData);
        } catch (IOException e) {
            //. Do something...
            throw e;
        }
    }
}
