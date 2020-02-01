package day51;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";

    public Question(String questionType, String operator) {
        this.questionType = questionType;
        this.operator = operator;
    }

    public abstract void calculate();

    @Override
    public String toString() {
        return "The Question type is " + questionType + " : ";
    }
}
