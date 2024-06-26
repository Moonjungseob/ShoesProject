package com.busanit501.shoesproject.dto.kdkdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter @Setter
public class MemberDTO {

    private Long memberId;

    @NotBlank(message = "이름은 필수 입력 값입니다.")
    private String memberName;

    @NotEmpty(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식으로 입력해주세요.")
    private String memberEmail;

    @NotEmpty(message = "비밀번호는 필수 입력 값입니다.")
    @Length(min=8, max=16, message = "비밀번호는 8자 이상, 16자 이하로 입력해주세요")
    private String memberPassword;

    @NotEmpty(message = "주소는 필수 입력 값입니다.")
    private String memberAddress;
}