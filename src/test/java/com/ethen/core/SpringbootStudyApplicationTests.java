package com.ethen.core;

import com.ethen.core.mapper.RegionMapper;
import com.ethen.core.domain.Province;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//@MapperScan("com.ethen.mapper")

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootStudyApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	RedisTemplate redisTemplate;

	@Test
	public void testRedis() {

		Object obj = redisTemplate.opsForValue().get("ethen");
		System.err.println("obj->" + obj);
	}

	@Autowired
	private RegionMapper regionMapper;

	@Test
	public void testMapper() {
		List<Province> provinceList = regionMapper.listProvince();
		System.err.println("===>" + provinceList);
	}
}
