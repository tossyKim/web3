package cat;

public class Cat {
    private String name;
    private String breed;
    private double weight;

    void claw(){
        System.out.println("할퀴기!");
    }

    void meow(){
        System.out.println("야옹");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
}
