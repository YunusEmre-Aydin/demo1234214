package tr.edu.medipol.yova.OgrenciWebServisi;
import java.util.*;
import org.springframework.web.bind.annotation.*;


@RestController  			// Rest web servis sinifi ozelligi kazandiriyoruz
@RequestMapping("/ogrenci") // /ogrenci ile baslayan web isteklerini bu sınıfa yönlendirir
public class OgrenciRestApi {

	private static final List<String> OGRENCILER = new ArrayList<>();
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
		OGRENCILER.add("Johnny");
	}
	@GetMapping("/listele")
	public List<String> listele(){
		return OGRENCILER;
	}
	
}
	

