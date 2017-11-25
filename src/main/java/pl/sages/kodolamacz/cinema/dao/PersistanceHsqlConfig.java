package pl.sages.kodolamacz.cinema.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by acacko on 25.11.17
 */
@Configuration
@EnableJpaRepositories
public class PersistanceHsqlConfig {

    @Bean
    public DataSource getHSQLDataSource() {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        return builder
                .setType(EmbeddedDatabaseType.HSQL)
                .addScript("db/schema.sql")
                .addScript("db/insertData.sql")
                .build();
    }
}