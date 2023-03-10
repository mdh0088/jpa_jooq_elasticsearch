/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * 주거타입2(0:미선택 1:아파트 2:다세대주택 3:다가구주택 4:오피스텔 5:단독주택 6:기타)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ReportMemberRmHouse implements EnumType {

    _0("0"),

    _1("1"),

    _2("2"),

    _3("3"),

    _4("4"),

    _5("5"),

    _6("6");

    private final String literal;

    private ReportMemberRmHouse(String literal) {
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
        return "Report_Member_rm_house";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
