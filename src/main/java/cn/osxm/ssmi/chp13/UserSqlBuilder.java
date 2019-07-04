/**
 * @Title: UserSqlBuilder.java
 * @Package cn.osxm.ssmi.chp13
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年7月4日 下午11:17:55
 * @version V1.0
 */

package cn.osxm.ssmi.chp13;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

/**
  * @ClassName: UserSqlBuilder
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class UserSqlBuilder {
	public String selectUserSql(Map<String, Object> para) {
        String sql = new SQL() {
            {
                SELECT("NAME");
                FROM("USER");
                WHERE("ID = "+para.get("id"));
                ORDER_BY("NAME");
            }
        }.toString();
        return sql;
    }
}
