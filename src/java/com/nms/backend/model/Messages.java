/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.backend.model;

/**
 *
 * @author Elijah
 */
public class Messages {
    private int MessageNo;
    private String  MessageTitle;
    private String MessageName;
    private String MsgText;
    private String MsgTime;
    private int msgtyp;
    private String Healthfacname;

    /**
     * @return the MessageNo
     */
    public int getMessageNo() {
        return MessageNo;
    }

    /**
     * @param MessageNo the MessageNo to set
     */
    public void setMessageNo(int MessageNo) {
        this.MessageNo = MessageNo;
    }

    /**
     * @return the MessageTitle
     */
    public String getMessageTitle() {
        return MessageTitle;
    }

    /**
     * @param MessageTitle the MessageTitle to set
     */
    public void setMessageTitle(String MessageTitle) {
        this.MessageTitle = MessageTitle;
    }

    /**
     * @return the MessageName
     */
    public String getMessageName() {
        return MessageName;
    }

    /**
     * @param MessageName the MessageName to set
     */
    public void setMessageName(String MessageName) {
        this.MessageName = MessageName;
    }

    /**
     * @return the MsgText
     */
    public String getMsgText() {
        return MsgText;
    }

    /**
     * @param MsgText the MsgText to set
     */
    public void setMsgText(String MsgText) {
        this.MsgText = MsgText;
    }

    /**
     * @return the MsgTime
     */
    public String getMsgTime() {
        return MsgTime;
    }

    /**
     * @param MsgTime the MsgTime to set
     */
    public void setMsgTime(String MsgTime) {
        this.MsgTime = MsgTime;
    }

    /**
     * @return the msgtyp
     */
    public int getMsgtyp() {
        return msgtyp;
    }

    /**
     * @param msgtyp the msgtyp to set
     */
    public void setMsgtyp(int msgtyp) {
        this.msgtyp = msgtyp;
    }

    /**
     * @return the Healthfacname
     */
    public String getHealthfacname() {
        return Healthfacname;
    }

    /**
     * @param Healthfacname the Healthfacname to set
     */
    public void setHealthfacname(String Healthfacname) {
        this.Healthfacname = Healthfacname;
    }
    

    
}
