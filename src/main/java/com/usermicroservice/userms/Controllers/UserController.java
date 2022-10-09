package com.usermicroservice.userms.Controllers;
import com.usermicroservice.userms.Models.User;
import com.usermicroservice.userms.Repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/user") 
public class UserController {
  @Autowired 
  private UserRepository userRepository;

  @PostMapping(path="/add")
  public @ResponseBody String addNewUser (@RequestParam String firstName, 
                                        @RequestParam String email,
                                        @RequestParam String lastName,
                                        @RequestParam String street,
                                        @RequestParam String  street2,
                                        @RequestParam String city,
                                        @RequestParam String state,
                                        @RequestParam String zip,
                                        @RequestParam String phone,
                                        @RequestParam String dob,
                                        @RequestParam String gender,
                                        @RequestParam String social
                                         ) {

    User n = new User();
    n.setFirstName(firstName);
    n.setEmail(email);
    n.setLastName(lastName);
    n.setStreet(street);
    n.setStreet2(street2);
    n.setCity(city);
    n.setState(state);
    n.setZip(Integer.valueOf(zip));
    n.setPhone(phone);
    n.setDob(dob);
    n.setGender(gender);
    n.setSocial(Integer.valueOf(social));

    userRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    // This returns a JSON or XML with the users
    return userRepository.findAll();
  }

  @GetMapping(path="/id/{id}")
  public @ResponseBody User userByID(@PathVariable String id)
  {
    return userRepository.findById(Integer.valueOf(id));
  }
}
