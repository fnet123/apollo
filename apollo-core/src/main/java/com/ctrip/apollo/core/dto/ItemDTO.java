package com.ctrip.apollo.core.dto;

import java.util.Date;

public class ItemDTO{

  private long id;

  private long namespaceId;

  private String key;

  private String value;

  private String comment;

  private int lineNum;

  private String dataChangeCreatedBy;

  private Date dataChangeCreatedTime;

  private String dataChangeLastModifiedBy;

  private Date dataChangeLastModifiedTime;

  public ItemDTO() {

  }

  public ItemDTO(String key, String value, String comment, int lineNum) {
    this.key = key;
    this.value = value;
    this.comment = comment;
    this.lineNum = lineNum;
  }

  public String getComment() {
    return comment;
  }

  public long getId() {
    return id;
  }

  public String getKey() {
    return key;
  }

  public long getNamespaceId() {
    return namespaceId;
  }

  public String getValue() {
    return value;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public void setNamespaceId(long namespaceId) {
    this.namespaceId = namespaceId;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public int getLineNum() {
    return lineNum;
  }

  public void setLineNum(int lineNum) {
    this.lineNum = lineNum;
  }

  public String getDataChangeLastModifiedBy() {
    return dataChangeLastModifiedBy;
  }

  public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
    this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
  }

  public Date getDataChangeLastModifiedTime() {
    return dataChangeLastModifiedTime;
  }

  public void setDataChangeLastModifiedTime(Date dataChangeLastModifiedTime) {
    this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
  }

  public String getDataChangeCreatedBy() {
    return dataChangeCreatedBy;
  }

  public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
    this.dataChangeCreatedBy = dataChangeCreatedBy;
  }

  public Date getDataChangeCreatedTime() {
    return dataChangeCreatedTime;
  }

  public void setDataChangeCreatedTime(Date dataChangeCreatedTime) {
    this.dataChangeCreatedTime = dataChangeCreatedTime;
  }

  @Override
  public String toString() {
    return "ItemDTO{" +
           "id=" + id +
           ", namespaceId=" + namespaceId +
           ", key='" + key + '\'' +
           ", value='" + value + '\'' +
           ", comment='" + comment + '\'' +
           ", lineNum=" + lineNum +
           ", dataChangeCreatedBy='" + dataChangeCreatedBy + '\'' +
           ", dataChangeCreatedTime=" + dataChangeCreatedTime +
           ", dataChangeLastModifiedBy='" + dataChangeLastModifiedBy + '\'' +
           ", dataChangeLastModifiedTime=" + dataChangeLastModifiedTime +
           '}';
  }
}