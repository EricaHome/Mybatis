package org.apache.ibatis.demo.anno;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.demo.Blog;

/**
 * @author Erica
 * @date 2020/12/13 22:56
 * @description TODO
 */
public interface BlogMapper {

  @Select("select * from Blog where id = #{id}")
  public Blog selectOne(int id);

}
