package com.tonpe.user.vo;

import com.tonpe.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResTemVo {
    private User user;
    private Department department;

}
