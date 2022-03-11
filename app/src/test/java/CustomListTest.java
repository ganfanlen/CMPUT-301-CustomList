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
}
