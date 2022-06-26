import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
class Customer {
        @Id
        private Long id;
        private String firstName;
        private String lastName;
        private String password;

        public Customer(String firstName, String lastName, String password) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.password = password;
        }
}
