/*
 * This file is generated by jOOQ.
 */
package jooq.jooq_dsl;


import jooq.jooq_dsl.routines.JFnAdminManagerName;
import jooq.jooq_dsl.routines.JFnItemName;
import jooq.jooq_dsl.routines.JFnItemParentCode;
import jooq.jooq_dsl.routines.JFnOneItemName;
import jooq.jooq_dsl.routines.JFnReturnName;
import jooq.jooq_dsl.routines.JFnUserName;
import jooq.jooq_dsl.routines.JMask;

import org.jooq.Configuration;
import org.jooq.Field;


/**
 * Convenience access to all stored procedures and functions in dmc_report.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>dmc_report.FN_ADMIN_MANAGER_NAME</code>
     */
    public static String fnAdminManagerName(
          Configuration configuration
        , String input
    ) {
        JFnAdminManagerName f = new JFnAdminManagerName();
        f.setInput(input);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>dmc_report.FN_ADMIN_MANAGER_NAME</code> as a field.
     */
    public static Field<String> fnAdminManagerName(
          String input
    ) {
        JFnAdminManagerName f = new JFnAdminManagerName();
        f.setInput(input);

        return f.asField();
    }

    /**
     * Get <code>dmc_report.FN_ADMIN_MANAGER_NAME</code> as a field.
     */
    public static Field<String> fnAdminManagerName(
          Field<String> input
    ) {
        JFnAdminManagerName f = new JFnAdminManagerName();
        f.setInput(input);

        return f.asField();
    }

    /**
     * Call <code>dmc_report.FN_ITEM_NAME</code>
     */
    public static String fnItemName(
          Configuration configuration
        , String input1
        , String input2
    ) {
        JFnItemName f = new JFnItemName();
        f.setInput1(input1);
        f.setInput2(input2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>dmc_report.FN_ITEM_NAME</code> as a field.
     */
    public static Field<String> fnItemName(
          String input1
        , String input2
    ) {
        JFnItemName f = new JFnItemName();
        f.setInput1(input1);
        f.setInput2(input2);

        return f.asField();
    }

    /**
     * Get <code>dmc_report.FN_ITEM_NAME</code> as a field.
     */
    public static Field<String> fnItemName(
          Field<String> input1
        , Field<String> input2
    ) {
        JFnItemName f = new JFnItemName();
        f.setInput1(input1);
        f.setInput2(input2);

        return f.asField();
    }

    /**
     * Call <code>dmc_report.FN_ITEM_PARENT_CODE</code>
     */
    public static String fnItemParentCode(
          Configuration configuration
        , String input1
        , String input2
    ) {
        JFnItemParentCode f = new JFnItemParentCode();
        f.setInput1(input1);
        f.setInput2(input2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>dmc_report.FN_ITEM_PARENT_CODE</code> as a field.
     */
    public static Field<String> fnItemParentCode(
          String input1
        , String input2
    ) {
        JFnItemParentCode f = new JFnItemParentCode();
        f.setInput1(input1);
        f.setInput2(input2);

        return f.asField();
    }

    /**
     * Get <code>dmc_report.FN_ITEM_PARENT_CODE</code> as a field.
     */
    public static Field<String> fnItemParentCode(
          Field<String> input1
        , Field<String> input2
    ) {
        JFnItemParentCode f = new JFnItemParentCode();
        f.setInput1(input1);
        f.setInput2(input2);

        return f.asField();
    }

    /**
     * Call <code>dmc_report.FN_ONE_ITEM_NAME</code>
     */
    public static String fnOneItemName(
          Configuration configuration
        , String input
    ) {
        JFnOneItemName f = new JFnOneItemName();
        f.setInput(input);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>dmc_report.FN_ONE_ITEM_NAME</code> as a field.
     */
    public static Field<String> fnOneItemName(
          String input
    ) {
        JFnOneItemName f = new JFnOneItemName();
        f.setInput(input);

        return f.asField();
    }

    /**
     * Get <code>dmc_report.FN_ONE_ITEM_NAME</code> as a field.
     */
    public static Field<String> fnOneItemName(
          Field<String> input
    ) {
        JFnOneItemName f = new JFnOneItemName();
        f.setInput(input);

        return f.asField();
    }

    /**
     * Call <code>dmc_report.FN_RETURN_NAME</code>
     */
    public static String fnReturnName(
          Configuration configuration
        , String input1
        , String input2
    ) {
        JFnReturnName f = new JFnReturnName();
        f.setInput1(input1);
        f.setInput2(input2);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>dmc_report.FN_RETURN_NAME</code> as a field.
     */
    public static Field<String> fnReturnName(
          String input1
        , String input2
    ) {
        JFnReturnName f = new JFnReturnName();
        f.setInput1(input1);
        f.setInput2(input2);

        return f.asField();
    }

    /**
     * Get <code>dmc_report.FN_RETURN_NAME</code> as a field.
     */
    public static Field<String> fnReturnName(
          Field<String> input1
        , Field<String> input2
    ) {
        JFnReturnName f = new JFnReturnName();
        f.setInput1(input1);
        f.setInput2(input2);

        return f.asField();
    }

    /**
     * Call <code>dmc_report.FN_USER_NAME</code>
     */
    public static String fnUserName(
          Configuration configuration
        , String input
    ) {
        JFnUserName f = new JFnUserName();
        f.setInput(input);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>dmc_report.FN_USER_NAME</code> as a field.
     */
    public static Field<String> fnUserName(
          String input
    ) {
        JFnUserName f = new JFnUserName();
        f.setInput(input);

        return f.asField();
    }

    /**
     * Get <code>dmc_report.FN_USER_NAME</code> as a field.
     */
    public static Field<String> fnUserName(
          Field<String> input
    ) {
        JFnUserName f = new JFnUserName();
        f.setInput(input);

        return f.asField();
    }

    /**
     * Call <code>dmc_report.mask</code>
     */
    public static String mask(
          Configuration configuration
        , Long unformattedValue
        , String formatString
    ) {
        JMask f = new JMask();
        f.setUnformattedValue(unformattedValue);
        f.setFormatString(formatString);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>dmc_report.mask</code> as a field.
     */
    public static Field<String> mask(
          Long unformattedValue
        , String formatString
    ) {
        JMask f = new JMask();
        f.setUnformattedValue(unformattedValue);
        f.setFormatString(formatString);

        return f.asField();
    }

    /**
     * Get <code>dmc_report.mask</code> as a field.
     */
    public static Field<String> mask(
          Field<Long> unformattedValue
        , Field<String> formatString
    ) {
        JMask f = new JMask();
        f.setUnformattedValue(unformattedValue);
        f.setFormatString(formatString);

        return f.asField();
    }
}