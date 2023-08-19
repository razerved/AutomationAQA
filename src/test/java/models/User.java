package models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
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
}