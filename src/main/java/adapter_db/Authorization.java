package adapter_db;

import database.Авторизація;
import database.БазаДаних;

public class Authorization extends Авторизація {
    public boolean authorize(DataBase db){
        return авторизуватися(db);
    }
}
