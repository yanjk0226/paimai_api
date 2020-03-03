package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.dao.PaimaiuserDAO;

@SpringBootTest
class MypaimaiApplicationTests {
   
	@Autowired
	private PaimaiuserDAO userdao;
	@Test
	void contextLoads() {
		System.out.println(userdao.selectById(1));
	}

}
