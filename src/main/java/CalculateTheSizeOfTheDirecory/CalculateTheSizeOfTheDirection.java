package CalculateTheSizeOfTheDirecory;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CalculateTheSizeOfTheDirection {
    public static void main(String[] args) throws IOException {
        System.out.println("The program calculate the size of the Direction");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory: ");
        String path = scanner.nextLine();
        System.out.println(calculateTheSize(path));

    }

    public static long calculateTheSize(String path) throws IOException {
        File directory = new File(path);
        long size = 0;
        if (!directory.exists()) {
            System.out.println("Folder " + path + " does not exist");
        }

        if (directory.isDirectory()) {
            File[] list = directory.listFiles();
            if (list != null) {
                for (File f : list) {
                    if (f.isFile())
                        size += getSize(f);
                    else if (f.isDirectory()) {
                        size += calculateTheSize(f.getCanonicalPath());
                    }
                }
            }
        }
        return size;
    }

    public static long getSize(File file) {
        return file.length();
    }
}
