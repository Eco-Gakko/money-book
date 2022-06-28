package com.example.moneybook.member.service;

import com.example.moneybook.member.dto.MemberDto;

public interface MemberService {

    void signUp(MemberDto memberDto) throws Exception;

}