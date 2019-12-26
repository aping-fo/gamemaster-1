package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.entity.base.BaseEntity;
import com.luckygames.wmxz.gamemaster.model.enums.MailType;
import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.util.Date;
import javax.persistence.Table;

@Table(name="mail_log")
public class MailLogEntity extends BaseEntity {
    private Long id;

    private Long serverId;

    private MailType mailType;

    private String title;

    private String content;

    private Integer vocation;

    private Integer minLev;

    private Integer maxLev;

    private String sender;

    private Status status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServerId() {
        return serverId;
    }

    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    public MailType getMailType() {
        return mailType;
    }

    public void setMailType(MailType mailType) {
        this.mailType = mailType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getVocation() {
        return vocation;
    }

    public void setVocation(Integer vocation) {
        this.vocation = vocation;
    }

    public Integer getMinLev() {
        return minLev;
    }

    public void setMinLev(Integer minLev) {
        this.minLev = minLev;
    }

    public Integer getMaxLev() {
        return maxLev;
    }

    public void setMaxLev(Integer maxLev) {
        this.maxLev = maxLev;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}