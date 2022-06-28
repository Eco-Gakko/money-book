package com.example.moneybook.member.controller;

import com.example.moneybook.member.dto.MemberDto;
import com.example.moneybook.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class MemberController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/user/signup")
    @ResponseBody
    public Map<String, Object> signUp(@RequestBody MemberDto memberDto) throws Exception {
        Map<String, Object> result = new HashMap<>();
        String encodedPassword = passwordEncoder.encode(memberDto.getPassword());
        memberDto.setPassword(encodedPassword);
        try {
            memberService.signUp(memberDto);
            result.put("result", "success");
        } catch (Exception e) {
            e.printStackTrace();
            result.put("result", "fail");
            result.put("message", e.getMessage());
        }
        return result;
    }
}
