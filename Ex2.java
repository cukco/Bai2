import java.util.Scanner;
public class Ex32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int count=0;
        double sum=0;
        double max=-1;
        double min=100;
        while(true){
            System.out.print("====== MENU ======\n" + "1. Nhập điểm học viên\n" + "2. Hiển thị thống kê\n" + "3. Thoát\n" + "Lựa chọn của bạn: ");
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("--- Nhập điểm học viên (nhập -1 để dừng) ---\n");
                double mark;
                do {
                    System.out.print("Nhập điểm: ");
                    mark = sc.nextDouble();
                    if(mark==-1){
                        continue;
                    }else if(mark <0 || mark > 10){
                        System.out.print("Điểm không hợp lệ. Nhập lại.");
                        continue;
                    }
                    String hocLuc = "";
                    if (mark >= 8.0) hocLuc = "Giỏi";
                    else if (mark >= 6.5) hocLuc = "Khá";
                    else if (mark >= 5.0) hocLuc = "Trung bình";
                    else hocLuc = "Yếu";
                    System.out.println("Học lực: " + hocLuc);
                    if(mark > max) max=mark;
                    if(mark < min) min=mark;
                    count++;
                    sum+=mark;
                }while(mark != -1);
            }else if(n == 2){
                if(count==0){System.out.print("Chưa có dữ liệu");continue;}
                System.out.println("======Kết quả======");
                System.out.printf("Số học viên đã nhập: %d\n",count);
                System.out.printf("Điểm trung bình: %.2f\n",sum/count);
                System.out.printf("Điểm cao nhất: %.2f\nĐiểm thấp nhất: %.2f\n",max,min);
            }else if(n == 3){System.exit(0);}
        }

    }
}
