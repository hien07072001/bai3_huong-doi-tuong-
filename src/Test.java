public class Test {
    public static void main(String[] args) {
        FAN fan1=new FAN();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);


        FAN fan2 = new FAN();
        fan2.setSpeed(fan2.MEDIUM);

        System.out.println("fan2. = " + fan2);
        System.out.println("fan1 = " + fan1);
    }
}
