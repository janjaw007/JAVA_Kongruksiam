 import java.util.Scanner; 

 class InputTutorial {
  public static void main(String[] args) {
    // รับค่าจากคีย์บอร์ด
    // ข้อมูลชนิดไหน ? ตัวเลข int,float,long,double,ข้อความstring
    // ข้อความทำอะไร
    // ข้อความแบบตัวเลข => คำนวณได้ | คำนวณไม่ได้

    //ประกาใช้งาน Class | keyword = new
    //รับค่าจากคีย์บอร์ด
    Scanner sc = new Scanner(System.in);

    //ป้อนชื่อ
    System.out.print("ป้อนชื่อของคุณ =");
    
    // รับแล้วเก็บในตัวแปร
    String name = sc.nextLine(); //รับค่าStringจากแป้นพิมพ์ เก็บใน name

    System.out.println("ชื่อของคุณคือ ="+name);//แสดงข้อความที่พิมพ์

    //รับค่าเป็นตัวเลข
    System.out.print("ป้อน ค.ศ.เกิด =");
    int year=sc.nextInt(); //รับค่า int จากแป้นพิมเก็บใน year

    //คำนวณอายุ
    int age=2021 -year ;

    System.out.println("คุณเกิดปีที่ ="+year);//แสดงข้อความปีเกิด่

    //แสดงอายุ
    System.out.println("อายุของคุณ ="+age);//แสดงข้อความอายุ


  }
}
