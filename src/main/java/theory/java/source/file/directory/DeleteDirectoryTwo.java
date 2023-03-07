package theory.java.source.file.directory;

import java.io.File;

/**
 * packageName    : theory.java.source.file
 * fileName       : DeleteDirectory
 * author         : caprocoo
 * date           : 2023-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-03-07        caprocoo       최초 생성
 */
public class DeleteDirectoryTwo {
    public static void main(String[] args) {
        String path = "D:\\Eclipse\\Java\\새 폴더";
        deleteFolder(path);
    }

    public static void deleteFolder(String path) {

        File folder = new File(path);
        try {
            if(folder.exists()){
                File[] folder_list = folder.listFiles(); //파일리스트 얻어오기

                for (int i = 0; i < folder_list.length; i++) {
                    if(folder_list[i].isFile()) {
                        folder_list[i].delete();
                        System.out.println("파일이 삭제되었습니다.");
                    }else {
                        deleteFolder(folder_list[i].getPath()); //재귀함수호출
                        System.out.println("폴더가 삭제되었습니다.");
                    }
                    folder_list[i].delete();
                }
                folder.delete(); //폴더 삭제
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
