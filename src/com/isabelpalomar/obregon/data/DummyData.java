package com.isabelpalomar.obregon.data;

import com.isabelpalomar.obregon.R;
import com.isabelpalomar.obregon.models.Store;

public class DummyData {
	
	// This static field acts as the app's "fake" database of stores data :P
    public static final Store[] stores = { 
        new Store(0, "Import Demf",        "Gigantes #235,\n Guadalajara, Jalisco",        33342815, "http://goo.gl/aIYasR", "import_demf2@hotmail.com",     "Lunes a Sábado, 10:00 am - 8:00 pm",  R.drawable.store_0),
        new Store(1, "Más Fragancias",     "Vicente Guerrero #53, \n Guadalajara, Jalisco", 36185911, "http://goo.gl/CMWmE4", "masfragancias@gmail.com",      "Lunes a Jueves, 10:00 am - 4:00 pm",  R.drawable.store_1), 
        new Store(2, "La Bodega del Bebé", "Javier Mina #396, \n Guadalajara, Jalisco",     36172271, "http://goo.gl/AAIFLZ", "labodegadelbebe3@hotmail.com", "Lunes a Sábado, 10:00 am - 7:30 pm",  R.drawable.store_2),
        new Store(3, "Arette Accesorios",  "Álvaro Obregón 542, \n Guadalajara, Jalisco",   36133455, "http://goo.gl/UgzhVc", "redsocial@arette.com.mx",      "Lunes a Sábado, 10:30 am - 8:30 pm",  R.drawable.store_3)
    };

}
