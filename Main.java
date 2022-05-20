public class Main {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher("Sevgi Şen","msc",3003);
        Teacher teacher2=new Teacher("Ersin Çöl","mat",111);
        Teacher teacher3=new Teacher("Hızır Ali","ing",333);

        Course music=new Course("Müzik","msc101","msc");
        Course mathematics=new Course("Matematik","mat101","mat");
        Course english=new Course("İngilizce","ingA1","ing");

        music.addTeacher(teacher1);
        mathematics.addTeacher(teacher2);
        english.addTeacher(teacher3);

        Student student1=new Student("ılgaz",123,1,music,mathematics,english);
        student1.addBulkExamNote(50,70,45,70,80,60);
        student1.isPass();

    }
}
