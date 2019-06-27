package com.sky.webpay.model;

import java.math.BigDecimal;

public class QueryRequest {

    private String WIDout_trade_no;
    private String WIDTQtrade_no;
    private String WIDRQout_request_no;
    private String WIDsubject;
    private BigDecimal WIDtotal_amount;
    private String WIDbody;

    public String getWIDout_trade_no() {
        return WIDout_trade_no;
    }

    public void setWIDout_trade_no(String WIDout_trade_no) {
        this.WIDout_trade_no = WIDout_trade_no;
    }

    public String getWIDsubject() {
        return WIDsubject;
    }

    public void setWIDsubject(String WIDsubject) {
        this.WIDsubject = WIDsubject;
    }

    public BigDecimal getWIDtotal_amount() {
        return WIDtotal_amount;
    }

    public void setWIDtotal_amount(BigDecimal WIDtotal_amount) {
        this.WIDtotal_amount = WIDtotal_amount;
    }

    public String getWIDbody() {
        return WIDbody;
    }

    public void setWIDbody(String WIDbody) {
        this.WIDbody = WIDbody;
    }

    public String getWIDTQtrade_no() {
        return WIDTQtrade_no;
    }

    public void setWIDTQtrade_no(String WIDTQtrade_no) {
        this.WIDTQtrade_no = WIDTQtrade_no;
    }

    public String getWIDRQout_request_no() {
        return WIDRQout_request_no;
    }

    public void setWIDRQout_request_no(String WIDRQout_request_no) {
        this.WIDRQout_request_no = WIDRQout_request_no;
    }
}
