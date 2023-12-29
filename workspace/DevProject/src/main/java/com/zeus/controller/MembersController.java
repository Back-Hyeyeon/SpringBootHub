package com.zeus.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.zeus.domain.Address;
import com.zeus.domain.Card;
import com.zeus.domain.Member;

import jakarta.websocket.server.PathParam;
import lombok.extern.java.Log;

@Log
@Controller
public class MembersController {

	@GetMapping(value = "/registerAllForm")
	public String registerAllForm() {
		
		return "registerAllForm";
	}
	

	@PostMapping(value = "/registerMemberUserId")
	public String registerMemberUserId(Member member) {
		log.info("registerMemberUserId : Member");
		
		log.info("userId : "+ member.getUserId());
		return "success";
	}
	@PostMapping(value = "/registerUser")
	public String registerUser(Member member) {
		log.info("registerUser");
		
		log.info("userId : "+ member.getUserId());
		log.info("Gender : "+ member.getGender());
		log.info("Hobby : "+ member.getHobby());
		log.info("isForeigner : "+ member.isForeigner());
		log.info("Developer : "+ member.getDeveloper());
		log.info("DateOfBirth : "+ member.getDateOfBirth());
		log.info("Cars : "+ member.getCars());
		log.info("Introduction : "+ member.getIntroduction());
		
		String[] hobbyArray = member.getHobbyArray();
		if(hobbyArray != null) {
			log.info("hobbyArray.length : "+ hobbyArray.length);
			
			for(int i=0;i < hobbyArray.length;i++) {
				log.info("hobbyArray["+i+"]"+ hobbyArray[i]);
			}
		}else {
			log.info("hobbyArray == null");
		}
		
		List<String> hobbyList = member.getHobbyList();
		
		if(hobbyList != null) {
			log.info("hobbyList.size() : "+hobbyList.size());
			for(int i=0;i < hobbyList.size();i++) {
				log.info("hobbyList["+i+"]" + hobbyList.get(i));
			}
		}else {
			log.info("hobbyList == null");
		}
		
		Address address = member.getAddress();
		if(address != null) {
			log.info("address.getPostCode() : " + address.getPostCode());
			log.info("address.getLocation() : " + address.getLocation());
		}else {
			log.info("assress == null");
		}
		List<Card> cardList = member.getCardList();
		
		if(cardList != null) {
			log.info("cardList.size() : "+cardList.size());
			
			for(int i=0;i < cardList.size(); i++) {
				Card card = cardList.get(i);
				log.info("card.getNo() : "+card.getNo());
				log.info("card.getValidMonth() : "+card.getValidMonth());
			}
		}else {
			log.info("cardList == null");
		}
		
		String[] cardArray = member.getCarArray();
		if(cardArray != null) {
			log.info("cardArray.length : "+cardArray.length);
			
			for(int i=0;i < cardArray.length; i++) {
				log.info("cardArray ["+i+"]"+cardArray[i]);
			}
		}else {
			log.info("cardArray == null");
		}
		
		List<String> carList = member.getCarList();
		if(cardList != null) {
			log.info("cardLis.size() : "+carList.size());
			
			for(int i=0;i < carList.size(); i++) {
				log.info("hobbyList["+i+"]"+ cardList.get(i));
			}
		}else {
			log.info("cardList == null");
		}
		
		return "success";
	}
	
	@PostMapping(value = "/registerUserId")
	public String registerUserId(String userId) {
		log.info("registerUserId");
		log.info("userId : "+userId);
		return "success";
	}
	@PostMapping(value = "/registerPassword")
	public String registerPassword(String password) {
		log.info("registerPassword");
		log.info("password : "+ password);
		return "success";
	}	
	
	@PostMapping(value = "/registerTextArea")
	public String registerTextArea(String introduction) {
		log.info("registerTextArea");
		log.info("introduction : "+ introduction);
		return "success";
	}	
	@PostMapping(value = "/registerRadio")
	public String registerRadio(String gender) {
		log.info("registerRadio");
		log.info("gender : "+ gender);
		return "success";
	}	
	@PostMapping(value = "/registerCheckbox01")
	public String registerCheckbox01(String hobby) {
		log.info("registerCheckbox01");
		log.info("hobby : "+ hobby);
		return "success";
	}	
	
	@PostMapping(value = "/registerCheckbox02")
	public String registerCheckbox02(String[] hobbyArray) {
		log.info("registerCheckbox02");
		if(hobbyArray != null) {
			log.info("hobbyArray.length : "+hobbyArray.length);
			
			for(int i=0;i < hobbyArray.length;i++) {
				log.info("hobbyArray ["+i+"]"+hobbyArray[i]);
			}
		}else {
			log.info("hobbyArray == null");
		}
		return "success";
	}	
	@PostMapping(value = "/registerCheckbox03")
	public String registerCheckbox04(String developer) {
		log.info("registerCheckbox04");
		log.info("developer : "+developer);
		return "success";
	}	
	@PostMapping(value = "/registerCheckbox04")
	public String registerCheckbox05(boolean foreigner) {
		log.info("registerCheckbox05");
		log.info("foreigner : "+foreigner);
		return "success";
	}	
	@PostMapping(value = "/registerSelect")
	public String registerSelect(String nationality) {
		log.info("registerSelect");
		log.info("nationality : "+nationality);
		return "success";
	}	
	@PostMapping(value = "/registerMultipSelect01")
	public String registerMultipSelect01(String cars) {
		log.info("registerMultipSelect01");
		log.info("cars : "+cars);
		return "success";
	}	
	
	@PostMapping(value = "/registerMultipSelect02")
	public String registerMultipSelect02(String[] carsArray) {
		log.info("registerMultipSelect02");
		if(carsArray != null) {
			log.info("carsArray.length : "+carsArray.length);
			for(int i=0;i < carsArray.length;i++) {
				log.info("carsArray["+i+"]"+carsArray[i]);
			}
		}else {
			log.info("carsArray == null");
		}
		return "success";
	}	
	@PostMapping(value = "/registerMultipSelect03")
	public String registerMultipSelect03(@PathParam("carList") ArrayList<String> carList) {
		log.info("registerMultipSelect03");
		if(carList != null) {
			log.info("carList.size() : "+carList.size());
			for(int i=0;i < carList.size();i++) {
				log.info("carsArray["+i+"]"+carList.get(i));
			}
		}else {
			log.info("carList == null");
		}
		return "success";
	}	
	@PostMapping(value = "/registerAddress")
	public String registerAddress(Address address) {
		log.info("registerAddress");
		if(address != null) {
			log.info("address.getPostCode() : "+ address.getPostCode());
			log.info("address.getLocation() : "+ address.getLocation());
		}else {
			log.info("address == null");
		}
		return "success";
	}	
	@PostMapping(value = "/registerUserAddress")
	public String registerUserAddress(Member member) {
		log.info("registerUserAddress");
		Address address = member.getAddress();
		if(address != null) {
			log.info("address.getPostCode() : "+ address.getPostCode());
			log.info("address.getLocation() : "+ address.getLocation());
		}else {
			log.info("address == null");
		}
		return "success";
	}	
	@PostMapping(value = "/registerUserCardList")
	public String registerUserCardList(Member member) {
		log.info("registerUserCardList");
		List<Card> cardList = member.getCardList();
		if(cardList != null) {
			log.info("cardList.size() : "+ cardList.size());
			for(int i=0;i < cardList.size();i++) {
				Card card = cardList.get(i);
				log.info("card.getNo() : "+card.getNo());
				log.info("card.getValidMonth() : "+card.getValidMonth());
				
			}
		}else {
			log.info("cardList == null");
		}
		return "success";
	}	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
