package com.yjk.demo1.dto;

import java.io.Serializable;

public class Book implements Serializable {
    /**
     * dsdsd
    edwe
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String id;

    /**
     * dsdsd
    书籍名称
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String name;

    /**
     * dsdsd
    书籍作者
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String author;

    /**
     * dsdsd
    数据状态 1有效 0无效
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String dateState;

    /**
     * dsdsd
    创建者
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String createdBy;

    /**
     * dsdsd
    创建时间
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String createdDate;

    /**
     * dsdsd
    更新者
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String updatedBy;

    /**
     * dsdsd
    更新时间
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private String updatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BOOK
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.ID
     *
     * @return the value of BOOK.ID
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.ID
     *
     * @param id the value for BOOK.ID
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.NAME
     *
     * @return the value of BOOK.NAME
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.NAME
     *
     * @param name the value for BOOK.NAME
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.AUTHOR
     *
     * @return the value of BOOK.AUTHOR
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.AUTHOR
     *
     * @param author the value for BOOK.AUTHOR
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.DATE_STATE
     *
     * @return the value of BOOK.DATE_STATE
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getDateState() {
        return dateState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.DATE_STATE
     *
     * @param dateState the value for BOOK.DATE_STATE
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setDateState(String dateState) {
        this.dateState = dateState == null ? null : dateState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.CREATED_BY
     *
     * @return the value of BOOK.CREATED_BY
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.CREATED_BY
     *
     * @param createdBy the value for BOOK.CREATED_BY
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.CREATED_DATE
     *
     * @return the value of BOOK.CREATED_DATE
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.CREATED_DATE
     *
     * @param createdDate the value for BOOK.CREATED_DATE
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate == null ? null : createdDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.UPDATED_BY
     *
     * @return the value of BOOK.UPDATED_BY
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.UPDATED_BY
     *
     * @param updatedBy the value for BOOK.UPDATED_BY
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column BOOK.UPDATED_DATE
     *
     * @return the value of BOOK.UPDATED_DATE
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column BOOK.UPDATED_DATE
     *
     * @param updatedDate the value for BOOK.UPDATED_DATE
     *
     * @mbggenerated Tue Dec 10 22:39:52 CST 2019
     */
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate == null ? null : updatedDate.trim();
    }
}