package by.coolbuy.init;

import java.util.Properties;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("by")
@EnableWebMvc
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class WebAppConfig extends WebMvcConfigurerAdapter{
	
	protected static Logger logger = Logger.getLogger(WebAppConfig.class);
        
    private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";
        
    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
    private static final String PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN = "entitymanager.packages.to.scan";
    
        @Resource
        private Environment env;
        
        @Bean
        public DataSource dataSource() {
                DriverManagerDataSource dataSource = new DriverManagerDataSource();
                
                dataSource.setDriverClassName(env.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
                dataSource.setUrl(env.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
                dataSource.setUsername(env.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
                dataSource.setPassword(env.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
                
                return dataSource;
        }
        
        @Bean
        public LocalSessionFactoryBean sessionFactory() {
                LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
                sessionFactoryBean.setDataSource(dataSource());
                sessionFactoryBean.setPackagesToScan(env.getRequiredProperty(PROPERTY_NAME_ENTITYMANAGER_PACKAGES_TO_SCAN));
                sessionFactoryBean.setHibernateProperties(hibProperties());
                return sessionFactoryBean;
        }
        
        private Properties hibProperties() {
                Properties properties = new Properties();
                properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
                properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, env.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
                return properties;        
        }
        
        @Bean
        public HibernateTransactionManager transactionManager() {
                HibernateTransactionManager transactionManager = new HibernateTransactionManager();
                transactionManager.setSessionFactory(sessionFactory().getObject());
                return transactionManager;
        }
        
        @Bean
        public  ViewResolver resolver() {
            UrlBasedViewResolver url = new UrlBasedViewResolver();
            url.setPrefix("/WEB-INF/pages");
            url.setViewClass(JstlView.class);
            url.setSuffix(".jsp");
            return url;
        }
        
        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        }
        @Override
        public void configureDefaultServletHandling(
                        DefaultServletHandlerConfigurer configurer) {
                logger.debug("configureDefaultServletHandling");
                // if the spring dispatcher is mapped to / then forward non handled
                // requests
                // (e.g. static resource) to the container's "default servlet"
                configurer.enable();
        }

        @Override
        public void addInterceptors(final InterceptorRegistry registry) {
                registry.addInterceptor(new LocaleChangeInterceptor());
        }

        @Bean
        public SimpleMappingExceptionResolver simpleMappingExceptionResolver() {
                SimpleMappingExceptionResolver b = new SimpleMappingExceptionResolver();

                Properties mappings = new Properties();
                mappings.put("org.springframework.web.servlet.PageNotFound", "p404");
                mappings.put("org.springframework.dao.DataAccessException",
                                "dataAccessFailure");
                mappings.put("org.springframework.transaction.TransactionException",
                                "dataAccessFailure");
                b.setExceptionMappings(mappings);
                return b;
        }

}
