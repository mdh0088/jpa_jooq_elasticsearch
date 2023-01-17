/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.util.Arrays;
import java.util.List;

import jooq.jooq_dsl.Indexes;
import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JTDrOrdererRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrOrderer extends TableImpl<JTDrOrdererRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_ORDERER</code>
     */
    public static final JTDrOrderer T_DR_ORDERER = new JTDrOrderer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrOrdererRecord> getRecordType() {
        return JTDrOrdererRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_ORDERER.IDX</code>.
     */
    public final TableField<JTDrOrdererRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.ORDER_CODE</code>. 주문코드
     */
    public final TableField<JTDrOrdererRecord, String> ORDER_CODE = createField(DSL.name("ORDER_CODE"), SQLDataType.VARCHAR(45), this, "주문코드");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.NAME</code>. 주문자명
     */
    public final TableField<JTDrOrdererRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(45), this, "주문자명");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.COMPANY</code>. 회사명
     */
    public final TableField<JTDrOrdererRecord, String> COMPANY = createField(DSL.name("COMPANY"), SQLDataType.VARCHAR(200), this, "회사명");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.DEPARTMENT</code>. 소속부서
     */
    public final TableField<JTDrOrdererRecord, String> DEPARTMENT = createField(DSL.name("DEPARTMENT"), SQLDataType.VARCHAR(200), this, "소속부서");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.LEVEL</code>. 직급
     */
    public final TableField<JTDrOrdererRecord, String> LEVEL = createField(DSL.name("LEVEL"), SQLDataType.VARCHAR(45), this, "직급");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.EMAIL</code>. 이메일
     */
    public final TableField<JTDrOrdererRecord, String> EMAIL = createField(DSL.name("EMAIL"), SQLDataType.VARCHAR(200), this, "이메일");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.COMPANY_CATEGORY</code>. 기업분류
     */
    public final TableField<JTDrOrdererRecord, String> COMPANY_CATEGORY = createField(DSL.name("COMPANY_CATEGORY"), SQLDataType.VARCHAR(200), this, "기업분류");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.PHONE</code>. 전화번호
     */
    public final TableField<JTDrOrdererRecord, String> PHONE = createField(DSL.name("PHONE"), SQLDataType.VARCHAR(20), this, "전화번호");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.MOBILE</code>. 휴대전화번호
     */
    public final TableField<JTDrOrdererRecord, String> MOBILE = createField(DSL.name("MOBILE"), SQLDataType.VARCHAR(20), this, "휴대전화번호");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECOGNIZE_CODE</code>. 구매인지경로 코드
     */
    public final TableField<JTDrOrdererRecord, String> RECOGNIZE_CODE = createField(DSL.name("RECOGNIZE_CODE"), SQLDataType.VARCHAR(32), this, "구매인지경로 코드");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECEIPT_NAME</code>. 배송자명
     */
    public final TableField<JTDrOrdererRecord, String> RECEIPT_NAME = createField(DSL.name("RECEIPT_NAME"), SQLDataType.VARCHAR(32), this, "배송자명");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR_NAME</code>. 배송지명
     */
    public final TableField<JTDrOrdererRecord, String> RECEIPT_ADDR_NAME = createField(DSL.name("RECEIPT_ADDR_NAME"), SQLDataType.VARCHAR(45), this, "배송지명");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR_NUM</code>. 우편번호
     */
    public final TableField<JTDrOrdererRecord, Integer> RECEIPT_ADDR_NUM = createField(DSL.name("RECEIPT_ADDR_NUM"), SQLDataType.INTEGER, this, "우편번호");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR1</code>. 배송지 주소
     */
    public final TableField<JTDrOrdererRecord, String> RECEIPT_ADDR1 = createField(DSL.name("RECEIPT_ADDR1"), SQLDataType.VARCHAR(200), this, "배송지 주소");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECEIPT_ADDR2</code>. 배송지 상세주소
     */
    public final TableField<JTDrOrdererRecord, String> RECEIPT_ADDR2 = createField(DSL.name("RECEIPT_ADDR2"), SQLDataType.VARCHAR(200), this, "배송지 상세주소");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECEIPT_PHONE_NUM</code>. 전화번호
     */
    public final TableField<JTDrOrdererRecord, String> RECEIPT_PHONE_NUM = createField(DSL.name("RECEIPT_PHONE_NUM"), SQLDataType.VARCHAR(20), this, "전화번호");

    /**
     * The column <code>dmc_report.T_DR_ORDERER.RECEIPT_MEMO</code>. 배송 메모
     */
    public final TableField<JTDrOrdererRecord, String> RECEIPT_MEMO = createField(DSL.name("RECEIPT_MEMO"), SQLDataType.VARCHAR(200), this, "배송 메모");

    private JTDrOrderer(Name alias, Table<JTDrOrdererRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrOrderer(Name alias, Table<JTDrOrdererRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_ORDERER</code> table reference
     */
    public JTDrOrderer(String alias) {
        this(DSL.name(alias), T_DR_ORDERER);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_ORDERER</code> table reference
     */
    public JTDrOrderer(Name alias) {
        this(alias, T_DR_ORDERER);
    }

    /**
     * Create a <code>dmc_report.T_DR_ORDERER</code> table reference
     */
    public JTDrOrderer() {
        this(DSL.name("T_DR_ORDERER"), null);
    }

    public <O extends Record> JTDrOrderer(Table<O> child, ForeignKey<O, JTDrOrdererRecord> key) {
        super(child, key, T_DR_ORDERER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.T_DR_ORDERER_ORDER_CODE);
    }

    @Override
    public Identity<JTDrOrdererRecord, Integer> getIdentity() {
        return (Identity<JTDrOrdererRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrOrdererRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_ORDERER_PRIMARY;
    }

    @Override
    public JTDrOrderer as(String alias) {
        return new JTDrOrderer(DSL.name(alias), this);
    }

    @Override
    public JTDrOrderer as(Name alias) {
        return new JTDrOrderer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrOrderer rename(String name) {
        return new JTDrOrderer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrOrderer rename(Name name) {
        return new JTDrOrderer(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, String, String, String, String, String, String, String, String, String, String, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}