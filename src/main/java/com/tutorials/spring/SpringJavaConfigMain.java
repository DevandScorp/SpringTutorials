package com.tutorials.spring;

import com.tutorials.spring.config.ApplicationConfiguration;
import com.tutorials.spring.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigMain {
    public static void main(String[] args) {
        /**
         The @SuppressWarnings annotation type allows
         Java programmers to disable compilation warnings for a certain part of a program.
         There are 5 types of bean scopes supported in spring

         1.singleton – Scopes a single bean definition to a single object instance per Spring IoC container.
         2.prototype – Return a new bean instance each time when requested
         3.request – Return a single bean instance per HTTP request.
         4.session – Return a single bean instance per HTTP session.
         5.globalSession – Return a single bean instance per global HTTP session.
         @Required:
         The @Required annotation applies to bean property setter methods.
         @Autowired:
         The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.
         @Qualifier:
         The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.
         */
        @SuppressWarnings("resource")
        ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Country countryObj = (Country) appContext.getBean("countryObj");
        String countryName=countryObj.getCountryName();

        System.out.println("Country name: "+ countryName);
    }
}
