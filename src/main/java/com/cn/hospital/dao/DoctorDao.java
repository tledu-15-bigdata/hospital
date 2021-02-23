package com.cn.hospital.dao;

import com.cn.hospital.pojo.Doctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorDao {

    public List<Doctor> findAllDoctor();

    public List<Doctor> findDoctorByKeshi(String keshi);

    public List<Doctor> fuzzySearch(String shanchang);

    public int addLiulancishu(int id);

    public Doctor findById(int id);

    public int updateScore(@Param("id") int id, @Param("avg") double avg1);
}
