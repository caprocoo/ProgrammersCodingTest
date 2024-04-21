import theory.java.source.Ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * packageName    : PACKAGE_NAME
 * fileName       : APICallLogic
 * author         : caprocoo
 * date           : 2023-09-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-12        caprocoo       최초 생성
 */
public class APICallLogic {

    public static void main(String[] args) {


        String[] dataTypeArray = {"arti", "thes", "book", "pate", "repo", "mult"};
        for (int i = 0; i < dataTypeArray.length; i++) {
            System.out.println(dataTypeArray[i]);
//            callAction(onSignalResult, jmsTemplate, "pres");
        }
//                changeDateFormat();
//
        threeDays2();
    }

    private static void changeDateFormat() {
        String prevDate = "09/07/2001 15:00:00";
        // 입력 날짜 형식 지정
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        // 출력 날짜 형식 지정
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("yyyyMMdd");

        try {
            // 입력 문자열을 Date 객체로 파싱
            Date inputDate = inputDateFormat.parse(prevDate);

            // Date 객체를 원하는 형식의 문자열로 포맷
            String outputDateStr = outputDateFormat.format(inputDate);

            System.out.println("변환된 날짜: " + outputDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void threeDays() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();

        // 시작 날짜를 '19500101'로 초기화
//        String startDate = "19500101";
        String startDate = "19960101";
        int cnt = 0;

        while (true) {
            try {
                // 시작 날짜를 Date 객체로 파싱
                Date start = sdf.parse(startDate);


                // 종료 날짜를 시작 날짜 + 3일로 설정
                calendar.setTime(start);
                calendar.add(Calendar.DAY_OF_MONTH, 2);

                // 현재 날짜를 endDate로 설정
                Date currentDate = calendar.getTime();
                String endDate = sdf.format(currentDate);

//                // 시작 날짜와 종료 날짜 출력
//                System.out.println("startDate: " + startDate);
//                System.out.println("endDate: " + endDate);

                // cnt가 600일 때의 startDate와 endDate를 저장
                if (startDate.equals("20050907")) {
                    System.out.println("startDate: " + startDate);
                    System.out.println("endDate: " + endDate);
                    System.out.println("cnt = " + cnt);
                }


//                if (startDate.equals("19960804")) {
//                    System.out.println("cnt = " + cnt);
//                }

                // 종료 날짜가 오늘 날짜와 같거나 더 나중이면 반복 종료
                if (currentDate.compareTo(new Date()) >= 0) {
                    break;
                }

                cnt++;
                // startDate를 endDate 다음 날짜로 설정
                calendar.add(Calendar.DAY_OF_MONTH, 1); // startDate를 1일 뒤로 이동
                startDate = sdf.format(calendar.getTime()); // startDate 갱신


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void threeDays2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();

        // 시작 날짜를 '19500101'로 초기화
        String startDate = "19960101";
        int cnt = 0;

        while (true) {
            try {
                // 시작 날짜를 Date 객체로 파싱
                Date start = sdf.parse(startDate);

                // 종료 날짜를 시작 날짜 + 3일로 설정
                calendar.setTime(start);
                calendar.add(Calendar.DAY_OF_MONTH, 2);

                // 현재 날짜를 endDate로 설정
                Date currentDate = calendar.getTime();
                String endDate = sdf.format(currentDate);

                // cnt가 480일 때의 startDate와 endDate를 출력
                if (cnt == 498) {
                    System.out.println("startDate: " + startDate);
                    System.out.println("endDate: " + endDate);
                }

                // 종료 날짜가 오늘 날짜와 같거나 더 나중이면 반복 종료
                if (currentDate.compareTo(new Date()) >= 0) {
                    break;
                }

                cnt++;
                // startDate를 endDate 다음 날짜로 설정
                calendar.add(Calendar.DAY_OF_MONTH, 1); // startDate를 1일 뒤로 이동
                startDate = sdf.format(calendar.getTime()); // startDate 갱신

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
