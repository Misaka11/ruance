package com.test;

  
import org.apache.commons.lang3.*;


  
  
public class MyTest
{  
	//驱动模块，调用B，C，D
	//输入两个字符串，删除空格之后比较，相同则输出全部大写的字符串，不相同则输出不相同
    public String A(String s1,String s2)  
    {  
        System.out.println("目前调用函数A(驱动模块)");
        System.out.println("输入的字符串1为:"+s1);
        System.out.println("输入的字符串2为:"+s2);
        s1 = B(s1);
        s2 = B(s2);
        if(C(s1,s2))
        {
        	System.out.println(D(s1));
        	return D(s1);
        }
        else
        {
        	System.out.println("两个字符串删除空格后不相同");
        	return "两个字符串删除空格后不相同";
        }
        
    } 
    //模块B，和C，D同级
    //输入一个字符串，删除它的空格
    public String B(String s)
    {
    	System.out.println("目前调用函数B");
    	String re = StringUtils.deleteWhitespace(s);
    	System.out.println("得到字符串:"+re);
    	return re;
    }
    //模块C，和B，D同级
    //输入字符串s1,s2，比较是否相同
    public boolean C(String s1,String s2)
    {
    	System.out.println("目前调用函数C"); 
    	if(s1.length() != s2.length())
    	{
    		return false;
    	}
    	//注入错误，只比较前10个字符
    	int n = s1.length(); //实验三已修改正确
    	for(int i = 0;i<n;i++)
    	{
    		if(s1.charAt(i) != s2.charAt(i))
    			return false;
    	}
    	return true;
        
    }
    //桩模块D，和B，C同级
    //输入字符串，输出转大写后的字符串
    public String D(String s)
    {
        System.out.println("目前调用函数D(桩模块)");  
        String re = "蕾姆赛高！！！";
        return re;
    }
    
}