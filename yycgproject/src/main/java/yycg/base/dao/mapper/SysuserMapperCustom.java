package yycg.base.dao.mapper;


import java.util.List;
import yycg.base.pojo.vo.SysuserCustom;
import yycg.base.pojo.vo.SysuserQueryVo;

public interface SysuserMapperCustom {
	
	List<SysuserCustom> findSysuserList(SysuserQueryVo sysuserQueryVo);
	
	int findSysuserCount(SysuserQueryVo sysuserQueryVo);
   
}

