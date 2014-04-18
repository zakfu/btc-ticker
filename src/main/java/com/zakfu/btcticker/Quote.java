package com.zakfu.btcticker;

import java.util.Date;

public class Quote {
    private String last;
    private String high;
    private String timestamp;
    private String bid;
    private String vwap;
    private String volume;
    private String low;
    private String ask;

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("Last Price:               $").append(this.getLast()).append('\n');
        sb.append("Highest Bid Order:        $").append(this.getBid()).append('\n');
        sb.append("Lowest Sell Order:        $").append(this.getAsk()).append('\n');
        sb.append("Highest Price (24 hours): $").append(this.getHigh()).append('\n');
        sb.append("Lowest Price (24 hours):  $").append(this.getLow()).append('\n');
        sb.append("VWAP (24 hours):          $").append(this.getVwap()).append('\n');
        sb.append("Volume (24 hours):        ").append(this.getVolume()).append('\n');
        sb.append("Timestamp:                ").append(this.getTimestamp()).append('\n');
        return sb.toString();
    }

    public String getLast() {
        return last;
    }

    public String getHigh() {
        return high;
    }

    public String getTimestamp() {
        Date d = new Date(Long.parseLong(this.timestamp) * 1000);
        return d.toString();
    }

    public String getBid() {
        return bid;
    }

    public String getVwap() {
        return vwap;
    }

    public String getVolume() {
        return volume;
    }

    public String getLow() {
        return low;
    }

    public String getAsk() {
        return ask;
    }
}
