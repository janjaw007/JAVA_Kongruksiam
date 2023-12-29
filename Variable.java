 class Variable {
  public static void main(String[] args) {

    
  }
}

  /* 
  // type check method
    Integer a=10;
    double b;
    String c ="hello";
    boolean d;
    char e;
    float f;

    // เป็น(true) กับ ไม่เป็น(false) ใช้ instanceof
    // instanceof ใช้ร่วมกับ class Integer Double String Boolean Character Float
    boolean result = a instanceof Integer;
    System.out.println(result);
    

  //  string = ชนิดข้อมูลชุดข้อความ ""
    //  char = เก็บตัวอักษร ''
    //  char เรียงต่อกัน => string

    // เก็บได้ตัวเดียว 'ABC' = error
    char a='A';
    System.out.println("char=> "+a);
    
    //  เก็บได้หลายตัว
    String b = "ABC", c = "200",h="400";
    // concat 
    String d = b+c;

    // String => DOubel

    double f = Double.parseDouble(h);
    f=f+50.55;


    // String to Int ใช้ class Integer.parseInt
    int e = Integer.parseInt(c)+50;
  
    // Int to String
    int numAge =100;
    String age = String.valueOf(numAge);
    System.out.println(age);

    System.out.println("string=> "+b);
    System.out.println("string=> "+c);
    System.out.println("string=> "+d);
    System.out.println("int=> "+e);
    System.out.println("int=> "+f);

    // Type Casting
    //1. Widening Casting
    //แปลงข้อมูลขนาดเล็ก => ขนาดใหญ่(auto)
    // byte => short => int => long => float => double
    int numInt = 10;
    double numDouble = numInt;W
    System.out.println("int=> "+numInt);
    System.out.println("Double=> "+numDouble);

    //2. Narrowing Casting
    //แปลงข้อมูลขนาดใหญ่ => ขนาดเล็ก (ทำเอง)
    // double => float => long => int => short => byte
    
    double numDouble2 =10.0;
    // (int)หน้าตัวแปร = วิธีการแปลงค่า
    int numInt2 = (int)numDouble2;
    System.out.println("Double=> "+numDouble2);
    System.out.println("int=> "+numInt2);

    // min max value of type

    //Integer MIN VALUE
    System.out.println("Int min=> "+ Integer.MIN_VALUE);
    //Integer MAX VALUE
    System.out.println("Int max=> "+ Integer.MAX_VALUE);

    // byte MIN VALUE
    System.out.println("Byte min=> "+ Byte.MIN_VALUE);

    // long MIN VALUE
    System.out.println("long min=> "+ Long.MIN_VALUE);
    // long MAX VALUE
    System.out.println("long min=> "+ Long.MAX_VALUE);

    // Float MIN VALUE
    System.out.println("Float min=> "+ Float.MIN_VALUE);
    // Float MAX VALUE
    System.out.println("Float min=> "+ Float.MAX_VALUE);
    
    // Double MAX VALUE
    // Double MIN VALUE

    
    // Global Variable & Local Variable

    // a , b Global Variable
    int a = 100;
    int b = 200;
    System.out.println(a);

    {
      // c Local Variable
      int c = 300;
      System.out.println(c);

      // use global variable inside scope
      System.out.println("A="+ a);
    }

    // System.out.println(c); error

  


    // display variable through print
    int num1 = 10; // ค่าเริมต้น =10
    int num2 = 20; // ค่าเริม่ต้น =20

    // เปลี่ยนค่า num1 => 50
    num1 = 50;
    num2 = 200;

    // ตัวแปรค่าคงที่
    final int NUM3 =30; // ค่าเริมต้น =30 เปลี่ยนแปลงไม่ได้
    
    System.out.println("ค่าตัวเลขที่ 1 = "+num1);
    System.out.println("ค่าตัวเลขที่ 2 = "+num2);
    System.out.println("ค่าตัวเลขที่ 3 = "+NUM3);

    // การนิยามตัวแปร

    // 1st pattern
    // type and name dont delcare value
    int number1 ;
    boolean status;
    char alphabet;
    float number2;
    double number3;

    // 2nd pattern
    // type name and value
    int number =10;
    float count = 20;
    char c = 'A';
    boolean s = true;

    //3rd pattern
    // one line mutiple variable
    int a = 0,b=1,d=2;
    */

