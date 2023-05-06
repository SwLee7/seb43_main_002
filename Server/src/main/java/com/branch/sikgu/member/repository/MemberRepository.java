package com.branch.sikgu.member.repository;

import com.branch.sikgu.member.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
    boolean existsByEmail(String email);
}