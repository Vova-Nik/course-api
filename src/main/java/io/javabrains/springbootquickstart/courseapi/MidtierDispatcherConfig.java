package io.javabrains.springbootquickstart.courseapi;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//@ComponentScan("my.root.package")
//@EnableWebMvc
public class MidtierDispatcherConfig implements WebMvcConfigurer {

   // @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**/*")
                .addResourceLocations("/resourses//content/")
        ;
    }
}
//C:\Users\Vova\Desktop\java_prg\Gosha\src\main\resources