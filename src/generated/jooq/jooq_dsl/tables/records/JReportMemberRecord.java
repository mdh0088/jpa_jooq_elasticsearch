/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import jooq.jooq_dsl.enums.ReportMemberRmAge;
import jooq.jooq_dsl.enums.ReportMemberRmAreaType;
import jooq.jooq_dsl.enums.ReportMemberRmCar;
import jooq.jooq_dsl.enums.ReportMemberRmChild;
import jooq.jooq_dsl.enums.ReportMemberRmEducation;
import jooq.jooq_dsl.enums.ReportMemberRmEmailReturn;
import jooq.jooq_dsl.enums.ReportMemberRmFamily;
import jooq.jooq_dsl.enums.ReportMemberRmGrade;
import jooq.jooq_dsl.enums.ReportMemberRmHouse;
import jooq.jooq_dsl.enums.ReportMemberRmIncome1;
import jooq.jooq_dsl.enums.ReportMemberRmIncome2;
import jooq.jooq_dsl.enums.ReportMemberRmLiving;
import jooq.jooq_dsl.enums.ReportMemberRmMarry;
import jooq.jooq_dsl.enums.ReportMemberRmPanelState;
import jooq.jooq_dsl.enums.ReportMemberRmPhoneType;
import jooq.jooq_dsl.enums.ReportMemberRmSolar;
import jooq.jooq_dsl.enums.ReportMemberRmState;
import jooq.jooq_dsl.tables.JReportMember;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 회원
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JReportMemberRecord extends UpdatableRecordImpl<JReportMemberRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>dmc_report.Report_Member.rm_grade</code>. 등급(0:관리자,
     * 1:일반, 2:프리미엄, 3:패널, 4:뉴스레터)
     */
    public JReportMemberRecord setRmGrade(ReportMemberRmGrade value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_grade</code>. 등급(0:관리자,
     * 1:일반, 2:프리미엄, 3:패널, 4:뉴스레터)
     */
    public ReportMemberRmGrade getRmGrade() {
        return (ReportMemberRmGrade) get(0);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_name</code>. 이름
     */
    public JReportMemberRecord setRmName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_name</code>. 이름
     */
    public String getRmName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_id</code>. 아이디
     */
    public JReportMemberRecord setRmId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_id</code>. 아이디
     */
    public String getRmId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_pwd</code>. 패스워드
     */
    public JReportMemberRecord setRmPwd(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_pwd</code>. 패스워드
     */
    public String getRmPwd() {
        return (String) get(3);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_email</code>. 이메일
     */
    public JReportMemberRecord setRmEmail(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_email</code>. 이메일
     */
    public String getRmEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_email_return</code>.
     * 메일수신(Y:수신,N:거절)
     */
    public JReportMemberRecord setRmEmailReturn(ReportMemberRmEmailReturn value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_email_return</code>.
     * 메일수신(Y:수신,N:거절)
     */
    public ReportMemberRmEmailReturn getRmEmailReturn() {
        return (ReportMemberRmEmailReturn) get(5);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_birth</code>. 생년월일
     */
    public JReportMemberRecord setRmBirth(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_birth</code>. 생년월일
     */
    public String getRmBirth() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_solar</code>.
     */
    public JReportMemberRecord setRmSolar(ReportMemberRmSolar value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_solar</code>.
     */
    public ReportMemberRmSolar getRmSolar() {
        return (ReportMemberRmSolar) get(7);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_age</code>. 연령대
     */
    public JReportMemberRecord setRmAge(ReportMemberRmAge value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_age</code>. 연령대
     */
    public ReportMemberRmAge getRmAge() {
        return (ReportMemberRmAge) get(8);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_gender</code>. 성별
     */
    public JReportMemberRecord setRmGender(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_gender</code>. 성별
     */
    public String getRmGender() {
        return (String) get(9);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.jc_key</code>. 기업분류 PK
     */
    public JReportMemberRecord setJcKey(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.jc_key</code>. 기업분류 PK
     */
    public Integer getJcKey() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_company</code>. 회사
     */
    public JReportMemberRecord setRmCompany(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_company</code>. 회사
     */
    public String getRmCompany() {
        return (String) get(11);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_department</code>. 부서
     */
    public JReportMemberRecord setRmDepartment(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_department</code>. 부서
     */
    public String getRmDepartment() {
        return (String) get(12);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_position</code>. 직급
     */
    public JReportMemberRecord setRmPosition(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_position</code>. 직급
     */
    public String getRmPosition() {
        return (String) get(13);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_area</code>. 지역
     */
    public JReportMemberRecord setRmArea(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_area</code>. 지역
     */
    public String getRmArea() {
        return (String) get(14);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_area_type</code>. 주소타입(0:기타,
     * 1:집, 2:회사)
     */
    public JReportMemberRecord setRmAreaType(ReportMemberRmAreaType value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_area_type</code>. 주소타입(0:기타,
     * 1:집, 2:회사)
     */
    public ReportMemberRmAreaType getRmAreaType() {
        return (ReportMemberRmAreaType) get(15);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_zipcode</code>. 우편번호
     */
    public JReportMemberRecord setRmZipcode(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_zipcode</code>. 우편번호
     */
    public String getRmZipcode() {
        return (String) get(16);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_address1</code>. 주소
     */
    public JReportMemberRecord setRmAddress1(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_address1</code>. 주소
     */
    public String getRmAddress1() {
        return (String) get(17);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_address2</code>. 상세주소
     */
    public JReportMemberRecord setRmAddress2(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_address2</code>. 상세주소
     */
    public String getRmAddress2() {
        return (String) get(18);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_phone_type</code>.
     * 연락처타입(0:기타, 1:휴대폰, 2:유선전화)
     */
    public JReportMemberRecord setRmPhoneType(ReportMemberRmPhoneType value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_phone_type</code>.
     * 연락처타입(0:기타, 1:휴대폰, 2:유선전화)
     */
    public ReportMemberRmPhoneType getRmPhoneType() {
        return (ReportMemberRmPhoneType) get(19);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_phone0</code>. 통신사
     */
    public JReportMemberRecord setRmPhone0(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_phone0</code>. 통신사
     */
    public String getRmPhone0() {
        return (String) get(20);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_phone1</code>. 연락처
     */
    public JReportMemberRecord setRmPhone1(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_phone1</code>. 연락처
     */
    public String getRmPhone1() {
        return (String) get(21);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_marry</code>. 결혼유무(Y:기혼,
     * N:미혼)
     */
    public JReportMemberRecord setRmMarry(ReportMemberRmMarry value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_marry</code>. 결혼유무(Y:기혼,
     * N:미혼)
     */
    public ReportMemberRmMarry getRmMarry() {
        return (ReportMemberRmMarry) get(22);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_child</code>. 자녀
     */
    public JReportMemberRecord setRmChild(ReportMemberRmChild value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_child</code>. 자녀
     */
    public ReportMemberRmChild getRmChild() {
        return (ReportMemberRmChild) get(23);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_family</code>. 가족수
     */
    public JReportMemberRecord setRmFamily(ReportMemberRmFamily value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_family</code>. 가족수
     */
    public ReportMemberRmFamily getRmFamily() {
        return (ReportMemberRmFamily) get(24);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_living</code>. 주거타입(0:미선택
     * 1:자택 2:전세/월세 3:기타)
     */
    public JReportMemberRecord setRmLiving(ReportMemberRmLiving value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_living</code>. 주거타입(0:미선택
     * 1:자택 2:전세/월세 3:기타)
     */
    public ReportMemberRmLiving getRmLiving() {
        return (ReportMemberRmLiving) get(25);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_house</code>. 주거타입2(0:미선택
     * 1:아파트 2:다세대주택 3:다가구주택 4:오피스텔 5:단독주택 6:기타)
     */
    public JReportMemberRecord setRmHouse(ReportMemberRmHouse value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_house</code>. 주거타입2(0:미선택
     * 1:아파트 2:다세대주택 3:다가구주택 4:오피스텔 5:단독주택 6:기타)
     */
    public ReportMemberRmHouse getRmHouse() {
        return (ReportMemberRmHouse) get(26);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_income1</code>.
     * 개인소득(0:100만원이하 ~ 10:1000만원이상)
     */
    public JReportMemberRecord setRmIncome1(ReportMemberRmIncome1 value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_income1</code>.
     * 개인소득(0:100만원이하 ~ 10:1000만원이상)
     */
    public ReportMemberRmIncome1 getRmIncome1() {
        return (ReportMemberRmIncome1) get(27);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_income2</code>.
     * 가구소득(0:100만원이하 ~ 10:1000만원이상)
     */
    public JReportMemberRecord setRmIncome2(ReportMemberRmIncome2 value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_income2</code>.
     * 가구소득(0:100만원이하 ~ 10:1000만원이상)
     */
    public ReportMemberRmIncome2 getRmIncome2() {
        return (ReportMemberRmIncome2) get(28);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_car</code>. 자동차(Y:보유, N:미보유)
     */
    public JReportMemberRecord setRmCar(ReportMemberRmCar value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_car</code>. 자동차(Y:보유, N:미보유)
     */
    public ReportMemberRmCar getRmCar() {
        return (ReportMemberRmCar) get(29);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_education</code>. 학력(0:미선택
     * 1:초졸 2:중졸 3:고졸 4:대졸 5:학사 이상)
     */
    public JReportMemberRecord setRmEducation(ReportMemberRmEducation value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_education</code>. 학력(0:미선택
     * 1:초졸 2:중졸 3:고졸 4:대졸 5:학사 이상)
     */
    public ReportMemberRmEducation getRmEducation() {
        return (ReportMemberRmEducation) get(30);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_etc</code>. 기타
     */
    public JReportMemberRecord setRmEtc(String value) {
        set(31, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_etc</code>. 기타
     */
    public String getRmEtc() {
        return (String) get(31);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_point</code>. 포인트
     */
    public JReportMemberRecord setRmPoint(Integer value) {
        set(32, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_point</code>. 포인트
     */
    public Integer getRmPoint() {
        return (Integer) get(32);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_premium</code>. 프리미엄 가입일
     */
    public JReportMemberRecord setRmPremium(LocalDate value) {
        set(33, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_premium</code>. 프리미엄 가입일
     */
    public LocalDate getRmPremium() {
        return (LocalDate) get(33);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_panel_state</code>.
     * 패널상태(0:프리미엄 1:신청 2:승인 3보류 4~6미사용)
     */
    public JReportMemberRecord setRmPanelState(ReportMemberRmPanelState value) {
        set(34, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_panel_state</code>.
     * 패널상태(0:프리미엄 1:신청 2:승인 3보류 4~6미사용)
     */
    public ReportMemberRmPanelState getRmPanelState() {
        return (ReportMemberRmPanelState) get(34);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_panel</code>. 패널 가입일
     */
    public JReportMemberRecord setRmPanel(LocalDate value) {
        set(35, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_panel</code>. 패널 가입일
     */
    public LocalDate getRmPanel() {
        return (LocalDate) get(35);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_demotion</code>. 강등일
     */
    public JReportMemberRecord setRmDemotion(LocalDate value) {
        set(36, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_demotion</code>. 강등일
     */
    public LocalDate getRmDemotion() {
        return (LocalDate) get(36);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_proposer</code>. 추천인(추천인
     * rm_key)
     */
    public JReportMemberRecord setRmProposer(Integer value) {
        set(37, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_proposer</code>. 추천인(추천인
     * rm_key)
     */
    public Integer getRmProposer() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_modifydate</code>. 수정일시
     */
    public JReportMemberRecord setRmModifydate(LocalDateTime value) {
        set(38, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_modifydate</code>. 수정일시
     */
    public LocalDateTime getRmModifydate() {
        return (LocalDateTime) get(38);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_inputdate</code>. 입력일시
     */
    public JReportMemberRecord setRmInputdate(LocalDateTime value) {
        set(39, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_inputdate</code>. 입력일시
     */
    public LocalDateTime getRmInputdate() {
        return (LocalDateTime) get(39);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_state</code>. 상태(0:보류, 1:사용,
     * 2:미사용)
     */
    public JReportMemberRecord setRmState(ReportMemberRmState value) {
        set(40, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_state</code>. 상태(0:보류, 1:사용,
     * 2:미사용)
     */
    public ReportMemberRmState getRmState() {
        return (ReportMemberRmState) get(40);
    }

    /**
     * Setter for <code>dmc_report.Report_Member.rm_activeyn</code>. 상태(Y:유료,
     * N:무료)
     */
    public JReportMemberRecord setRmActiveyn(String value) {
        set(41, value);
        return this;
    }

    /**
     * Getter for <code>dmc_report.Report_Member.rm_activeyn</code>. 상태(Y:유료,
     * N:무료)
     */
    public String getRmActiveyn() {
        return (String) get(41);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JReportMemberRecord
     */
    public JReportMemberRecord() {
        super(JReportMember.REPORT_MEMBER);
    }

    /**
     * Create a detached, initialised JReportMemberRecord
     */
    public JReportMemberRecord(ReportMemberRmGrade rmGrade, String rmName, String rmId, String rmPwd, String rmEmail, ReportMemberRmEmailReturn rmEmailReturn, String rmBirth, ReportMemberRmSolar rmSolar, ReportMemberRmAge rmAge, String rmGender, Integer jcKey, String rmCompany, String rmDepartment, String rmPosition, String rmArea, ReportMemberRmAreaType rmAreaType, String rmZipcode, String rmAddress1, String rmAddress2, ReportMemberRmPhoneType rmPhoneType, String rmPhone0, String rmPhone1, ReportMemberRmMarry rmMarry, ReportMemberRmChild rmChild, ReportMemberRmFamily rmFamily, ReportMemberRmLiving rmLiving, ReportMemberRmHouse rmHouse, ReportMemberRmIncome1 rmIncome1, ReportMemberRmIncome2 rmIncome2, ReportMemberRmCar rmCar, ReportMemberRmEducation rmEducation, String rmEtc, Integer rmPoint, LocalDate rmPremium, ReportMemberRmPanelState rmPanelState, LocalDate rmPanel, LocalDate rmDemotion, Integer rmProposer, LocalDateTime rmModifydate, LocalDateTime rmInputdate, ReportMemberRmState rmState, String rmActiveyn) {
        super(JReportMember.REPORT_MEMBER);

        setRmGrade(rmGrade);
        setRmName(rmName);
        setRmId(rmId);
        setRmPwd(rmPwd);
        setRmEmail(rmEmail);
        setRmEmailReturn(rmEmailReturn);
        setRmBirth(rmBirth);
        setRmSolar(rmSolar);
        setRmAge(rmAge);
        setRmGender(rmGender);
        setJcKey(jcKey);
        setRmCompany(rmCompany);
        setRmDepartment(rmDepartment);
        setRmPosition(rmPosition);
        setRmArea(rmArea);
        setRmAreaType(rmAreaType);
        setRmZipcode(rmZipcode);
        setRmAddress1(rmAddress1);
        setRmAddress2(rmAddress2);
        setRmPhoneType(rmPhoneType);
        setRmPhone0(rmPhone0);
        setRmPhone1(rmPhone1);
        setRmMarry(rmMarry);
        setRmChild(rmChild);
        setRmFamily(rmFamily);
        setRmLiving(rmLiving);
        setRmHouse(rmHouse);
        setRmIncome1(rmIncome1);
        setRmIncome2(rmIncome2);
        setRmCar(rmCar);
        setRmEducation(rmEducation);
        setRmEtc(rmEtc);
        setRmPoint(rmPoint);
        setRmPremium(rmPremium);
        setRmPanelState(rmPanelState);
        setRmPanel(rmPanel);
        setRmDemotion(rmDemotion);
        setRmProposer(rmProposer);
        setRmModifydate(rmModifydate);
        setRmInputdate(rmInputdate);
        setRmState(rmState);
        setRmActiveyn(rmActiveyn);
    }

    /**
     * Create a detached, initialised JReportMemberRecord
     */
    public JReportMemberRecord(jooq.jooq_dsl.tables.pojos.JReportMember value) {
        super(JReportMember.REPORT_MEMBER);

        if (value != null) {
            setRmGrade(value.getRmGrade());
            setRmName(value.getRmName());
            setRmId(value.getRmId());
            setRmPwd(value.getRmPwd());
            setRmEmail(value.getRmEmail());
            setRmEmailReturn(value.getRmEmailReturn());
            setRmBirth(value.getRmBirth());
            setRmSolar(value.getRmSolar());
            setRmAge(value.getRmAge());
            setRmGender(value.getRmGender());
            setJcKey(value.getJcKey());
            setRmCompany(value.getRmCompany());
            setRmDepartment(value.getRmDepartment());
            setRmPosition(value.getRmPosition());
            setRmArea(value.getRmArea());
            setRmAreaType(value.getRmAreaType());
            setRmZipcode(value.getRmZipcode());
            setRmAddress1(value.getRmAddress1());
            setRmAddress2(value.getRmAddress2());
            setRmPhoneType(value.getRmPhoneType());
            setRmPhone0(value.getRmPhone0());
            setRmPhone1(value.getRmPhone1());
            setRmMarry(value.getRmMarry());
            setRmChild(value.getRmChild());
            setRmFamily(value.getRmFamily());
            setRmLiving(value.getRmLiving());
            setRmHouse(value.getRmHouse());
            setRmIncome1(value.getRmIncome1());
            setRmIncome2(value.getRmIncome2());
            setRmCar(value.getRmCar());
            setRmEducation(value.getRmEducation());
            setRmEtc(value.getRmEtc());
            setRmPoint(value.getRmPoint());
            setRmPremium(value.getRmPremium());
            setRmPanelState(value.getRmPanelState());
            setRmPanel(value.getRmPanel());
            setRmDemotion(value.getRmDemotion());
            setRmProposer(value.getRmProposer());
            setRmModifydate(value.getRmModifydate());
            setRmInputdate(value.getRmInputdate());
            setRmState(value.getRmState());
            setRmActiveyn(value.getRmActiveyn());
        }
    }
}