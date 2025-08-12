package com.ankit.java.oops_concept.class_relation_in_java.is_a_relation_inheritance.single_level_inheritance;

class Super{
    private int id;
    private String name;
    private int epin;
    public void setData(int id,String name,int epin){
        this.id=id;
        this.name=name;
        this.epin=epin;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEpin() {
        return epin;
    }
}
class Sub extends Super{
    public void showData(){
        System.out.println("id value is : "+this.getId());
        System.out.println("name is : "+this.getName());
        System.out.println("Epin valus is : "+this.getEpin());
    }
}
public class SingleLevelDemo2 {
    public static void main(String[] args) {
        Sub s1 = new Sub();
        s1.setData(101,"Ankit",7682);
        s1.showData();

    }
}
