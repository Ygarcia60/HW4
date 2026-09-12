package Composition;
import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        files = new ArrayList<>();
        subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void addFile(String fileName) {
        File newFile = new File(fileName);
        files.add(newFile);
    }

    public Folder addSubFolder(String folderName) {
        Folder newFolder = new Folder(folderName);
        subFolders.add(newFolder);

        return newFolder;
    }

    public boolean deleteSubFolder(String folderName) {
        for (int i = 0; i < subFolders.size(); i++) {
            Folder folder = subFolders.get(i);

            if (folder.getName().equals(folderName)) {
                subFolders.remove(i);
                return true;
            }
        }

        return false;
    }

    public void print() {
        print("");
    }

    private void print(String indentation) {
        System.out.println(indentation + name + "/");

        for (Folder folder : subFolders) {
            folder.print(indentation + "    ");
        }

        for (File file : files) {
            file.print(indentation + "    ");
        }
    }
}