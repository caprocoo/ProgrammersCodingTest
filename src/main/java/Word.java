import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : ExCode
 * author         : caprocoo
 * date           : 2023-09-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-13        caprocoo       최초 생성
 */
public enum Word {


//    foa, mocie, motie;

    SAMIL100("3.1운동 100주년 기념사업추진위원회"),
    KTV("KTV"),
    BAI("감사원"),
    PIPC("개인정보보호위원회"),
    ESDC("경제사회노동위원회"),
    NPA("경찰청"),
    MOLAB("고용노동부"),
    MOEL("고용노동부"),
    AIRFORCE("공군"),
    FTC("공정거래위원회"),
    MOST("과학기술부"),
    MSIT("과학기술정보통신부"),
    MSIP("미래창조과학부"),

    CUSTOMS("관세청"),
    MEST("교육과학기술부"),
    MOE_18("교육부"),
    NSTC("교육부"),
    MPVA("국가보훈처"),
    HUMANRIGHTS("국가인권위원회"),
    NIS("국가정보원"),
    YOUTH("국가청소년위원회"),
    OPM("국무총리실"),
    PMO("국무조정실"),
    OK("국민고충처리위원회"),
    ACRC("국민권익위원회"),
    PCNC("국민대통합위원회"),

    MND("국방부"),
    NTS("국세청"),
    MOCT("건설교통부"),
    MLTM("국토해양부"),
    MOLIT("국토교통부"),
    FSS("금융감독원"),
    FSC("금융위원회"),
    KMA("기상청"),
    MPB("기획예산처"),
    MOSF("기획재정부"),
    MOFE("재정경제부"),
    MOEF("기획재정부"),
    MIFAFF("농림수산식품부"),
    MAFRA("농림축산식품부"),

    MAF("농림부"),
    RDA("농촌진흥청"),
    SPO("대검찰청"),
    CHA("문화재청"),
    MCST("문화체육관광부"),
    MCT("문화관광부"),
    KCC("방송통신위원회"),
    DAPA("방위사업청"),
    MOJ("법무부"),
    MOLEG("법제처"),
    MMA("병무청"),
    MW("보건복지부"),
    MOHW("보건복지부"),
    FOREST("산림청"),

    FOA("산림청"),
    MOCIE("산업자원부"),
    MKE("지식경제부"),
    MOTIE("산업통상자원부"),
    SDA("새만금개발청"),
    NFA("소방청"),
    NEMA("소방방재청"),
    MFDS("식품의약품안전처"),
    KFDA("식품의약품안전청"),
    KDMCO("에너지관리공단"),
    MOGE("여성가족부"),
    MOGEF("여성가족부"),
    MOFA("외교부"),
    MOFAT("외교통상부"),

    NSSC("원자력안전위원회"),
    KOREAPLUS("위클리공감"),
    GONGGAM("위클리공감"),
    ARMY("육군"),
    MPM("인사혁신처"),
    INCHEON2014("인천아시아경기대회조직위원회"),
    BETTERFUTURE("저출산고령사회위원회"),
    MIC("정보통신부"),
    PRESIDENT("제20대 대통령실"),
    PPS("조달청"),
    MSS("중소벤처기업부"),
    SMBA("중소기업청"),
    SEC("중앙선거관리위원회"),
    CDC("질병관리본부"),

    KDCA("질병관리청"),
    YOUNG("청년위원회"),
    CWD("청와대"),
    IHACCP("축산물안전관리인증원"),
    KOSTAT("통계청"),
    NSO("통계청"),
    UNIKOREA("통일부"),
    KIPO("특허청"),
    KONEPA("한국원자력문화재단"),
    KAERI("한국원자력연구원"),
    KORAIL("한국철도공사"),
    NAVY("해군"),
    KCG("해양경찰청"),
    NMPA("해양경찰청"),

    MOF("해양수산부"),
    MOSPA("안전행정부"),
    MPSS("국민안전처"),
    MOIS("행정안전부"),
    MOPAS("행정안전부"),
    MOGAHA("행정자치부"),
    MACC("행정중심복합도시건설청"),
    ME("환경부"),
    ALLIM("국정홍보처"),
    정책브리핑("정책브리핑");
    private String data;

    Word(String data) {
        this.data = data;
    }

    private static final Map<String, String> cache = new HashMap<>();

    public static String getData(String key) {
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        
        // enum 특성상 숫자로 시작하는 경우가 없기에 cache 추가 및 return
        if (key.equals("4th-ir")) {
            cache.put(key, "4차산업혁명위원회");
            return "4차산업혁명위원회";
        }
        
        for (Word word : values()) {
            if (word.name().equalsIgnoreCase(key)) {
                String value = word.data;
                cache.put(key, value); // 결과를 캐싱
                return value;
            }
        }
        return "nothing";
    }

}
