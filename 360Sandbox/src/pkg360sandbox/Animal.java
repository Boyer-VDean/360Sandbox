package pkg360sandbox;
/**
 * @author reyob
 */
public class Animal {
    private String species;
    private String name;
    private long age;
    
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getAge() {
        return age;
    }
    public void setAge(long newAge){
        this.age = newAge;
    }
    void makingNoise(){
    }
    void hungry(){
    }
    void sleeping(){
    }
    
}
