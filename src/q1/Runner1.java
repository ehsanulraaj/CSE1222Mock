package q1;

public class Runner1 {
    public static void main(String[] args) {
        Worker w=new Worker("Ehsanul", 30000);
        System.out.println(w);

        Supervisor s= new Supervisor("Haque",20000, "Service");
        System.out.println(s);

        Director d= new Director("Raaj",15000,"CEO");
        System.out.println(d);
    }
}
