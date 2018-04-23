package com.zr.spring.ioc.beans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
	private String name = "CollectionName";
	private List<String> list;
	private Set<String> set;
	private Map<String, Integer> map;
	private String[] array;
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CollectionBean [name=" + name + ", list=" + list + ", set=" + set + ", map=" + map + ", array="
				+ Arrays.toString(array) + "]";
	}
	
	
}
