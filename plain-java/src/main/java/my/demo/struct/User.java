package my.demo.struct;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AutoMapper(target = UserDto.class)
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
}
