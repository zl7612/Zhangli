package codeblock;

public class CodeBlock_01 {
    public static void main(String[] args) {
        Movie nn = new Movie("nn");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;

    //构造器 3个 构成重载

    {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
    }

    //不管调用哪个构造器，都会先调用代码块内容

    public Movie(String name) {
        System.out.println("public Movie(String name)被调用");
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}