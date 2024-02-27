/*
Aim: Practical No.3   Author: Ishant Morghade
Version: 3.6          Date: 13 Feb,2024
*/
import java.util.Scanner;
public class VolumeCalculator 
{
    // For cube
    public Double calculateVolume(Double sideLength) 
    {
        if (sideLength == null || sideLength <= 0) 
        {
            System.out.println("Error: Side length must be a positive number");
            return null;
        }
        return Math.pow(sideLength, 3);
    }

    // For cylinder
    public Double calculateVolume(Double radius, Double height) 
    {
        if (radius == null || radius <= 0 || height == null || height <= 0) 
        {
            System.out.println("Error: Radius and height must be positive numbers");
            return null;
        }
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // For volume of a box
    public Double calculateVolume(Double length, Double width, Double height) 
    {
        if (length == null || length <= 0 || width == null || width <= 0 || height == null || height <= 0) 
        {
            System.out.println("Error: Dimensions must be positive numbers");
            return null;
        }
        return length * width * height;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator calculator = new VolumeCalculator();

        //Input for cube side length
        System.out.print("Enter side length of the cube: ");
        Double cubeSideLength = scanner.nextDouble();
        System.out.println("");

        //Input for cylinder radius and height
        System.out.print("Enter radius of the cylinder: ");
        Double cylinderRadius = scanner.nextDouble();
        System.out.print("Enter height of the cylinder: ");
        Double cylinderHeight = scanner.nextDouble();
        System.out.println("");

        //Input for box dimensions
        System.out.print("Enter length of the box: ");
        Double boxLength = scanner.nextDouble();
        System.out.print("Enter width of the box: ");
        Double boxWidth = scanner.nextDouble();
        System.out.print("Enter height of the box: ");
        Double boxHeight = scanner.nextDouble();
        System.out.println("");

        // Calculating volumes using the input dimensions
        Double cubeVolume = calculator.calculateVolume(cubeSideLength);
        Double cylinderVolume = calculator.calculateVolume(cylinderRadius, cylinderHeight);
        Double boxVolume = calculator.calculateVolume(boxLength, boxWidth, boxHeight);

        // Printing the calculated volumes
        System.out.println("Volume of cube: " + (cubeVolume != null ? cubeVolume : "Invalid input"));
        System.out.println("Volume of cylinder: " + (cylinderVolume != null ? cylinderVolume : "Invalid input"));
        System.out.println("Volume of box: " + (boxVolume != null ? boxVolume : "Invalid input"));

        // Closing the scanner
        scanner.close();
    }
}
