package com.odelliv.music_center.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

import com.odelliv.music_center.model.RecordLabel;
import com.odelliv.music_center.repository.RecordLabelRepository;

@RestController
public class RecordLabelController {

  @Autowired
  private RecordLabelRepository recordLabelRepository;

  @PostMapping("/record_label")
  RecordLabel newRecordLabel(@RequestBody RecordLabel newRecordLabel){
    return recordLabelRepository.save(newRecordLabel);
  }

  @GetMapping("/record_labels")
  List<RecordLabel> getAllRecordLabels(){
    return recordLabelRepository.findAll();
  }

  @GetMapping("/record_labels/{id}")
  ResponseEntity<RecordLabel> recordLabel(@PathVariable Long id){
    Optional<RecordLabel> recordLabelOptional = recordLabelRepository.findById(id);
    return recordLabelOptional
      .map(recordLabel -> ResponseEntity.ok(recordLabel))  // 200 OK if found
      .orElseGet(() -> ResponseEntity.notFound().build());
  }
  
}
