// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.util.stream.Collectors;

class Model{
    public String modelName;
    public int carSpeed;

    Model(String modelName, int carSpeed){
        this.modelName=modelName;
        this.carSpeed=carSpeed;
    }

    public String getModelName(){
        return modelName;
    }

    public int getCarSpeed(){
        return carSpeed;
    }

    public String toString(){
        return modelName + " " + carSpeed;
    }
}

class ModelImplementation{

    public List<String> getModelName(List<Model> list){
        return list.stream()
                   .map(Model::getModelName)
                   .collect(Collectors.toList());
    }

    public Model getModelInfo(List<Model> list, String model){
        return list.stream()
                   .filter(e -> e.getModelName().equalsIgnoreCase(model))
                   .findFirst()
                   .orElse(null);
    }
}

public class StreamAPI1{
    public static void main(String[] args) {

          
        List<Model> list = new ArrayList<>();
        list.add(new Model("SUV", 200));
        list.add(new Model("Audi", 220));
        list.add(new Model("Tesla", 250));

        ModelImplementation mi = new ModelImplementation();

        System.out.println(mi.getModelName(list));
        System.out.println(mi.getModelInfo(list, "Audi"));
    }
}
