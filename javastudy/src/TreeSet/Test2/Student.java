package TreeSet.Test2;


public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double englishScore;
    private double mathScore;
    private double chineseScore;

    public Student(String name, int age, double englishScore, double mathScore, double chineseScore) {
        this.name = name;
        this.age = age;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        this.chineseScore = chineseScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", englishScore=" + englishScore +
                ", mathScore=" + mathScore +
                ", chineseScore=" + chineseScore +
                '}' + "总分=" + (englishScore + mathScore + chineseScore);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        this.englishScore = englishScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(double chineseScore) {
        this.chineseScore = chineseScore;
    }


    @Override
    public int compareTo(Student o) {
        //从高到低排序o-this,this表示要添加的，o表示已经存在红黑树的元素
        double i = (o.chineseScore + o.mathScore + o.englishScore) - (this.englishScore + this.mathScore + this.chineseScore);
        //如果总分一样,按照语文成绩排序
        i = i == 0 ? o.getChineseScore() - this.getChineseScore() : i;
        //如果语文成绩一样,按照数学成绩排序
        i = i == 0 ? o.getMathScore() - this.getMathScore() : i;
        //如果数学成绩一样,按照英语成绩排序
        i = i == 0 ? o.getEnglishScore() - this.getEnglishScore() : i;
        //如果英语成绩一样,按照年龄排序
        i = i == 0 ? o.getAge() - this.getAge() : i;
        //如果年龄一样,按照名字字幕顺序排序
        i = i == 0 ? o.getName().compareTo(this.getName()) : i;

        return (int) i;

    }
}
