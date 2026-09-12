package Composition;

public class FileSystemDriver {
    public static void main(String[] args) {

        // Create the main folder.
        Folder phpDemo = new Folder("php_demo1");

        // Create its three subfolders.
        Folder sourceFiles =
                phpDemo.addSubFolder("Source Files");

        phpDemo.addSubFolder("Include Path");
        phpDemo.addSubFolder("Remote Files");

        // Create the folders inside Source Files.
        sourceFiles.addSubFolder("app");

        Folder publicFolder =
                sourceFiles.addSubFolder("public");

        // Create the files inside public.
        publicFolder.addFile(".htaccess");
        publicFolder.addFile(".htrouter.php");
        publicFolder.addFile("index.html");

        // Print the original structure.
        System.out.println("ORIGINAL FILE STRUCTURE");
        phpDemo.print();

        // Delete app and print again.
        sourceFiles.deleteSubFolder("app");

        System.out.println("\nAFTER DELETING APP");
        phpDemo.print();

        // Delete public and print again.
        sourceFiles.deleteSubFolder("public");

        System.out.println("\nAFTER DELETING PUBLIC");
        phpDemo.print();
    }
}
