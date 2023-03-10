/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;

import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JTDrQnaPublicRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 상담 게시판
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrQnaPublic extends TableImpl<JTDrQnaPublicRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_QNA_PUBLIC</code>
     */
    public static final JTDrQnaPublic T_DR_QNA_PUBLIC = new JTDrQnaPublic();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrQnaPublicRecord> getRecordType() {
        return JTDrQnaPublicRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.ID</code>.
     */
    public final TableField<JTDrQnaPublicRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.USER_NAME</code>.
     */
    public final TableField<JTDrQnaPublicRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.USER_EMAIL</code>.
     */
    public final TableField<JTDrQnaPublicRecord, String> USER_EMAIL = createField(DSL.name("USER_EMAIL"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.USER_PHONE</code>.
     */
    public final TableField<JTDrQnaPublicRecord, String> USER_PHONE = createField(DSL.name("USER_PHONE"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.REG_DATE</code>.
     */
    public final TableField<JTDrQnaPublicRecord, LocalDateTime> REG_DATE = createField(DSL.name("REG_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.TYPE_NAME</code>.
     */
    public final TableField<JTDrQnaPublicRecord, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), SQLDataType.VARCHAR(16), this, "");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.CONTENTS</code>. 내용
     */
    public final TableField<JTDrQnaPublicRecord, String> CONTENTS = createField(DSL.name("CONTENTS"), SQLDataType.VARCHAR(3000), this, "내용");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.FILE_ORIGINALNAME</code>.
     * 파일원본이름
     */
    public final TableField<JTDrQnaPublicRecord, String> FILE_ORIGINALNAME = createField(DSL.name("FILE_ORIGINALNAME"), SQLDataType.VARCHAR(100), this, "파일원본이름");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.FILE_NAME</code>. 파일이름
     */
    public final TableField<JTDrQnaPublicRecord, String> FILE_NAME = createField(DSL.name("FILE_NAME"), SQLDataType.VARCHAR(100), this, "파일이름");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.FILE_PATH</code>. 파일경로
     */
    public final TableField<JTDrQnaPublicRecord, String> FILE_PATH = createField(DSL.name("FILE_PATH"), SQLDataType.VARCHAR(255), this, "파일경로");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.FILE_URL</code>. 파일주소
     */
    public final TableField<JTDrQnaPublicRecord, String> FILE_URL = createField(DSL.name("FILE_URL"), SQLDataType.VARCHAR(255), this, "파일주소");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.QASTATUS</code>. 1:응대대기,
     * 2:응대완료
     */
    public final TableField<JTDrQnaPublicRecord, String> QASTATUS = createField(DSL.name("QASTATUS"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("1", SQLDataType.VARCHAR)), this, "1:응대대기, 2:응대완료");

    /**
     * The column <code>dmc_report.T_DR_QNA_PUBLIC.REPLY_DATE</code>.
     */
    public final TableField<JTDrQnaPublicRecord, LocalDateTime> REPLY_DATE = createField(DSL.name("REPLY_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    private JTDrQnaPublic(Name alias, Table<JTDrQnaPublicRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrQnaPublic(Name alias, Table<JTDrQnaPublicRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("상담 게시판"), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_QNA_PUBLIC</code> table reference
     */
    public JTDrQnaPublic(String alias) {
        this(DSL.name(alias), T_DR_QNA_PUBLIC);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_QNA_PUBLIC</code> table reference
     */
    public JTDrQnaPublic(Name alias) {
        this(alias, T_DR_QNA_PUBLIC);
    }

    /**
     * Create a <code>dmc_report.T_DR_QNA_PUBLIC</code> table reference
     */
    public JTDrQnaPublic() {
        this(DSL.name("T_DR_QNA_PUBLIC"), null);
    }

    public <O extends Record> JTDrQnaPublic(Table<O> child, ForeignKey<O, JTDrQnaPublicRecord> key) {
        super(child, key, T_DR_QNA_PUBLIC);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public Identity<JTDrQnaPublicRecord, Integer> getIdentity() {
        return (Identity<JTDrQnaPublicRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<JTDrQnaPublicRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_QNA_PUBLIC_PRIMARY;
    }

    @Override
    public JTDrQnaPublic as(String alias) {
        return new JTDrQnaPublic(DSL.name(alias), this);
    }

    @Override
    public JTDrQnaPublic as(Name alias) {
        return new JTDrQnaPublic(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrQnaPublic rename(String name) {
        return new JTDrQnaPublic(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrQnaPublic rename(Name name) {
        return new JTDrQnaPublic(name, null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Integer, String, String, String, LocalDateTime, String, String, String, String, String, String, String, LocalDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }
}
