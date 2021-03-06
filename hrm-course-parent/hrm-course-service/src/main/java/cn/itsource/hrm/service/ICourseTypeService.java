package cn.itsource.hrm.service;

import cn.itsource.hrm.domain.CourseType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 课程目录 服务类
 * </p>
 *
 * @author crow
 * @since 2019-12-26
 */
public interface ICourseTypeService extends IService<CourseType> {

    List<CourseType> loadTreeData();
}
