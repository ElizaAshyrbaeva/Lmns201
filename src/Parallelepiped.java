public class Parallelepiped {
    private int length ,width ,height;

    public Parallelepiped() {
    }

    public Parallelepiped(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
        public void getArea(){
            System.out.println(  2*((height * length) + (length * width) + (height * width)));
        }
        public  void  getVolume(){
            System.out.println(length*width*height);
        }

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
