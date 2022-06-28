package com.example.moneybook.member.mapper;

import com.example.moneybook.member.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    void signUp(MemberDto memberDto) throws Exception;

}
