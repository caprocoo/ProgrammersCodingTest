package theory.java.source;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * packageName    : theory.java.source
 * fileName       : Ex3
 * author         : caprocoo
 * date           : 2023-04-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-04-06        caprocoo       최초 생성
 */
public class Ex3 {
    public static void main(String[] args) throws IOException, ParseException {
        String a = "{\"response\":{\"result\":[resultCode=1, resultMsg=null, contentId=RES0220210150, policyType=G00302, useYn=Y, brmCode=B01, brmTrans=1, subject=2020년도 정부 과학기술정책 및 연구개발 활동 분석 연구(과학기술연감 발간), publishOrg=한국과학기술기획평가원, contentsKor=ㅇ 올해 과학기술 관련 주요 이슈 중 시의적절하고 국민적 관심과 이해 유도가 필요한 주제를 특집테마로 선정\nㅇ 2020년도 과학기술정책 추진 현황 및 주요 내용 분석\nㅇ 2020년도 국가연구개발 활동 현황 분석 및 관련 통계 제공, contentsPurps=ㅇ 2020년 국내외 주요 과학기술 이슈, 과학기술 정책 추진 현황, 분야별 연구개발 활동 및 동향 등을 종합적으로 분석\nㅇ 과학기술의 사료 가치를 지닌 과학기술 연감 발간 \nㅇ 과학기술정책 활동과 성과에 대한 대국민 홍보 및 이해 제고 , contentsCnclsn= ㅇ 연구자, 산학연 및 정부 관계자 등 과학기술계와 일반 국민을 대상으로 정부의 과학기술정책 활동과 성과에 대한 홍보를 강화하여 과학기술에 대한 관심과 이해를 제고\n ㅇ 국내외 과학기술 환경변화, 정책추진 및 기술 분야별 연구개발 활동 현황 등을 국회, 관련부처·기관 등에 제공하여 과학기술 정책 및 행정에 대한 이해 제고, contentsRmk=null, originUrl=https://www.kistep.re.kr/reportDetail.es?mid=a10305030000&rpt_tp=831-002&rpt_no=RES0220210150, atchfileUrl=https://www.kistep.re.kr/reportDownload.es?rpt_no=RES0220210150&seq=res_0026P@3, atchfileNm=2020 과학기술연감.pdf, viewCnt=null, regDate=2021-05-10 00:00:00, deptMng=홍세호,resultCode=1, resultMsg=null, contentId=RES0220210149, policyType=G00302, useYn=Y, brmCode=B01, brmTrans=1, subject=2020년 혁신도전프로젝트 사업 지원, publishOrg=한국과학기술기획평가원, contentsKor=○ 주요국 연구개발 현황 및 주요제도\n- (美) DARPA, ARPA-E, NSF, (EU) FET, (日) 문샷형 프로그램 조사·분석하여 한국 혁신도전 연구개발에의 시사점 제시\n○ 2020년 혁신도전 프로젝트 연구테마 선정 및 사업 기획\n- 연구테마 수요조사를 거쳐 출연(연)대상 테마 공모 및 테마발굴협의회 구성하여 후보 발굴 후 관계 부처와 협의 및 전문가 검토를 통해 후보 확정\n- 2020년 연구테마 총 5건 선정 및 사업 기획(DNA 기반 빅데이터 영구 저장 기술, FlyingAUV: 공중 이동이 가능한 자율무인잠수정, 플라즈마 기반 CO2 Free 폐유기물 기초원료화, 자폐성 장애를 위한 혼합형 디지털치료제, 상시 재난 감시용 성층권 드론)\n○ 제도 개선 과제\n- 2022년 본사업단 출범에 대비하여 제도적 운영 기반 마련이 시급하며, 범부처 사업으로서 자리매김을 위해서는 부처의 자발적·적극적 참여를 유인할 수 있는 제도개선 방안이 필요\n- 핵심이슈 해소를 위해 추진단과 사업단간 거버넌스 및 협력 강화, 사업단장 임기 및 평가 체계 구체화, 사업단장 해임 및 부재시 대응방안 명확화, 사업단장 및 사업단의 평가·진도점검 구체화, 연구개발 자율성 보장을 위한 연구노트 사용 의무화, 목표변경 및 조기종료 등 Design Review의 유연성·책임성 강화, 혁신법 시행 및 사업단 자율성 보장을 통한 사업관리 안정화 방향을 제시, contentsPurps=○ 실패 가능성이 있지만 미래 파급력이 큰 혁신기술 개발을 통해 국가 차원의 미래 경제·사회 혁신 추구\n○ 성과창출을 극대화할 수 있는 기획과 관리방식을 적용하여 기술·경제적 시장선도와 사회적 문제해결에 기여하는 파괴적 기술 창출, contentsCnclsn=○ 파괴적 혁신도전 프로젝트 추진과 제도혁신\n  - 과학 및 산업난제 등 경제적, 사회적 파급력이 큰 혁신적 성과 창출\n  - 과감한 목표에 도전하고 실패를 용인하는 도전적 연구문화 확산, contentsRmk=null, originUrl=https://www.kistep.re.kr/reportDetail.es?mid=a10305030000&rpt_tp=831-002&rpt_no=RES0220210149, atchfileUrl=https://www.kistep.re.kr/reportDownload.es?rpt_no=RES0220210149&seq=res_0026P@3, atchfileNm=0426-2020년 혁신도전프로젝트 사업 지원_결과보고서(최종).pdf, viewCnt=null, regDate=2021-04-22 00:00:00, deptMng=정민형],\"resultCode\":\"1\",\"resultMsg\":\"\"}}";

        JSONParser parser = new JSONParser();

        JSONObject jsonObject = (JSONObject) parser.parse(a);

        Map<String, Object> response = (Map<String, Object>) jsonObject.get("response");

        response.get("result");



    }
}
