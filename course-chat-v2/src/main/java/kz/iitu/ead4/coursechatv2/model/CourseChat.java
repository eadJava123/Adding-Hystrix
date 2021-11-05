package kz.iitu.ead4.coursechatv2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseChat {
    private Long id;
    private String name;
    private String courses;
}
