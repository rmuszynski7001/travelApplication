package com.travelApplication.demo.integration.service;


import com.travelApplication.demo.entity.Continent;
import com.travelApplication.demo.service.ContinentService;
import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.multipart.MultipartFile;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

@SpringBootTest
public class TravelAppServiceTest {

    @Autowired
    ContinentService continentService;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @AfterEach
    public void afterEachTest(){
        jdbcTemplate.execute("set foreign_key_checks = 0;");
        jdbcTemplate.execute("truncate table xxxxx;");
    }

    public void testSaveContinent(){
        //Given
        ContinentDto continentDto = new ContinentDto();
        continentDto.setName("SampleContinent");


        MultipartFile multipartFile = mock(MultipartFile.class);

        //When
        continentService.saveContinent();

        //Then
        String sql = "select continent_id, name where name = 'SampleContinent';";
        RowMapper<Continent> rowMapper = (rs, rowNum) -> new Continent(rs.getLong("id"),
                rs.getString("continent_name"));
        jdbcTemplate.queryForObject(sql,rowMapper);

        Continent continent = jdbcTemplate.queryForObject(sql, rowMapper);

        assertEquals("SampleContinent",continent.getName());
    }
}
