

import java.util.ArrayList;

public class Subject  {
    private final String SubName;
    private final Evaluation<String,Integer> eval = new Evaluation<>();
    private final ArrayList<Assignment> Assignment = new ArrayList<>();

    public Subject(String subName) {
        SubName = subName;
    }

    public String getSubName() {
        return SubName;
    }

    public Evaluation<String, Integer> getEval() {
        return eval;
    }

    public ArrayList<Assignment> getAssignment() {
        return Assignment;
    }
}

class Evaluation<K,V>{
    ArrayList<K> Type = new ArrayList<>();
    ArrayList<V> Grade = new ArrayList<>();
    void add(K name, V grade){
        Type.add(name);
        Grade.add(grade);
    }

    public ArrayList<K> getType() {
        return Type;
    }

    public ArrayList<V> getGrade() {
        return Grade;
    }
}
