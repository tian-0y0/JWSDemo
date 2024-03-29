package com.tiany.jwsdemo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class News implements Serializable {
    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public static final Integer NOT_DELETED = 0;

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public static final Integer DELETED = 1;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private String title;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private String time;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private Integer number;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private String breif;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private String author;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private Integer is_delete;

    /**
     *
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private String content;

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column demo..news.id
     *
     * @return the value of demo..news.id
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.id
     *
     * @param id the value for demo..news.id
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column demo..news.title
     *
     * @return the value of demo..news.title
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withTitle(String title) {
        this.setTitle(title);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.title
     *
     * @param title the value for demo..news.title
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method returns the value of the database column demo..news.time
     *
     * @return the value of demo..news.time
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public String getTime() {
        return time;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withTime(String time) {
        this.setTime(time);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.time
     *
     * @param time the value for demo..news.time
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * This method returns the value of the database column demo..news.number
     *
     * @return the value of demo..news.number
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public Integer getNumber() {
        return number;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withNumber(Integer number) {
        this.setNumber(number);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.number
     *
     * @param number the value for demo..news.number
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method returns the value of the database column demo..news.breif
     *
     * @return the value of demo..news.breif
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public String getBreif() {
        return breif;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withBreif(String breif) {
        this.setBreif(breif);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.breif
     *
     * @param breif the value for demo..news.breif
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setBreif(String breif) {
        this.breif = breif;
    }

    /**
     * This method returns the value of the database column demo..news.author
     *
     * @return the value of demo..news.author
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public String getAuthor() {
        return author;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withAuthor(String author) {
        this.setAuthor(author);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.author
     *
     * @param author the value for demo..news.author
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * This method returns the value of the database column demo..news.is_delete
     *
     * @return the value of demo..news.is_delete
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public Integer getIs_delete() {
        return is_delete;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withIs_delete(Integer is_delete) {
        this.setIs_delete(is_delete);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.is_delete
     *
     * @param is_delete the value for demo..news.is_delete
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    /**
     * This method returns the value of the database column demo..news.content
     *
     * @return the value of demo..news.content
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public News withContent(String content) {
        this.setContent(content);
        return this;
    }

    /**
     * This method sets the value of the database column demo..news.content
     *
     * @param content the value for demo..news.content
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", time=").append(time);
        sb.append(", number=").append(number);
        sb.append(", breif=").append(breif);
        sb.append(", author=").append(author);
        sb.append(", is_delete=").append(is_delete);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public void andLogicalDeleted(boolean deleted) {
        setIs_delete(deleted ? DELETED : NOT_DELETED);
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        News other = (News) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getBreif() == null ? other.getBreif() == null : this.getBreif().equals(other.getBreif()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getBreif() == null) ? 0 : getBreif().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    /**
     *
     * @mbg.generated Tue Jun 25 16:20:16 CST 2019
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        title("title", "title", "VARCHAR", false),
        time("time", "time", "VARCHAR", false),
        number("number", "number", "INTEGER", false),
        breif("breif", "breif", "VARCHAR", false),
        author("author", "author", "VARCHAR", false),
        is_delete("is_delete", "is_delete", "INTEGER", false),
        content("content", "content", "LONGVARCHAR", false);

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        private static final String BEGINNING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        private static final String ENDING_DELIMITER = "\"";

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        private final String column;

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        private final boolean isColumnNameDelimited;

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        private final String javaProperty;

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        private final String jdbcType;

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public String value() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public String getValue() {
            return this.column;
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         *
         * @mbg.generated Tue Jun 25 16:20:16 CST 2019
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}