class Box
{
    private int length,breadth,height;
    public void SetDimension(int l, int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    public void ShowDimension()
    {
        System.out.println("L="+length);
        System.out.println("B="+breadth);
        System.out.println("H="+height);
    }
}

public class ClassObject
{
    public static void main(String[] args)
    {
        Box smallBox = new Box();
        smallBox.SetDimension(12,13,14);
        smallBox.ShowDimension();
        smallBox = new Box();
        smallBox.ShowDimension();
        //after this last statement above object get destroyed by JVM as now its garbage evemn having values assigned in it. Its of no use
    }
}
