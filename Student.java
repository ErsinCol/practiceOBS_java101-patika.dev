public class Student {
    Course music;
    Course math;
    Course english;
    String name;
    int stdNo;
    int classes;
    double average;
    boolean isPass;

    Student(String name,int stdNo,int classes,Course music,Course math,Course english){
        this.name=name;
        this.stdNo=stdNo;
        this.classes=classes;
        this.music=music;
        this.math=math;
        this.english=english;
        calcAverage();
        this.isPass=false;
    }

    void addBulkExamNote(int musicNote,int mathNote,int engNote,int musicNote2,int mathNote2,int engNote2){
        if(musicNote>=0 && musicNote<=100){
            this.music.note=musicNote;
        }
        if(mathNote>=0 && mathNote<=100){
            this.math.note=mathNote;
        }
        if(engNote>=0 && engNote<=100){
            this.english.note=engNote;
        }
        if(musicNote2>=0 && musicNote2<=100){
            this.music.tchrNote=musicNote2;
        }
        if(mathNote2>=0 && mathNote2<=100){
            this.math.tchrNote=mathNote2;
        }
        if(engNote2>=0 && engNote2<=100){
            this.english.tchrNote=engNote2;
        }

    }

    void isPass(){
        this.isPass=isCheckPass();
        printNote();
        System.out.println("Ortalama: "+this.average);
        if(this.isPass){
            System.out.println("Sınıfı geçti...");
        }else{
            System.out.println("Sınıfta kaldı...");
        }
    }

    void calcAverage(){
        double musicAverage=((this.music.note)*0.8)+((this.music.tchrNote)*0.2);
        double mathAverage=((this.math.note)*0.7)+((this.math.tchrNote)*0.3);
        double engAverage=((this.english.note)*0.6)+((this.english.tchrNote)*0.4);
        this.average=(musicAverage+mathAverage+engAverage)/3;
    }

    boolean isCheckPass(){
        calcAverage();
        return this.average>=55;
    }

    void printNote(){
        System.out.println("=======================");
        System.out.println("Öğrenci: "+this.name);
        System.out.println("Matematik notu: "+this.math.note);
        System.out.println("Müzik notu: "+this.music.note);
        System.out.println("İngilizce notu: "+this.english.note );
    }
}
