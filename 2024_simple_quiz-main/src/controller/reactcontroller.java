/*package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Greeting;
import com.example.demo.model.MyString;
import com.example.demo.model.GetQuestion;
import com.example.demo.model.Count;
//import com.example.demo.model.MyString;
//import com.example.demo.model.questions.QuestionTrueFalse;
import com.example.demo.model.questions.*;



@Controller 
public class HomeController { 

	@GetMapping("/") 
	public String home() { 
		return "home";  // for home.html 
	} 

	@GetMapping("/greeting")
		public String greetingForm(Model model) {
			Count count = new Count();
			count.count = count.count + 1;
			model.addAttribute("greeting", new Greeting());
			model.addAttribute("count", count);
			
			return "greeting";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, @ModelAttribute Count count, Model model) {
		model.addAttribute("greeting", greeting);
		model.addAttribute("count", count);
		return "result";
  	}

    @GetMapping("/quiz")
    public String showQuiz(Model model) {
        AllQuestions allQuestions = new AllQuestions();
        List<QuestionTrueFalse> questions = allQuestions.getAllQuestions();
        model.addAttribute("questions", questions);
        return "question";
    }

    @PostMapping("/submit-quiz")
    @ResponseBody
    public Map<String, Object> submitQuiz(@RequestBody Map<String, Boolean> answers) {
        AllQuestions allQuestions = new AllQuestions();
        List<QuestionTrueFalse> questions = allQuestions.getAllQuestions();
        
        List<Map<String, Object>> results = new ArrayList<>();
        
        for (int i = 0; i < questions.size(); i++) {
            Boolean userAnswer = answers.get("answer" + i);
            QuestionTrueFalse question = questions.get(i);
            
            Map<String, Object> result = new HashMap<>();
            result.put("correct", userAnswer.equals(question.getAnswer()));
            result.put("correctAnswer", question.getAnswer());
            results.add(result);
        }
        
        Map<String, Object> response = new HashMap<>();
        response.put("results", results);
        return response;
    }

  
}*/

//^ example from old quiz system, not current

//TODO: "refactor the scoring functionality into a controller folder"
//"build on your current quiz system by adding a page (e.g., /results, that displays the user's total score after they submit their answers. This page should summarize how many questions were answered correctly out of the total number of questions.)"
//work from the provided react quiz system (2024_simple_quiz-main)