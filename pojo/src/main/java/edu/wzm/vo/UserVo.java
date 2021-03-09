package edu.wzm.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: wangzhiming
 * @Date: 2020/10/30
 * @version:
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo {
    private String name;
    private int gender;
    private float score;
}
