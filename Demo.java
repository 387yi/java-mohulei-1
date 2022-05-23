package maohegou;

public class Demo {
    public static void main(String[] args) {
        mao m=new mao();
        m.setName("加菲猫");
        m.setAge(6);
        System.out.println(m.getName()+","+m.getAge());
        m.maoMoor();

        mao m2=new mao("加菲小猫",5);
        System.out.println(m2.getName()+','+m2.getAge());
        m2.maoMoor();
    }
}
