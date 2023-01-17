/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 연락처타입(0:기타, 1:휴대폰, 2:유선전화)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReportMemberRmPhoneType implements EnumType {

    _0("0"),

    _1("1"),

    _2("2");

    private final String literal;

    private ReportMemberRmPhoneType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "Report_Member_rm_phone_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
