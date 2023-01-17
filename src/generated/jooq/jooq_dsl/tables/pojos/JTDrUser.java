/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * 회원 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String        userId;
    private final String        passwd;
    private final String        name;
    private final String        email;
    private final String        grade;
    private final String        authority;
    private final String        gender;
    private final LocalDate     birthday;
    private final String        lcYn;
    private final String        phone;
    private final String        mobile;
    private final String        letterYn;
    private final LocalDateTime regDate;
    private final Integer       keyCnt;
    private final String        userStatus;
    private final Integer       point;
    private final String        role;
    private final String        olduser;
    private final String        olduserpoint;
    private final String        deliveryCode;
    private final String        recipient;
    private final String        receiptName;
    private final Integer       receiptAddrnum;
    private final String        receiptAddrRoad;
    private final String        receiptAddrJibun;
    private final String        receiptAddrDetail;
    private final String        receiptMobile;
    private final String        receiptMemo;
    private final String        dormancyMailYn;

    public JTDrUser(JTDrUser value) {
        this.userId = value.userId;
        this.passwd = value.passwd;
        this.name = value.name;
        this.email = value.email;
        this.grade = value.grade;
        this.authority = value.authority;
        this.gender = value.gender;
        this.birthday = value.birthday;
        this.lcYn = value.lcYn;
        this.phone = value.phone;
        this.mobile = value.mobile;
        this.letterYn = value.letterYn;
        this.regDate = value.regDate;
        this.keyCnt = value.keyCnt;
        this.userStatus = value.userStatus;
        this.point = value.point;
        this.role = value.role;
        this.olduser = value.olduser;
        this.olduserpoint = value.olduserpoint;
        this.deliveryCode = value.deliveryCode;
        this.recipient = value.recipient;
        this.receiptName = value.receiptName;
        this.receiptAddrnum = value.receiptAddrnum;
        this.receiptAddrRoad = value.receiptAddrRoad;
        this.receiptAddrJibun = value.receiptAddrJibun;
        this.receiptAddrDetail = value.receiptAddrDetail;
        this.receiptMobile = value.receiptMobile;
        this.receiptMemo = value.receiptMemo;
        this.dormancyMailYn = value.dormancyMailYn;
    }

    public JTDrUser(
        String        userId,
        String        passwd,
        String        name,
        String        email,
        String        grade,
        String        authority,
        String        gender,
        LocalDate     birthday,
        String        lcYn,
        String        phone,
        String        mobile,
        String        letterYn,
        LocalDateTime regDate,
        Integer       keyCnt,
        String        userStatus,
        Integer       point,
        String        role,
        String        olduser,
        String        olduserpoint,
        String        deliveryCode,
        String        recipient,
        String        receiptName,
        Integer       receiptAddrnum,
        String        receiptAddrRoad,
        String        receiptAddrJibun,
        String        receiptAddrDetail,
        String        receiptMobile,
        String        receiptMemo,
        String        dormancyMailYn
    ) {
        this.userId = userId;
        this.passwd = passwd;
        this.name = name;
        this.email = email;
        this.grade = grade;
        this.authority = authority;
        this.gender = gender;
        this.birthday = birthday;
        this.lcYn = lcYn;
        this.phone = phone;
        this.mobile = mobile;
        this.letterYn = letterYn;
        this.regDate = regDate;
        this.keyCnt = keyCnt;
        this.userStatus = userStatus;
        this.point = point;
        this.role = role;
        this.olduser = olduser;
        this.olduserpoint = olduserpoint;
        this.deliveryCode = deliveryCode;
        this.recipient = recipient;
        this.receiptName = receiptName;
        this.receiptAddrnum = receiptAddrnum;
        this.receiptAddrRoad = receiptAddrRoad;
        this.receiptAddrJibun = receiptAddrJibun;
        this.receiptAddrDetail = receiptAddrDetail;
        this.receiptMobile = receiptMobile;
        this.receiptMemo = receiptMemo;
        this.dormancyMailYn = dormancyMailYn;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.USER_ID</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.PASSWD</code>.
     */
    public String getPasswd() {
        return this.passwd;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.EMAIL</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.GRADE</code>. 일반:1 패널:2
     */
    public String getGrade() {
        return this.grade;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.AUTHORITY</code>. 일반:1 계정권한:2
     */
    public String getAuthority() {
        return this.authority;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.GENDER</code>.
     */
    public String getGender() {
        return this.gender;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.BIRTHDAY</code>.
     */
    public LocalDate getBirthday() {
        return this.birthday;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.LC_YN</code>. 음력 여부
     */
    public String getLcYn() {
        return this.lcYn;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.PHONE</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.MOBILE</code>.
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.LETTER_YN</code>. 레터 수신여부
     */
    public String getLetterYn() {
        return this.letterYn;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.REG_DATE</code>.
     */
    public LocalDateTime getRegDate() {
        return this.regDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.KEY_CNT</code>.
     */
    public Integer getKeyCnt() {
        return this.keyCnt;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.USER_STATUS</code>. 1 : 활성 2 : 휴면 3
     * : 탈퇴
     */
    public String getUserStatus() {
        return this.userStatus;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.POINT</code>.
     */
    public Integer getPoint() {
        return this.point;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.ROLE</code>.
     */
    public String getRole() {
        return this.role;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.OLDUSER</code>.
     * 0:신규유저,1:올드유저,2:임시비밀번호발급된올드유저
     */
    public String getOlduser() {
        return this.olduser;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.OLDUSERPOINT</code>.
     * 0:신규유저,1:올드유저포인트미제공,2:올드유저포인트제공완료
     */
    public String getOlduserpoint() {
        return this.olduserpoint;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.DELIVERY_CODE</code>. 배송지 코드
     */
    public String getDeliveryCode() {
        return this.deliveryCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECIPIENT</code>. 수령인
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECEIPT_NAME</code>. 배송지 명
     */
    public String getReceiptName() {
        return this.receiptName;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECEIPT_ADDRNUM</code>. 우편번호
     */
    public Integer getReceiptAddrnum() {
        return this.receiptAddrnum;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECEIPT_ADDR_ROAD</code>. 도로명 주소
     */
    public String getReceiptAddrRoad() {
        return this.receiptAddrRoad;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECEIPT_ADDR_JIBUN</code>. 지번 주소
     */
    public String getReceiptAddrJibun() {
        return this.receiptAddrJibun;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECEIPT_ADDR_DETAIL</code>. 상세 주소
     */
    public String getReceiptAddrDetail() {
        return this.receiptAddrDetail;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECEIPT_MOBILE</code>. 연락처
     */
    public String getReceiptMobile() {
        return this.receiptMobile;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.RECEIPT_MEMO</code>. 요청사항
     */
    public String getReceiptMemo() {
        return this.receiptMemo;
    }

    /**
     * Getter for <code>dmc_report.T_DR_USER.DORMANCY_MAIL_YN</code>. 휴면 메일 전송
     * 여부
     */
    public String getDormancyMailYn() {
        return this.dormancyMailYn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrUser (");

        sb.append(userId);
        sb.append(", ").append(passwd);
        sb.append(", ").append(name);
        sb.append(", ").append(email);
        sb.append(", ").append(grade);
        sb.append(", ").append(authority);
        sb.append(", ").append(gender);
        sb.append(", ").append(birthday);
        sb.append(", ").append(lcYn);
        sb.append(", ").append(phone);
        sb.append(", ").append(mobile);
        sb.append(", ").append(letterYn);
        sb.append(", ").append(regDate);
        sb.append(", ").append(keyCnt);
        sb.append(", ").append(userStatus);
        sb.append(", ").append(point);
        sb.append(", ").append(role);
        sb.append(", ").append(olduser);
        sb.append(", ").append(olduserpoint);
        sb.append(", ").append(deliveryCode);
        sb.append(", ").append(recipient);
        sb.append(", ").append(receiptName);
        sb.append(", ").append(receiptAddrnum);
        sb.append(", ").append(receiptAddrRoad);
        sb.append(", ").append(receiptAddrJibun);
        sb.append(", ").append(receiptAddrDetail);
        sb.append(", ").append(receiptMobile);
        sb.append(", ").append(receiptMemo);
        sb.append(", ").append(dormancyMailYn);

        sb.append(")");
        return sb.toString();
    }
}
