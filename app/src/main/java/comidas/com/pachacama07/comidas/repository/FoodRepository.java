package comidas.com.pachacama07.comidas.repository;


import java.util.ArrayList;
import java.util.List;

import comidas.com.pachacama07.comidas.models.Food;

public class FoodRepository {


    private static List<Food> foods = new ArrayList<>();

    static{
        foods.add(new Food(100, "California Sandwiches", "Sandwiches" , "  15-30 minutos ","S/.5.00", "img1"));
        foods.add(new Food(100, "Fromage", "Crepe" , "  15-20 minutos ","S/.8.00", "img2"));
        foods.add(new Food(100, "Primavera", "Crepe" , "  10-20 minutos ","S/.8.00", "img3"));
        foods.add(new Food(100, "Revoltillo Holandès", "Especial" , "  20-25 minutos ","S/.10.00", "img4"));
        foods.add(new Food(100, "Fritos", "Especial" , "  20-25 minutos ","S/.12.00", "img5"));
        foods.add(new Food(100, "Huevos Alaska", "Especial" , "  20-25 minutos ","S/.12.00", "img6"));


    }

    public static List<Food> getList(){
        return foods;
    }


}
