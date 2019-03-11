package patterns.composite;

public class CompositeClient {
    public void run() {
        Entry root = new Directory("root", "Root 폴더");

        Entry file = new File("파일1", "파일1", 1);
        Entry file2 = new File("파일2", "파일2", 2);
        Entry file3 = new File("파일3", "파일3", 3);

        root.add(file);
        root.add(file2);
        root.add(file3);
        
        Entry sub1 = new Directory("서브1", "root의 서브 폴더");

        Entry sub1F1 = new File("서브1의 파일1", "서브1의 파일1", 4);
        Entry sub1F2 = new File("서브1의 파일2", "서브1의 파일2", 5);

        root.add(sub1);

        sub1.add(sub1F1);
        sub1.add(sub1F2);

        Entry sub1_1 = new Directory("서브1_1", "sub1의 서브 폴더");

        sub1.add(sub1_1);

        Entry sub1_1F1 = new File("sub1의 서브 폴더 파일1", "", 10);
        Entry sub1_1F2 = new File("sub1의 서브 폴더 파일2", "", 11);
        Entry sub1_1F3 = new File("sub1의 서브 폴더 파일3", "", 12);
        Entry sub1_1F4 = new File("sub1의 서브 폴더 파일4", "", 13);
        
        sub1_1.add(sub1_1F1);
        sub1_1.add(sub1_1F2);
        sub1_1.add(sub1_1F3);
        sub1_1.add(sub1_1F4);
        
        Entry sub1_1_1 = new Directory("서브1_1_1", "sub1의 서브 폴더1_1");

        sub1_1.add(sub1_1_1);

        root.print();
    }
}