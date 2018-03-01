public class Demo {
    public static void main(String[] args){
        Image image = new ProxyImage("美女");
        //图像将从磁盘加载
        image.display();
        System.out.println("");
        //图像将无法从磁盘加载
        image.display();
    }
}
