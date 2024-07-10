package my.demo.struct;

import io.github.linpeilie.Converter;
import my.demo.struct.mapstructplus.MapStructPlusDemo;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUp implements InitializingBean {
    private Converter converter;

    @Autowired
    public void setConverter(final Converter converter) {
        this.converter = converter;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        MapStructPlusDemo.example(converter);
    }
}
