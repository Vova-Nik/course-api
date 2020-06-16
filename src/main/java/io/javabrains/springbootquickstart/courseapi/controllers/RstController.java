package io.javabrains.springbootquickstart.courseapi.controllers;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.TreeMap;

@Controller

@RequestMapping(value="/rest")


public class RstController {
//    String source = @Value()
   @Value("${vova.inet-source}")
   private String message;
   private Map<String, String> notes = new TreeMap();
    private JSONObject jo;
   public RstController(){
       notes.put("0", "zerro");
       notes.put("1", "one");
       notes.put("2", "two");
       notes.put("3", "three");
       System.out.println("RstController constructor______________________________________________");
       for(int i=0; i<=3; i++) {
           System.out.println("RstController constructor id = " + i + " map = " + notes.get(String.valueOf(i)));

       }
       jo = new JSONObject(notes);

   }

   //Mapping http://localhost:8081/rest/
    @GetMapping("/")

    public String greeting(Model model) {
        System.out.println("Rest Controller.There is no Id.");
        model.addAttribute("title", "About CourseApi");
        System.out.println("RstController simple mapping ______________________________________________");
        return "rest";
    }

    @GetMapping("/{id}")
    public JSONObject read(@PathVariable String id) {
        if (!notes.containsKey(id)) {
            System.out.println("Rest Controller.Id not found. id = " + id);
        }
        System.out.println("RstController simple mapping ______________________________________________");
        return jo;
    }

    //@PostMapping("")
    @RequestMapping(value="", method=RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    //public String create(@RequestBody Map<String,String> allParams) {

    public ResponseEntity<String> readData(@RequestBody String allParams) {


        System.out.println("Rest Controller Post mapping");
        System.out.println("allParams = " + allParams);
        if(allParams.contains("read"))
          System.out.println("read request hb got. " + message );

        JSONObject json = new JSONObject(notes);
        System.out.printf( "JSON: %s", json.toString(2) );
        return new ResponseEntity<String>(json.toString(), HttpStatus.OK);
    }
    /*
    @RequestMapping(method=RequestMethod.POST, value="/emp")
    public @ResponseBody Employee addEmp(@RequestBody Employee e) {
        employeeDS.add(e);
        return e;
    }

    @RequestMapping(method=RequestMethod.PUT, value="/emp/{id}")
    public @ResponseBody Employee updateEmp(
            @RequestBody Employee e, @PathVariable String id) {
        employeeDS.update(e);
        return e;
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/emp/{id}")
    public @ResponseBody void removeEmp(@PathVariable String id) {
        employeeDS.remove(Long.parseLong(id));
    }
    */
}
