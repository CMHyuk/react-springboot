package com.example.pratice.controller;

import com.example.pratice.dto.ExerciseResponse;
import com.example.pratice.dto.ExerciseSaveRequest;
import com.example.pratice.dto.ExerciseSaveResponse;
import com.example.pratice.service.ExerciseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ExerciseController {

    private final ExerciseService exerciseService;

    @GetMapping("/exercise/{exerciseId}")
    public ExerciseResponse get(@PathVariable Long exerciseId) {
        return exerciseService.get(exerciseId);
    }


    @PostMapping("/exercise/save/{userId}")
    public ExerciseSaveResponse save(@RequestBody @Valid ExerciseSaveRequest request, @PathVariable Long userId) {
        return exerciseService.saveExercise(request, userId);
    }
}
