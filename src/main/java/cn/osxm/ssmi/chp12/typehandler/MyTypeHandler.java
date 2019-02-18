/**
 * @Title: MyTypeHandler.java
 * @Package cn.osxm.ssmi.chp12.typehandler
 * @Description: TODO
 * @author osxm:oscarxueming
 * @date 2019年2月15日 下午10:21:09
 * @version V1.0
 */

package cn.osxm.ssmi.chp12.typehandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
/**
  * @ClassName: MyTypeHandler
  * @Description: TODO
  * @author osxm:oscarxueming
  */

//@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedJdbcTypes(value = {JdbcType.VARCHAR}, includeNullJdbcType = false)
public class MyTypeHandler extends BaseTypeHandler<String> {

  @Override
  public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
      ps.setString(i, parameter);   
  }

  @Override
  public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
      return rs.getString(columnName);
  }

  @Override
  public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
      return rs.getString(columnIndex);
  }

  @Override
  public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
      return cs.getString(columnIndex);
  }

}