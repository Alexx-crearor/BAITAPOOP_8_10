import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        System.out.print("Nhập số lượng hình cần tạo: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nChọn loại hình #" + (i + 1) + ":");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình vuông");
            System.out.println("3. Hình tròn");
            System.out.print("Lựa chọn: \n");
            int choice = sc.nextInt();

            System.out.print("Nhập tọa độ tâm (x y): \n");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point center = new Point(x, y);

            Shape shape = null;

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập chiều rộng: \n");
                    double width = sc.nextDouble();
                    System.out.print("Nhập chiều cao: \n");
                    double height = sc.nextDouble();
                    shape = new Rectangle(center, width, height);
                }
                case 2 -> {
                    System.out.print("Nhập độ dài cạnh: \n");
                    double side = sc.nextDouble();
                    shape = new Square(center, side);
                }
                case 3 -> {
                    System.out.print("Nhập bán kính: \n");
                    double radius = sc.nextDouble();
                    shape = new Circle(center, radius);
                }
            }

            shapes.add(shape);
        }

        /* Câu a. */
        System.out.println("\nSố lượng hình đã khởi tạo : " + Shape.getCount() );

        /* Câu b. */
        System.out.println("\nDanh sách chi tiết các hình đã khởi tạo:");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        /* Câu c. */
        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println(s.getCenterPoint());
        }

        sc.close();
    }
}
