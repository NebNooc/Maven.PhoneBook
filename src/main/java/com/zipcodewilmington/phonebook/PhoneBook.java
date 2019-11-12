package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, List<String>> map;
    List<String> pn = new ArrayList<>();

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {
        map = new LinkedHashMap<>();
    }

    public void add(String name, String phoneNumber) {
        pn.add(phoneNumber);
        map.put(name, pn);
    }

    public void addAll(String name, String... phoneNumbers) {
        pn.addAll(Arrays.asList(phoneNumbers));
        map.put(name, pn);
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return map.containsKey(name) || pn.contains(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String result= "";
        for (Map.Entry<String,List<String>> entry: map.entrySet()) {
            result = entry.getKey();
        }
        return result;
    }

    public List<String> getAllContactNames() {
        List<String> allContacts = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            allContacts.add(entry.getKey());
        }
        return allContacts;
    }

    public Map<String, List<String>> getMap() {
        return map;
    }
}
