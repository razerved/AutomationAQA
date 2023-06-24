public class Calculator {
    private String level;
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }


    public int sum(int a, int b){
        return a + b;
    }

    public int homeMines(int a, int b){
        return  a - b;
    }

    public double homeDoubleDivisionByZero(double a, double b){
        return  a / b;
    }

    public int homeIntDivisionByZero(int a, int b){
        return  a / b;
    }

}
