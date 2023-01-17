/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;

import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JTDrNoticeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class JTDrNotice extends TableImpl<JTDrNoticeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_NOTICE</code>
     */
    public static final JTDrNotice T_DR_NOTICE = new JTDrNotice();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrNoticeRecord> getRecordType() {
        return JTDrNoticeRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_NOTICE.IDX</code>. 번호
     */
    public final TableField<JTDrNoticeRecord, Integer> IDX = createField(DSL.name("IDX"), SQLDataType.INTEGER.nullable(false).identity(true), this, "번호");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.NOTICE_CODE</code>. 공지사항 코드
     */
    public final TableField<JTDrNoticeRecord, String> NOTICE_CODE = createField(DSL.name("NOTICE_CODE"), SQLDataType.VARCHAR(45), this, "공지사항 코드");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.SUBJECT</code>. 제목
     */
    public final TableField<JTDrNoticeRecord, String> SUBJECT = createField(DSL.name("SUBJECT"), SQLDataType.VARCHAR(100), this, "제목");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.CONTENTS</code>. 내용
     */
    public final TableField<JTDrNoticeRecord, String> CONTENTS = createField(DSL.name("CONTENTS"), SQLDataType.VARCHAR(7000), this, "내용");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.VIEW_CNT</code>. 조회수
     */
    public final TableField<JTDrNoticeRecord, Integer> VIEW_CNT = createField(DSL.name("VIEW_CNT"), SQLDataType.INTEGER.defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "조회수");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.REGIST_ID</code>. 최초등록자
     */
    public final TableField<JTDrNoticeRecord, String> REGIST_ID = createField(DSL.name("REGIST_ID"), SQLDataType.VARCHAR(45), this, "최초등록자");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.REGIST_DATE</code>. 최초등록일
     */
    public final TableField<JTDrNoticeRecord, LocalDateTime> REGIST_DATE = createField(DSL.name("REGIST_DATE"), SQLDataType.LOCALDATETIME(0), this, "최초등록일");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.UPDATE_ID</code>. 수정자
     */
    public final TableField<JTDrNoticeRecord, String> UPDATE_ID = createField(DSL.name("UPDATE_ID"), SQLDataType.VARCHAR(45), this, "수정자");

    /**
     * The column <code>dmc_report.T_DR_NOTICE.UPDATE_DATE</code>. 수정일
     */
    public final TableField<JTDrNoticeRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("UPDATE_DATE"), SQLDataType.LOCALDATETIME(0), this, "수정일");

    private JTDrNotice(Name alias, Table<JTDrNoticeRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrNotice(Name alias, Table<JTDrNoticeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_NOTICE</code> table reference
     */
    public JTDrNotice(String alias) {
        this(DSL.name(alias), T_DR_NOTICE);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_NOTICE</code> table reference
     */
    public JTDrNotice(Name alias) {
        this(alias, T_DR_NOTICE);
    }

    /**
     * Create a <code>dmc_report.T_DR_NOTICE</code> table reference
     */
    public JTDrNotice() {
        this(DSL.name("T_DR_NOTICE"), null);
    }

    public <O extends Record> JTDrNotice(Table<O> child, ForeignKey<O, JTDrNoticeRecord> key) {
        super(child, key, T_DR_NOTICE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public Identity<JTDrNoticeRecord, Integer> getIdentity() {
        return (Identity<JTDrNoticeRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrNoticeRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_NOTICE_PRIMARY;
    }

    @Override
    public JTDrNotice as(String alias) {
        return new JTDrNotice(DSL.name(alias), this);
    }

    @Override
    public JTDrNotice as(Name alias) {
        return new JTDrNotice(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrNotice rename(String name) {
        return new JTDrNotice(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrNotice rename(Name name) {
        return new JTDrNotice(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, Integer, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
