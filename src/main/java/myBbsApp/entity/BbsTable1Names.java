package myBbsApp.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link BbsTable1}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2015/07/05 21:15:00")
public class BbsTable1Names {

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * commentのプロパティ名を返します。
     * 
     * @return commentのプロパティ名
     */
    public static PropertyName<String> comment() {
        return new PropertyName<String>("comment");
    }

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * uptimeのプロパティ名を返します。
     * 
     * @return uptimeのプロパティ名
     */
    public static PropertyName<Timestamp> uptime() {
        return new PropertyName<Timestamp>("uptime");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _BbsTable1Names extends PropertyName<BbsTable1> {

        /**
         * インスタンスを構築します。
         */
        public _BbsTable1Names() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _BbsTable1Names(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _BbsTable1Names(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * commentのプロパティ名を返します。
         *
         * @return commentのプロパティ名
         */
        public PropertyName<String> comment() {
            return new PropertyName<String>(this, "comment");
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * uptimeのプロパティ名を返します。
         *
         * @return uptimeのプロパティ名
         */
        public PropertyName<Timestamp> uptime() {
            return new PropertyName<Timestamp>(this, "uptime");
        }
    }
}