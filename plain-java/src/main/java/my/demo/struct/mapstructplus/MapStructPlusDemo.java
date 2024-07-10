package my.demo.struct.mapstructplus;

import io.github.linpeilie.Converter;
import my.demo.struct.User;
import my.demo.struct.UserDto;
import my.demo.struct.UserVo;

import java.time.Duration;
import java.time.Instant;

public class MapStructPlusDemo {
    public static void main(String[] args) {
        example();
    }

    public static void example() {
        Converter converter = new Converter();
        for (int i = 0; i < 12; i++) {
            User po = new User(i + 1, String.valueOf(i + 1));
            convert(converter, po);
        }
    }

    public static void convert(Converter converter, User po) {
        Instant start = Instant.now();
        UserVo vo = converter.convert(po, UserVo.class);
        UserDto dto = converter.convert(po, UserDto.class);

        Duration duration = Duration.between(start, Instant.now());
        System.out.println("MapStructPlusDemo 运行时间: " + duration.toMillis() + " 毫秒");
        System.out.println("po:  " + po);
        System.out.println("vo:  " + vo);
        System.out.println("dto: " + dto);
        System.out.println("===== ===== ===== ===== =====");
    }
}
