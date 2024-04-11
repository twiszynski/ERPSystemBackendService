package pl.twisz.BackendJFX.dto;

import lombok.Data;
import pl.twisz.BackendJFX.entity.Operator;

@Data
public class OperatorAuthenticationResultDto {
    private Long idOperator;
    private String firstName;
    private String lastName;
    private boolean authenticated;

    public static OperatorAuthenticationResultDto createUnauthenticated() {
        OperatorAuthenticationResultDto operatorDto = new OperatorAuthenticationResultDto();
        operatorDto.setAuthenticated(false);
        return operatorDto;
    }

    public static OperatorAuthenticationResultDto of(Operator operator) {
        OperatorAuthenticationResultDto operatorDto = new OperatorAuthenticationResultDto();
        operatorDto.setAuthenticated(true);
        operatorDto.setFirstName(operator.getEmployee().getFirstName());
        operatorDto.setLastName(operator.getEmployee().getLastName());
        operatorDto.setIdOperator(operator.getIdOperator());
        return operatorDto;
    }

}
