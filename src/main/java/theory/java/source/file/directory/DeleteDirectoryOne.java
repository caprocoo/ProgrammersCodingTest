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
public class DeleteDirectoryOne {
    public static void main(String[] args) {
        String path = "D:\\Eclipse\\Java\\새 폴더";
        File folder = new File(path);
        try {
            while(folder.exists()) {
                File[] folder_list = folder.listFiles(); //파일리스트 얻어오기

                for (int j = 0; j < folder_list.length; j++) {
                    folder_list[j].delete(); //파일 삭제
                    System.out.println("파일이 삭제되었습니다.");

                }

                if(folder_list.length == 0 && folder.isDirectory()){
                    folder.delete(); //대상폴더 삭제
                    System.out.println("폴더가 삭제되었습니다.");
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
