class Teacher
{
    private String name;
    public Teacher(String name)
    {
        this.name = name;
    }
    public void displayTeacher(){
        {
        System.out.println("Data of the Teacher class:");
        System.out.println("Name: "+this.name);
        }
    }
    class Student extends Teacher{
        public Student(String name) {
            super(name);
        }
        public void displayStudent() {
            System.out.println("Data of Student Class: ");
            System.out.println("Name: "+super.name);
        }
        public static void main(String[] args) {
                    Student std = new Student("Ram");
        }

}