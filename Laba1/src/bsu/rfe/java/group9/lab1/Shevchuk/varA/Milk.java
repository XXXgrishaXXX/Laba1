package bsu.rfe.java.group9.lab1.Shevchuk.varA;

public class Milk extends Food {

    private String fat;
    public Milk (String fat)
    {
        super("Milk");
        this.fat = fat ;
    }

    public void consume() {
        System.out.println(this + " was eaten");
    }
    public String getFat() {
        return fat;
    }
    public void setFat(String fat) {
        this.fat = fat;
    }

    public String toString() {
        return super.toString() + " vcusnoe" + " fat '" + fat.toUpperCase() + "'";
    }

}
