/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 리포트 열람 이력 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JZDrReportView implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer       id;
    private final String        userId;
    private final String        userAuthCode;
    private final String        rCode;
    private final String        rType;
    private final String        connectionIp;
    private final String        networkPath;
    private final String        keywordType;
    private final String        keyword;
    private final String        category;
    private final String        deviceType;
    private final String        device;
    private final String        browser;
    private final LocalDateTime regDate;

    public JZDrReportView(JZDrReportView value) {
        this.id = value.id;
        this.userId = value.userId;
        this.userAuthCode = value.userAuthCode;
        this.rCode = value.rCode;
        this.rType = value.rType;
        this.connectionIp = value.connectionIp;
        this.networkPath = value.networkPath;
        this.keywordType = value.keywordType;
        this.keyword = value.keyword;
        this.category = value.category;
        this.deviceType = value.deviceType;
        this.device = value.device;
        this.browser = value.browser;
        this.regDate = value.regDate;
    }

    public JZDrReportView(
        Integer       id,
        String        userId,
        String        userAuthCode,
        String        rCode,
        String        rType,
        String        connectionIp,
        String        networkPath,
        String        keywordType,
        String        keyword,
        String        category,
        String        deviceType,
        String        device,
        String        browser,
        LocalDateTime regDate
    ) {
        this.id = id;
        this.userId = userId;
        this.userAuthCode = userAuthCode;
        this.rCode = rCode;
        this.rType = rType;
        this.connectionIp = connectionIp;
        this.networkPath = networkPath;
        this.keywordType = keywordType;
        this.keyword = keyword;
        this.category = category;
        this.deviceType = deviceType;
        this.device = device;
        this.browser = browser;
        this.regDate = regDate;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.USER_ID</code>. 사용자ID
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.USER_AUTH_CODE</code>. 계정 권한
     * 코드
     */
    public String getUserAuthCode() {
        return this.userAuthCode;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.R_CODE</code>.
     */
    public String getRCode() {
        return this.rCode;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.R_TYPE</code>. 보고서 종류
     */
    public String getRType() {
        return this.rType;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.CONNECTION_IP</code>. 접속IP
     */
    public String getConnectionIp() {
        return this.connectionIp;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.NETWORK_PATH</code>. 접속경로
     */
    public String getNetworkPath() {
        return this.networkPath;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.KEYWORD_TYPE</code>. 키워드 종류
     */
    public String getKeywordType() {
        return this.keywordType;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.KEYWORD</code>. 키워드
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.CATEGORY</code>. 카테고리 내역
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.DEVICE_TYPE</code>. 디바이스 종류
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.DEVICE</code>. 이용기기
     */
    public String getDevice() {
        return this.device;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.BROWSER</code>. 접속 브라우저
     */
    public String getBrowser() {
        return this.browser;
    }

    /**
     * Getter for <code>dmc_report.Z_DR_REPORT_VIEW.REG_DATE</code>.
     */
    public LocalDateTime getRegDate() {
        return this.regDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JZDrReportView (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(userAuthCode);
        sb.append(", ").append(rCode);
        sb.append(", ").append(rType);
        sb.append(", ").append(connectionIp);
        sb.append(", ").append(networkPath);
        sb.append(", ").append(keywordType);
        sb.append(", ").append(keyword);
        sb.append(", ").append(category);
        sb.append(", ").append(deviceType);
        sb.append(", ").append(device);
        sb.append(", ").append(browser);
        sb.append(", ").append(regDate);

        sb.append(")");
        return sb.toString();
    }
}
