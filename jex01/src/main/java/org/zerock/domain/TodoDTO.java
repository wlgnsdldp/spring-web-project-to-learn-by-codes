package org.zerock.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class TodoDTO {

    private String title;

    //parameter로 사용 되는 인스턴스 변수에는 @InitBinder를 사용하지 않고 @DateTimeFormat을 통해 String to date를 할 수 있다.
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dueDate;
}
