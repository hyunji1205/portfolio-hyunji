package com.hyunji.portfolio.domain.repository

import com.hyunji.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long>