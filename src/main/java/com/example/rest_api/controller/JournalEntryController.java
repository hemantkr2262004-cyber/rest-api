package com.example.rest_api.controller;

import com.example.rest_api.controller.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

   // @GetMapping
  //  public List<JournalEntry> getAll(){
    //  return new ArrayList<>(journalEntries.values());
   // }

}
