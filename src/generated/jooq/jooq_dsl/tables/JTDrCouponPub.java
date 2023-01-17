/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.tables;


import java.time.LocalDateTime;

import jooq.jooq_dsl.JDmcReport;
import jooq.jooq_dsl.Keys;
import jooq.jooq_dsl.tables.records.JTDrCouponPubRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 쿠폰 발행정보 테이블
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JTDrCouponPub extends TableImpl<JTDrCouponPubRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>dmc_report.T_DR_COUPON_PUB</code>
     */
    public static final JTDrCouponPub T_DR_COUPON_PUB = new JTDrCouponPub();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JTDrCouponPubRecord> getRecordType() {
        return JTDrCouponPubRecord.class;
    }

    /**
     * The column <code>dmc_report.T_DR_COUPON_PUB.COUPON_PUB_ID</code>.
     */
    public final TableField<JTDrCouponPubRecord, String> COUPON_PUB_ID = createField(DSL.name("COUPON_PUB_ID"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>dmc_report.T_DR_COUPON_PUB.COUPON_CODE</code>.
     */
    public final TableField<JTDrCouponPubRecord, String> COUPON_CODE = createField(DSL.name("COUPON_CODE"), SQLDataType.VARCHAR(30).nullable(false), this, "");

    /**
     * The column <code>dmc_report.T_DR_COUPON_PUB.USER_ID</code>.
     */
    public final TableField<JTDrCouponPubRecord, String> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>dmc_report.T_DR_COUPON_PUB.PUB_DATE</code>.
     */
    public final TableField<JTDrCouponPubRecord, LocalDateTime> PUB_DATE = createField(DSL.name("PUB_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>dmc_report.T_DR_COUPON_PUB.PUB_USE_ORDER_CODE</code>.
     */
    public final TableField<JTDrCouponPubRecord, String> PUB_USE_ORDER_CODE = createField(DSL.name("PUB_USE_ORDER_CODE"), SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>dmc_report.T_DR_COUPON_PUB.PUB_USE_DATE</code>.
     */
    public final TableField<JTDrCouponPubRecord, LocalDateTime> PUB_USE_DATE = createField(DSL.name("PUB_USE_DATE"), SQLDataType.LOCALDATETIME(0), this, "");

    /**
     * The column <code>dmc_report.T_DR_COUPON_PUB.COUPON_PUB_STATUS</code>.
     * 0:지급가능 1:지급완료 2:사용가능 3:사용완료 4:만료
     */
    public final TableField<JTDrCouponPubRecord, Integer> COUPON_PUB_STATUS = createField(DSL.name("COUPON_PUB_STATUS"), SQLDataType.INTEGER, this, "0:지급가능 1:지급완료 2:사용가능 3:사용완료 4:만료");

    private JTDrCouponPub(Name alias, Table<JTDrCouponPubRecord> aliased) {
        this(alias, aliased, null);
    }

    private JTDrCouponPub(Name alias, Table<JTDrCouponPubRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("쿠폰 발행정보 테이블"), TableOptions.table());
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_COUPON_PUB</code> table reference
     */
    public JTDrCouponPub(String alias) {
        this(DSL.name(alias), T_DR_COUPON_PUB);
    }

    /**
     * Create an aliased <code>dmc_report.T_DR_COUPON_PUB</code> table reference
     */
    public JTDrCouponPub(Name alias) {
        this(alias, T_DR_COUPON_PUB);
    }

    /**
     * Create a <code>dmc_report.T_DR_COUPON_PUB</code> table reference
     */
    public JTDrCouponPub() {
        this(DSL.name("T_DR_COUPON_PUB"), null);
    }

    public <O extends Record> JTDrCouponPub(Table<O> child, ForeignKey<O, JTDrCouponPubRecord> key) {
        super(child, key, T_DR_COUPON_PUB);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JDmcReport.DMC_REPORT;
    }

    @Override
    public UniqueKey<JTDrCouponPubRecord> getPrimaryKey() {
        return Keys.KEY_T_DR_COUPON_PUB_PRIMARY;
    }

    @Override
    public JTDrCouponPub as(String alias) {
        return new JTDrCouponPub(DSL.name(alias), this);
    }

    @Override
    public JTDrCouponPub as(Name alias) {
        return new JTDrCouponPub(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrCouponPub rename(String name) {
        return new JTDrCouponPub(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JTDrCouponPub rename(Name name) {
        return new JTDrCouponPub(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, LocalDateTime, String, LocalDateTime, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}