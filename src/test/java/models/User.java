package models;

import lombok.*;


/*@Getter
@Setter
@ToString
@EqualsAndHashCode*/
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    @EqualsAndHashCode.Exclude
    private int id;

    @NonNull
    private String username;

    @NonNull @With(AccessLevel.PROTECTED)
    private String password;

    private String email;

    @ToString.Exclude
    private String code;




}
