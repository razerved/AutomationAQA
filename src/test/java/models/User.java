package models;

import lombok.*;

/*@Getter
@Setter
@ToString
@EqualsAndHashCode*/
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
public class User {
    @EqualsAndHashCode.Exclude
    private int id;

    @NonNull
    private String username;

    @NonNull @With(AccessLevel.PROTECTED)
    private String password;

    //@ToString.Exclude
    private String email;

    //@ToString.Exclude
    private String code;

    /*public User() {

    }*/

}