package cn.itcast.travel.dao;

import cn.itcast.travel.domain.RouteImg;

import java.util.List;

public interface RouteImgDao {
    /**
     * 根据线路route的id查询它的图片
     * @param rid
     * @return
     */
    public List<RouteImg> findByRid(int rid);
}
