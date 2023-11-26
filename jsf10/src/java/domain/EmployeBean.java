/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import entities.Employe;
import entities.Service;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;


/**
 *
 * @author USER
 */
@ManagedBean(name="employeBean")
public class EmployeBean {
    
    private Employe employe;
    private List<Employe> employes;
    private Service service;
    private Employe selectedEmploye;
    /**
     * Creates a new instance of employeBean
     */
    public EmployeBean() {
        employes = new ArrayList<>();
        employe = new Employe();
        employe.setService(new Service());
        service = new Service(); 
        selectedEmploye= new Employe();
       
    }

    public void onCreateAction (){
        System.out.println(employe.getNom());
        System.out.println(employe.getPrenom());
        employes.add(employe);
        System.out.println(employes);
        employe = new Employe();
        employe = new Employe();
        employe.setService(new Service());
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Employe getSelectedEmploye() {
        return selectedEmploye;
    }

    public void setSelectedEmploye(Employe selectedEmploye) {
        this.selectedEmploye = selectedEmploye;
    }

    

   
}
