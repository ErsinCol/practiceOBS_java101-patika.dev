public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int tchrNote;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(prefix)){
            this.teacher=teacher;
        }else{
            System.out.println(teacher+ " öğretmeni bu dersi veremez...");
        }
    }

    void printTeacher(){
        if(this.teacher!=null){
            System.out.println(this.name+ " dersinin öğretmeni: "+this.teacher.name);
        }else{
            System.out.println(this.name+" dersine öğretmen atanmamıştır...");
        }
    }

}
