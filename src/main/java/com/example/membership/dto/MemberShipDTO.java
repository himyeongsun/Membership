package com.example.membership.dto;

import com.example.membership.constant.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberShipDTO {

    private Long num;   // 회원 읽기 등을 볼 때 pk값을 가지고 있어야함
                        // 등록시에는 필요없으니까 not null 작성X

    @NotBlank(message = "이름은 반드시 입력해주세요.")
    @Size(min = 2, max = 10, message = "이름은 2-10글자 이내로 작성하세요")
    private String name; // 이름 : not blank , 최소 : 2 최대 : 10

    @NotBlank (message = "빈문자, 공백 불가")
    @Size(max = 50, message = "최대 50글자 이내로 작성하셔야 합니다.")
    @Email(message = "이메일 형식에 맞춰 작성하세요")
    private String email;  // 이메일 : 최대 : 50 , 글자 : 메시지 : 최대 50글자 이내로 작성하셔야 합니다.

    @NotBlank(message = "비밀번호는 반드시 입력해주세요.")
    @Size(min = 10, max = 16, message = "최소 10-16이내로 비밀번호를 작성하세요")
    private String password; // 비밀번호 : not blank, 최소 : 10 최대 : 16 , 메시지 : 최소 10-16이내로 비밀번호를 작성하세요

    @NotBlank(message = "주소는 반드시 입력해주세요.")
    private String address; // 주소 : not blank

    // 권한
    private Role role;  // 이건 어차피 userdetailservice에서 직접 넣을 예정
                        // 필요에 따라 ADMIN 가입페이지와 일반 USER 가입 페이지가 분리될 수 있음

}
