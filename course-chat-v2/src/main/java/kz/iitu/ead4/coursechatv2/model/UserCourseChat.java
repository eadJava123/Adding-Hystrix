package kz.iitu.ead4.coursechatv2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCourseChat {
    private Long userId;
    private List<CourseChat> courses;
}
