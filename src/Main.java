public class Main {
    public static void main(String[] args) {

        Basket cupVolod = new Basket();
        cupVolod.appProduct("bread",1,1);
        System.out.println(cupVolod.getProd() + cupVolod.countPr() + cupVolod.weithPr());
    }
}

