"""TODO: "refactor the scoring functionality into a controller folder"
"build on your current quiz system by adding a page (e.g., /results, that displays
 the user's total score after they submit their answers. This page should 
 summarize how many questions were answered correctly out of the total number 
 of questions.)"
`work from the provided react quiz system (2024_simple_quiz-main)"""
        
        
                
                
/*
package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ReactController {
    @GetMapping("/react-quiz")
    public String reactQuiz() {
        return "react-quiz"; // render the page
    }
}
    
wrong language
*/

// controller.js
// This file handles the scoring logic for the quiz application

class QuizController {
    constructor() {
        this.score = 0;
        this.count = 0;
    }

    incrementScore() {
        this.score += 1;
        this.count += 1;
        alert("You are correct!");
    }

    dontIncrementScore() {
        this.count += 1;
        alert("Sorry - not correct");
    }

    getScore() {
        return this.score;
    }

    getCount() {
        return this.count;
    }

    resetScore() {
        this.score = 0;
        this.count = 0;
    }
}

const quizController = new QuizController();
export default quizController;