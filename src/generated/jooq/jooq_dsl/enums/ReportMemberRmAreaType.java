/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 주소타입(0:기타, 1:집, 2:회사)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReportMemberRmAreaType implements EnumType {

    _0("0"),

    _1("1"),

    _2("2");

    private final String literal;

    private ReportMemberRmAreaType(String literal) {
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
        return "Report_Member_rm_area_type";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
