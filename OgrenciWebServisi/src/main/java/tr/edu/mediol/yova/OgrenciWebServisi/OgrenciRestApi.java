package tr.edu.mediol.yova.OgrenciWebServisi;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ogrenci")
public class OgrenciRestApi {
	
	private static final List<String> OGRENCILER = new ArrayList<>();
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
	}
	
	@GetMapping("/listele")
	public List<String> listele() {
		return OGRENCILER;
	}

}
