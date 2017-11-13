import java.util.Scanner;
import edu.bsu.cs120.geometry.*;
import bsu.edu.bsu.math116.geometry.*;
public class GeometryTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		 System.out.println("Please enter the radius for a sphere/cylinder/cone: ");
		double r = in.nextDouble();
		System.out.println("Please enter the height for a cylinder/cone: ");
		double h = in.nextDouble();
		System.out.println("Please enter the base edge for a square pyramid: ");
		double	b=in.nextDouble();
		System.out.println("The volume of the sphere is: "+ Sphere.findVolume(r)  );
		System.out.println("The surface area of a sphere is: "+ Sphere.findSurfaceArea(r)  );
		System.out.println("The volume of the cone is: "+ Cone.findConeVolume(r,h)  );
		System.out.println("The surface area of a cone is: "+ Cone.findConeSurfaceArea(r,h)  );
		System.out.println("The volume of the cylinder is: "+ Cylinder.findCylinderVolume(r,h)  );
		System.out.println("The surface area of a cylinder is: "+ Cylinder.findCylinderSurfaceArea(r,h)  );
		System.out.println("The volume of the sphere pyramid is: "+ SquarePyramid.SquarePyramidVolume(b,h)  );
		System.out.println("The surface area of the sphere pyramid is: "+ SquarePyramid.squarePyramidSurface(b,h)  );
		in.close();
		}//close main method

}//close class
