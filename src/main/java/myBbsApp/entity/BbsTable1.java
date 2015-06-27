package myBbsApp.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * BbsTable1エンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/06/06 13:10:30")
public class BbsTable1 implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    @Id
    public Integer id;

    /** nameプロパティ */
    @Column(length = 30, nullable = true, unique = false)
    public String name;

    /** commentプロパティ */
    @Column(length = 240, nullable = true, unique = false)
    public String comment;
}