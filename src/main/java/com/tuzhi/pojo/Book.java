package com.tuzhi.pojo;

import lombok.Data;

/**
 * @program: ssmbuild
 * @description:
 * @author: 兔子
 * @create: 2021-12-06 17:18
 **/

@Data
public class Book {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}
