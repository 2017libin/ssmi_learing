/**
 * @Title: SqlClauseBuilderTest.java
 * @Package cn.osxm.ssmi.chp12
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年3月1日 下午9:35:20
 * @version V1.0
 */

package cn.osxm.ssmi.chp12;
import static org.junit.Assert.assertTrue;

import org.apache.ibatis.jdbc.SQL;
import org.junit.Test;
/**
  * @ClassName: SqlClauseBuilderTest
  * @Description: TODO
  * @author osxm:oscarxueming
  */

public class SqlClauseBuilderTest {
	  @Test
	    public void selectUserSql() {
	        String id = "";
	        String name="";
	        
	        String sql = new SQL() {{
	          SELECT("U.ID, U.NAME, U.AGE");
	          FROM("USER U");
	          if (id != null) {
	            WHERE("U.ID like #{id}");
	          }
	          if (name != null) {
	            WHERE("U.NAME like #{name}");
	          }
	          ORDER_BY("P.NAME");
	        }}.toString();
	        System.out.println(sql);
	      }

	    
	    @Test
	    public void deleteUserSql() {
	        String sql = new SQL() {
	            {
	                DELETE_FROM("USER");
	                WHERE("ID = #{id}");
	            }
	        }.toString();
	        System.out.println(sql);
	        assertTrue(sql.equals("DELETE FROM USER\n" + //有换行符
	                "WHERE (ID = #{id})"));
	    }
	    
	    @Test
	    public void insertUserSql() {
	        String sql = new SQL()
	          .INSERT_INTO("USER")
	          .VALUES("ID, NAME", "#{id}, #{name}")
	          .VALUES("AGE", "#{age}")
	          .toString();
	        System.out.println(sql);
	      }
	    
	    @Test
	    public void updateUserSql() {
	        String sql = new SQL() {{
	            UPDATE("USER");
	            SET("NAME = #{name}");
	            WHERE("ID = #{id}");
	          }}.toString();
	        System.out.println(sql);
	      }
}
