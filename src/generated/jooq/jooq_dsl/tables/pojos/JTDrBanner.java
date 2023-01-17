/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrBanner implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer       idx;
    private final String        bannerCode;
    private final String        bannerType;
    private final String        subject;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final String        contentsType;
    private final String        imgUrl;
    private final Integer       imgWidth;
    private final Integer       imgHeight;
    private final String        contentsHtml;
    private final String        landingUrl;
    private final String        activeYn;
    private final Integer       slotNumber;
    private final String        explanation;
    private final String        registId;
    private final LocalDateTime registDate;
    private final String        updateId;
    private final LocalDateTime updateDate;

    public JTDrBanner(JTDrBanner value) {
        this.idx = value.idx;
        this.bannerCode = value.bannerCode;
        this.bannerType = value.bannerType;
        this.subject = value.subject;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.contentsType = value.contentsType;
        this.imgUrl = value.imgUrl;
        this.imgWidth = value.imgWidth;
        this.imgHeight = value.imgHeight;
        this.contentsHtml = value.contentsHtml;
        this.landingUrl = value.landingUrl;
        this.activeYn = value.activeYn;
        this.slotNumber = value.slotNumber;
        this.explanation = value.explanation;
        this.registId = value.registId;
        this.registDate = value.registDate;
        this.updateId = value.updateId;
        this.updateDate = value.updateDate;
    }

    public JTDrBanner(
        Integer       idx,
        String        bannerCode,
        String        bannerType,
        String        subject,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String        contentsType,
        String        imgUrl,
        Integer       imgWidth,
        Integer       imgHeight,
        String        contentsHtml,
        String        landingUrl,
        String        activeYn,
        Integer       slotNumber,
        String        explanation,
        String        registId,
        LocalDateTime registDate,
        String        updateId,
        LocalDateTime updateDate
    ) {
        this.idx = idx;
        this.bannerCode = bannerCode;
        this.bannerType = bannerType;
        this.subject = subject;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contentsType = contentsType;
        this.imgUrl = imgUrl;
        this.imgWidth = imgWidth;
        this.imgHeight = imgHeight;
        this.contentsHtml = contentsHtml;
        this.landingUrl = landingUrl;
        this.activeYn = activeYn;
        this.slotNumber = slotNumber;
        this.explanation = explanation;
        this.registId = registId;
        this.registDate = registDate;
        this.updateId = updateId;
        this.updateDate = updateDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.IDX</code>.
     */
    public Integer getIdx() {
        return this.idx;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.BANNER_CODE</code>. 배너코드
     */
    public String getBannerCode() {
        return this.bannerCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.BANNER_TYPE</code>. 배너종류
     */
    public String getBannerType() {
        return this.bannerType;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.SUBJECT</code>. 배너제목
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.START_DATE</code>. 시작날짜
     */
    public LocalDateTime getStartDate() {
        return this.startDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.END_DATE</code>. 종료날짜
     */
    public LocalDateTime getEndDate() {
        return this.endDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.CONTENTS_TYPE</code>. 내용종류
     */
    public String getContentsType() {
        return this.contentsType;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.IMG_URL</code>. 이미지 URL
     */
    public String getImgUrl() {
        return this.imgUrl;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.IMG_WIDTH</code>. 이미지 넓이
     */
    public Integer getImgWidth() {
        return this.imgWidth;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.IMG_HEIGHT</code>. 이미지 높이
     */
    public Integer getImgHeight() {
        return this.imgHeight;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.CONTENTS_HTML</code>. HTML 내용
     */
    public String getContentsHtml() {
        return this.contentsHtml;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.LANDING_URL</code>. 랜딩 URL
     */
    public String getLandingUrl() {
        return this.landingUrl;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.ACTIVE_YN</code>. 활성화/비활성
     */
    public String getActiveYn() {
        return this.activeYn;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.SLOT_NUMBER</code>. 베너슬롯번호
     */
    public Integer getSlotNumber() {
        return this.slotNumber;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.EXPLANATION</code>. 설명
     */
    public String getExplanation() {
        return this.explanation;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.REGIST_ID</code>. 등록자
     */
    public String getRegistId() {
        return this.registId;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.REGIST_DATE</code>. 등록일
     */
    public LocalDateTime getRegistDate() {
        return this.registDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.UPDATE_ID</code>. 수정자
     */
    public String getUpdateId() {
        return this.updateId;
    }

    /**
     * Getter for <code>dmc_report.T_DR_BANNER.UPDATE_DATE</code>. 수정일
     */
    public LocalDateTime getUpdateDate() {
        return this.updateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrBanner (");

        sb.append(idx);
        sb.append(", ").append(bannerCode);
        sb.append(", ").append(bannerType);
        sb.append(", ").append(subject);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(contentsType);
        sb.append(", ").append(imgUrl);
        sb.append(", ").append(imgWidth);
        sb.append(", ").append(imgHeight);
        sb.append(", ").append(contentsHtml);
        sb.append(", ").append(landingUrl);
        sb.append(", ").append(activeYn);
        sb.append(", ").append(slotNumber);
        sb.append(", ").append(explanation);
        sb.append(", ").append(registId);
        sb.append(", ").append(registDate);
        sb.append(", ").append(updateId);
        sb.append(", ").append(updateDate);

        sb.append(")");
        return sb.toString();
    }
}
