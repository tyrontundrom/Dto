import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class CreateCustomerDto {
    private String firstName;
    private String lastName;
    private String password;
}
