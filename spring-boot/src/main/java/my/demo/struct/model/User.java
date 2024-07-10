package my.demo.struct.model;

import io.github.linpeilie.annotations.AutoMapper;
import io.github.linpeilie.annotations.AutoMappers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@AutoMapper(target = UserDto.class)
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@AutoMappers({
    @AutoMapper(target = UserDto.class),
    @AutoMapper(target = UserVo.class)
})
public class User {
    private int id;
    private String name;
}
