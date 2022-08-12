package students.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
    public class User {

        private String name;
        private String surname;
        private String email;
        private String password;
        private UserType userType;

}
