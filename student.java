package hallowapp;
//for abstract
public class student extends creditcard implements info{
    String firstname;
    String lastname;

    @Override
    public String getname() {
        return (firstname+" "+ lastname);
    }
}

/* for interface
public class student implements info {
    String firstname;
    String lastname;


    @Override
    public String getname() {
        return (firstname+" "+ lastname);
    }
}*/
   /* String firstname;
    String lastname;
    gender type;
    student(String firstname,String lastname,gender type){
        this.firstname=firstname;
        this.lastname=lastname;
        this.type=type;
    }
    void display(){
        System.out.println(firstname+ " "+ lastname+" "+type);
    }

}*/
  /*  String firstname;
    String lastname;
     static String gender;


    /*String getname() {
        return (firstname + lastname);//override
    }*/

    //constructor
   /* student(){}  //ميثود موجوده تلقائيا بينشأها الجافا وتكون بنفس اسم الكلاس
    student(String firstname,String lastname) {
        this.firstname = firstname;//لمن نكتب قبلها this يعني نقصد بيها الي معرفه فوق خارج الميثود
        this.lastname = lastname;
        }
        String getstudentInfo(){
        return (firstname+" "+ lastname +" "+ Uname);
        }*/




