package Lessons.Exceptions.Lesson3;

public class ArrayTransformationException extends RuntimeException{
    private int illegalElementIndex;
    private String illegalElementValue;

    public int getIllegalElementIndex() {
        return illegalElementIndex;
    }

    public String getIllegalElementValue() {
        return illegalElementValue;
    }

    public ArrayTransformationException(int illegalElementIndex, String illegalElementValue) {
        super(String.format("in input array position: %d have incorrect element: %s", illegalElementIndex, illegalElementValue));
        this.illegalElementIndex = illegalElementIndex;
        this.illegalElementValue = illegalElementValue;
    }
}
