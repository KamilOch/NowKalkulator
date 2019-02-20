package Kalkulator;



@Controller
public class Kalkulator_Controler {

    @RequestMapping("/kalkulator_form")
    public String pobieranieLiczb (

            Model model
    ) {


        Kalkulator kalkulator = new Kalkulator(6666.0, 9999.0);


        return "wynik";


    }
}
