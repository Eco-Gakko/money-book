package com.example.moneybook.member.service.impl;

import com.example.moneybook.member.dto.MemberDto;
import com.example.moneybook.member.mapper.MemberMapper;
import com.example.moneybook.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public void signUp(MemberDto memberDto) throws Exception{
        memberMapper.signUp(memberDto);
    }

}
