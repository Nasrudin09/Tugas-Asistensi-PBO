package chapter4;

public class Node
{
    int x;
    int y;
    String name;

    public Node(int x,int y, String nama)
    {
        this.x = x;
        this.y = y;
        this.name = nama;
    }

    public void cetak()
    {
        System.out.println("name : "+this.name);
        System.out.println("x : "+this.x);
        System.out.println("y : "+this.y);
    }
}