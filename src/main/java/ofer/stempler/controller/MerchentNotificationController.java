package ofer.stempler.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/merchant")
public class MerchentNotificationController {

		@RequestMapping(value="/notification",
        method=RequestMethod.POST)
	    public ResponseEntity<String> authentication(@RequestBody MultiValueMap<String, String> request) throws IOException {
			System.out.println("=====================================================");
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));
			request.forEach((k,v)->System.out.println(k + " : " + v));
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
}
