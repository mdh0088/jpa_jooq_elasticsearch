/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * 아이템 유닛 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrItemCode implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String        itemCode;
    private final String        itemGroupCode;
    private final String        itemName;
    private final Integer       itemType;
    private final String        itemParentCode;
    private final Integer       itemDepth;
    private final Integer       itemSeq;
    private final String        itemActive;
    private final String        regId;
    private final LocalDateTime regDate;
    private final LocalDateTime editDate;
    private final String        editId;

    public JTDrItemCode(JTDrItemCode value) {
        this.itemCode = value.itemCode;
        this.itemGroupCode = value.itemGroupCode;
        this.itemName = value.itemName;
        this.itemType = value.itemType;
        this.itemParentCode = value.itemParentCode;
        this.itemDepth = value.itemDepth;
        this.itemSeq = value.itemSeq;
        this.itemActive = value.itemActive;
        this.regId = value.regId;
        this.regDate = value.regDate;
        this.editDate = value.editDate;
        this.editId = value.editId;
    }

    public JTDrItemCode(
        String        itemCode,
        String        itemGroupCode,
        String        itemName,
        Integer       itemType,
        String        itemParentCode,
        Integer       itemDepth,
        Integer       itemSeq,
        String        itemActive,
        String        regId,
        LocalDateTime regDate,
        LocalDateTime editDate,
        String        editId
    ) {
        this.itemCode = itemCode;
        this.itemGroupCode = itemGroupCode;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemParentCode = itemParentCode;
        this.itemDepth = itemDepth;
        this.itemSeq = itemSeq;
        this.itemActive = itemActive;
        this.regId = regId;
        this.regDate = regDate;
        this.editDate = editDate;
        this.editId = editId;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_CODE</code>.
     */
    public String getItemCode() {
        return this.itemCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_GROUP_CODE</code>. 아이템 그룹
     * 코드
     */
    public String getItemGroupCode() {
        return this.itemGroupCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_NAME</code>. 아이템 명
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_TYPE</code>. 코드 타입 (0: 공통
     * 1: 카테고리)
     */
    public Integer getItemType() {
        return this.itemType;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_PARENT_CODE</code>. 등록자
     * ID
     */
    public String getItemParentCode() {
        return this.itemParentCode;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_DEPTH</code>. 뎁스
     */
    public Integer getItemDepth() {
        return this.itemDepth;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_SEQ</code>.
     */
    public Integer getItemSeq() {
        return this.itemSeq;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.ITEM_ACTIVE</code>. 사용여부
     */
    public String getItemActive() {
        return this.itemActive;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.REG_ID</code>. 등록자 ID
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.REG_DATE</code>. 등록 일자
     */
    public LocalDateTime getRegDate() {
        return this.regDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.EDIT_DATE</code>. 변경일자
     */
    public LocalDateTime getEditDate() {
        return this.editDate;
    }

    /**
     * Getter for <code>dmc_report.T_DR_ITEM_CODE.EDIT_ID</code>. 변경자 ID
     */
    public String getEditId() {
        return this.editId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("JTDrItemCode (");

        sb.append(itemCode);
        sb.append(", ").append(itemGroupCode);
        sb.append(", ").append(itemName);
        sb.append(", ").append(itemType);
        sb.append(", ").append(itemParentCode);
        sb.append(", ").append(itemDepth);
        sb.append(", ").append(itemSeq);
        sb.append(", ").append(itemActive);
        sb.append(", ").append(regId);
        sb.append(", ").append(regDate);
        sb.append(", ").append(editDate);
        sb.append(", ").append(editId);

        sb.append(")");
        return sb.toString();
    }
}
