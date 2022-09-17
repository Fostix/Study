package Lessons.LessonExceptions.Lesson3;

public class ForBlur {
    private CvImage cvImage;
    private int kernelSuze;
    public ForBlur() {
    }
    public void blur(CvImage cvImage, int kernelSuze) {
        this.cvImage = cvImage;
        this.kernelSuze = kernelSuze;
        try {

        } catch (Exception e) {
            throw new JavaCVException.IllegalFilterParametersException();
        }
    }
}
