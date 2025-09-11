class stu{
    int number;
    String name;
    int marks;
}


public class arrayobj {
    public static void main(String[] args) {
        stu s1 = new stu();
        s1.number=90;
        s1.name = "Adhi";
        s1.marks = 30;

        stu s2 = new stu();
        s2.number=60;
        s2.name = "jeevi";
        s2.marks = 50;

        stu s3 = new stu();
        s3.number=98;
        s3.name = "siva";
        s3.marks = 37;

        stu s4 = new stu();
        s4.number=99;
        s4.name = "kalai";
        s4.marks = 88;

        stu students[] = new stu[4];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        for(int i=0; i< students.length ; i++){
            System.out.println("Name = "+students[i].name);
            System.out.println("Number = "+students[i].number);
            System.out.println("Marks = "+students[i].marks);
            System.out.println(" ");
        }

        
    }
    
}
