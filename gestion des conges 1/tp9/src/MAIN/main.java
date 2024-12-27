package MAIN;

import Controller.*;
import DAO.*;
import model.*;
import view.*;

public class main {

    public static void main(String[] args) {
        Employe_HolidayView view = new Employe_HolidayView();
        EmployeDAOimpl dao = new EmployeDAOimpl();
        HolidayDAOimpl dao_holiday = new HolidayDAOimpl();
        Employemodel model_employe = new Employemodel(dao);
        HolidayModel model_holiday = new HolidayModel(dao_holiday);
        new EmployeController(view, model_employe);
        new HolidayController(view, model_holiday);
    }
}