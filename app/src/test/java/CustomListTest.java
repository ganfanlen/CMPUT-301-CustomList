import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(),listSize+1);
    }
    @Test
    public void hasCityTest(){
        City city = new City("Ningde", "Fujian");
        assertEquals(0, list.hasCity(city));
        list.addCity(city);
        assertEquals(1, list.hasCity(city));
    }
    @Test
    public void deleteCityTest(){
        City city1 = new City("T1", "T2");
        list.addCity(city1);
        assertEquals(1,list.hasCity(city1));
        list.removeCity(city1);
        assertEquals(0,list.hasCity(city1));
    }

    @Test
    public void countCity(){
        CustomList list1 = new CustomList(null,new ArrayList<City>());;
        assertEquals(0,list1.countCity());
        list1.addCity(new City("T1","T2"));
        assertEquals(1,list1.countCity());
    }


}
