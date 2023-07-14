// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }

    public void setDimensions(int width,int height){
        this.width=width;
        this.height=height;
    }

    public int calculateArea(){
        return this.width*this.height;
    }


    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(10,5);
        System.out.println("Initial Area=" +rectangle.calculateArea());

        rectangle.setDimensions(15,20);
        System.out.println("Initial Area=" +rectangle.calculateArea());

        }
    }
