package com.example.teamprojeect.domain.vo.show;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ShowVO {
    private Long showNumber;
    private Long artistNumber;
    private String showName;
    private String showContent;
    private String showDay;
    private String showTime;
    private String showAddress;
    private String showLocation;
    private String showRegion;
    private Long showType;
    private String showCategory;
    private String artistName;
    private String dDay;
}
