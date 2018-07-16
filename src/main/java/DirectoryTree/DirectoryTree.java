package DirectoryTree;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryTree {
    public static void main(String[] args) throws IOException {
        System.out.println("The program shows the directory tree");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the directory: ");
        String path = scanner.nextLine();
        directoryTree(path);
    }

    public static void directoryTree(String path) throws IOException {
        File directory = new File(path);
        if (!directory.exists()) {
            System.out.println("Folder " + path + " does not exist");
        }

        if (directory.isDirectory()) {
            File[] list = directory.listFiles();
            if (list != null) {
                for (File f : list) {
                    System.out.println(f.getCanonicalPath());
                    directoryTree(f.getCanonicalPath());
                }
            }
        }
    }
}
