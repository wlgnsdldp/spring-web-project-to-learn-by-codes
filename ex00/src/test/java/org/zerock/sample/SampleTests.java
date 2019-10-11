package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/* spring-test 모듈을 통해 간단하게 스프링을 가동.
* 반드시 Junit 4.10 이상 버전 사용 */

@RunWith(SpringJUnit4ClassRunner.class) //@RunWith는 테스트시 필요한 클래스를 지정
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //@ContextConfiguration은 지정된 클래스나 문자열을 이용해서 필요한 객체들을 Bean으로 등록
@Log4j
public class SampleTests {

    @Setter(onMethod_ = @Autowired)
    private Restaurant restaurant;

    @Test
    public void testExist(){

        assertNotNull(restaurant); //restaurant가 null이 아니면 테스트 성공

        log.info(restaurant);
        log.info("--------------------------------");
        log.info(restaurant.getChef());

    }
}
