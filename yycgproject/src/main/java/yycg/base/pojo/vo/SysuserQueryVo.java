package yycg.base.pojo.vo;

public class SysuserQueryVo {
	//分页属性
	private PageQuery pageQuery;
	
	//接收前台的字符串类
	private SysuserCustom sysuserCustom;

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public SysuserCustom getSysuserCustom() {
		return sysuserCustom;
	}

	public void setSysuserCustom(SysuserCustom sysuserCustom) {
		this.sysuserCustom = sysuserCustom;
	}
	

}
