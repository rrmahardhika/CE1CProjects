public class Human {
    public String name;
    public int age;
    public char gender;
    public Human(String name, int age, char gender){ //constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Hello, i am human");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void introduceYourself(){
        System.out.println("Hello, my name is "+ name);
    }

    public int getAge(){
        return age;
    }
}