package com.example.moneybook.member.dto;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
public class MemberDto implements UserDetails {

    private static final long serialVersionUID = 1L;

    public String id;
    public String password;
    public String name;
    public String email;
    public String role;

    /* UserDetails 기본 상속 변수 */
    private Collection<? extends GrantedAuthority> authorities;
    private boolean isEnabled = true;
    private String username;
    private boolean isCredentialsNonExpired = true;
    private boolean isAccountNonExpired = true;
    private boolean isAccountNonLocked = true;

}
