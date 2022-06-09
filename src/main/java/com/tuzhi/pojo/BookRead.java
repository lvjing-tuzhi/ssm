package com.tuzhi.pojo;

import lombok.Data;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2022-06-09 15:16
 **/

@Data
public class BookRead {
    private Integer id;
    private Integer bookId;
    private Integer userId;
}
