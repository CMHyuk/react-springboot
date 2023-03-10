package com.example.pratice.service;

import com.example.pratice.dto.ExerciseResponse;
import com.example.pratice.dto.ExerciseSaveRequest;
import com.example.pratice.dto.ExerciseSaveResponse;
import com.example.pratice.entity.Exercise;
import com.example.pratice.entity.User;
import com.example.pratice.exception.UserNotFound;
import com.example.pratice.repository.ExerciseRepository;
import com.example.pratice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;
    private final UserRepository userRepository;

    public ExerciseResponse get(Long exerciseId) {
        Exercise exercise = exerciseRepository.findById(exerciseId)
                .orElseThrow();

        return ExerciseResponse.builder()
                .id(exercise.getId())
                .title(exercise.getTitle())
                .content(exercise.getContent())
                .build();
    }

    @Transactional
    public ExerciseSaveResponse saveExercise(ExerciseSaveRequest request, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(UserNotFound::new);

        Exercise exercise = Exercise.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .user(user)
                .build();

        Exercise saveExercise = exerciseRepository.save(exercise);

        return ExerciseSaveResponse.builder()
                .id(saveExercise.getId())
                .title(saveExercise.getTitle())
                .content(saveExercise.getContent())
                .loginId(user.getLoginId())
                .build();
    }
}
