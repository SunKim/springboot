package com.example.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.springboot.domain.BoardVO;
import com.example.springboot.mapper.BoardMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class SpringbootApplicationTests {
	
//	@Autowired
//    private DataSource ds; //작성
	
	@Autowired
    private BoardMapper mapper;
	
//	@Autowired
//    private SqlSessionFactory sqlSession; //작성

//	@Test
//	public void contextLoads() {
//	}

//	@Test
//    public void testConnection() throws Exception{
//        System.out.println("ds : "+ds);
//        Connection con = ds.getConnection(); //ds(DataSource)에서 Connection을 얻어내고
//        System.out.println("con : "+con); //확인 후
//        con.close(); //close
//    }
	
//	@Test
//    public void testSqlSession() throws Exception{//작성
//        System.out.println("sqlSession : "+sqlSession);
//    }

	@Test
    public void testMapper() throws Exception{
		
        BoardVO vo = new BoardVO();
        vo.setSubject("제목입니다.");
        vo.setContent("내용입니다.");
        vo.setWriter("작성자입니다.");
        
        mapper.boardInsert(vo);
    }
}
