package online.uzdevs.springmybatis.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String fullname;
    private String email;
    private String hobbies;
    private String country;
    private String address;
}
