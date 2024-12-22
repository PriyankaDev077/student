class parent{
    int age,id;
    String name;
    void naming(String name){
        System.out.println("name-"+name);
    }
}
class child extends parent{
    void agein(int age){
        System.out.println("age of the student is-"+age);
    }
}
class main{
    public static void main(String[] args) {
        child x=new child();
        x.naming("priyanka");
        x.agein(16);
    }
}