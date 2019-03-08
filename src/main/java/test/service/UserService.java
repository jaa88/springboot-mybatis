package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.mapper.UserMapper;
import test.pojo.User;
import test.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianan on 2018/9/29.
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    private static String tempStr="我到干呕公安化工和公安后宫很高很高哦啊哈嘎化工哈根拿来和公安化工阿红额啊啊广告狗怕个屁噶JPG哈哈哈更害怕而规划";
    private static String tempNumStr="0123456789";

    public int getAllCount(){
        return userMapper.getAllCount();
    }

    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }

    public String batchInsertUser(int count){
        List<User> list=new ArrayList<User>();
        //生产一个小于20的数字用于确定地址长度
        for(int i=0;i<count;i++){
            User user=new User();
            int addressLength= RandomUtil.getRandomIntWithLimit(20);
            String address="";
            for(int j=0;j<addressLength;j++){
                address+=String.valueOf(tempStr.charAt(RandomUtil.getRandomIntWithLimit(tempStr.length())));
            }
            int sex=(Math.random()<0.5?0:1);
            String phoneNum="1";
            for(int j=0;j<10;j++){
                phoneNum+=tempNumStr.charAt(RandomUtil.getRandomIntWithLimit(tempNumStr.length()));
            }
            String name="";
            for(int j=0;j<3;j++){
                name+=tempStr.charAt(RandomUtil.getRandomIntWithLimit(tempStr.length()));
            }
            user.setAddress(address);
            user.setComment("无");
            user.setName(name);
            System.out.println("name"+name);
            user.setSex(sex);
            user.setPhoneNum(phoneNum);
            list.add(user);
        }
         userMapper.batchInsertUser(list);
        return "success";


    }




}
