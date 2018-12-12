package com.chapter3.version4.spel;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("listCustomerBean")
public class ListCustomer {
	
	@Value("#{listTestBean.map['MapA']}")
    private String mapA;
 
    @Value("#{listTestBean.list[0]}")
    private String list;
    
    //.?[]对集合进行过滤，得到集合的一个子集
    //.^[]在集合中查询第一个匹配项
    //.$[]在集合中查询最后一个匹配项
    //.![]投影运算符假设我们不需要歌曲的集合，只需要歌曲名称的集合
    //jukeBox.songs.![title]
    @Value("#{listTestBean.list.?[#this eq 'List1']}")
    private List<String> lists;
 
    public String getMapA() {
        return mapA;
    }
 
    public void setMapA(String mapA) {
        this.mapA = mapA;
    }
 
    public String getList() {
        return list;
    }
 
    public void setList(String list) {
        this.list = list;
    }
 
    @Override
    public String toString() {
    	for (int i = 0; i < lists.size(); i++) {
			System.out.println(lists.get(i));
		}
        return "Customer [mapA=" + mapA + ", list=" + list + "]";
    }

}
