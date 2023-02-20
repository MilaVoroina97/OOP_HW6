import HW6.Animals.Interfaces.MakeAllNoises;
import HW6.Animals.Interfaces.PrintAllInfo;

public abstract class Animal implements MakeAllNoises,PrintAllInfo{
    protected int height;
    protected int weight;
    protected String eyesColor;

    public Animal(int height,int weight,String eyesColor){

        this.height = height;
        this.weight = weight;
        this.eyesColor = eyesColor;

    }

    // public int getHeight(){
    //     return this.height;
    // }

    // public int getWeight(){
    //     return this.weight;
    // }

    // public String getEyesColor(){
    //     return this.eyesColor;
    // }
    @Override 
    public abstract void makeAllNoises();

    @Override 
    public abstract void printAllAnimalInfo();

    // @Override
    // public String toString(){
    //     return String.format("Height: %.1f, Height: %.1f, Eye color: %s", this.getHeight(), this.getWeight(), this.getEyesColor());
    // }

}
