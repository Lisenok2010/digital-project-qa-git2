public class Cat {
    String name;
    private int age;

    public void meow(){
        System.out.print("Meow!");
    }
    public int getAge(){
        return age + 1;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
