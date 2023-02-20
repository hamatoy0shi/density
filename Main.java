public class Main {

    public static void main(String[] args) {
        Cube cube = new Cube(3, 4);
        Sphere sphere = new Sphere(5, 10);
        System.out.println("Плотность куба:" + cube.getDensity());
        System.out.println("Плотность шара:" + sphere.getDensity());
    }

}
