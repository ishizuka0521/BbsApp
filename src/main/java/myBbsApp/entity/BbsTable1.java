package myBbsApp.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * BbsTable1エンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2015/07/05 21:14:56")
public class BbsTable1 implements Serializable {

    private static final long serialVersionUID = 1L;

    /** nameプロパティ */
    @Column(length = 30, nullable = true, unique = false)
    public String name;

    /** commentプロパティ */
    @Column(length = 240, nullable = true, unique = false)
    public String comment;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** uptimeプロパティ */
    @Column(nullable = false, unique = false)
    public Timestamp uptime;


    /** commentプロパティ */
    @Column(length = 200, nullable = true, unique = false)
	public String title;
}