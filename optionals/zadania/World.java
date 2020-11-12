public class World {
    public static void main(String[] args) {
        Student kamil = new Student((long) 1, "kamilo");
        Student ryt = new Student((long) 2, "rytu");
        System.out.println(kamil.getAddress());
        kamil.setAddress(new Address("Polska"));
        System.out.println(kamil.getAddress());
        System.out.println(kamil.getAddress());
//        System.out.println(ryt.address.street);
        System.out.println(ryt.getAddress().street);
    }
}
