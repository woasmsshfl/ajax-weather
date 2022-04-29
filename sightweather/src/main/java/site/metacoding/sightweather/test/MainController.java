package site.metacoding.sightweather.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @GetMapping("/")
    public String main() {
        return "main";
    }

    // private WeatherRepository weatherRepository;

    // public MainController(WeatherRepository weatherRepository) {
    //     this.weatherRepository = weatherRepository;
    // }

    // @CrossOrigin
    // @GetMapping("/")
    // public String download(Model model) {

    //     StringBuffer sb = new StringBuffer();

    //     try {

    //     } catch (Exception e) {
    //         //TODO: handle exception
    //     }

    //     sb.append("https://apis.data.go.kr/1360000/TourStnInfoService/getTourStnWthrIdx?");
    //     sb.append("serviceKey=f%2BafZVkcjTIbiKy2FpST1dZWhtMXocgF70j2NsCMFqx04qe0U2MNwjS0BGqgqzZHttuGKxxK4Jh60Uj2PyMSkw%3D%3D");
    //     sb.append("&pageNo=1&numOfRows=10");
    //     sb.append("&dataType=JSON");
    //     sb.append("&CURRENT_DATE=2019122010");
    //     sb.append("&HOUR=24");
    //     sb.append("&COURSE_ID=1");

    //     RestTemplate rt = new RestTemplate();

    //     Weather weather = rt.getForObject(sb.toString(), Weather.class);

    //     List<Weather> lists = Arrays.asList(weather);

    //     weatherRepository.saveAll(lists);

    //     model.addAttribute("data", lists);

    //     return "/main";
    // }


}
