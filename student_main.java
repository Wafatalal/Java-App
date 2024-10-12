package hallowapp;

import java.util.ArrayList;

//nested class
public class student_main {
    static class car{
        int speed;
        String model;
    }
    public static void main(String[] args) {
        SEbook mybook=new SEbook();
        mybook.Section=("12d");
        mybook.SN =123;
        Library mylib =(Library)mybook;//casting
        System.out.println(mylib.Section);
        System.out.println(mybook.Section+" "+mybook.SN);


        double n1 = 5.5;
        int n1cast =(int)n1;//casting
        System.out.println(n1);

        student mys =new student();
        mys.firstname="wafa";
        mys.lastname="Bahha";
        mys.cardID="123039";
        mys.DataExp="1/11";
        mys.code="12113";
        car mycar =new car();
        mycar.speed=140;
        mycar.model="tyota";
        System.out.println(mys.getname());//to print the name
        System.out.println(mys.printing());//to print card info
        System.out.println(mycar.model+" "+mycar.speed);//to ptint car info



        //for enum
        //student mystudent3 = new student("wafa","Bahha",gender.female);
       // mystudent3.display();



        /*department mydepartment =new department();
        mydepartment.namede="SE";
        String name = mydepartment.mystudent.firstname ="wafa";//aggregation
        System.out.println(name+" "+ mydepartment.namede);

        student mystudent = new student();
         mystudent.firstname="Wafa";
         mystudent.lastname="Bahha";
        mystudent.Uname="umm algura";

        student.gender="Male";
        student mystudent1 = new student();
        mystudent1.firstname="samer";

        student mystudent2 = new student();
        mystudent2.firstname="Ahmed";

        //student mystudent = new student("Wafa","Bahha");
        //student mystudent = new student();// ممكن نسوي كونستر اكتر واحد من غير باراميتر وداه بينشأو الجافا تلقائيا


       // System.out.println(mystudent.getstudentInfo());
         System.out.println(mystudent.getname());
        System.out.println(mystudent1.firstname + mystudent1.gender);
        System.out.println(mystudent2.firstname + mystudent2.gender);



        /*using array list with constructor
        ArrayList<student> myarray =new ArrayList<student>();
        myarray.add(new student("wafa","bahha"));
        myarray.add(new student("Toleen","Nouh"));
        myarray.add(new student("Lareen","Nouh"));
        //for print the list
        for(int i=0; i<myarray.size();i++)
            System.out.println(myarray.get(i).getstudentInfo());*/
    }
    }
