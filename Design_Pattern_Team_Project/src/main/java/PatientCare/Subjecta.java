/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientCare;
import java.util.List;

/**
 *
 * @author user
 */
public abstract class Subjecta {

    protected List<Observera> observers;

    public abstract void registerObservera(Observera o);

    public abstract void removeObservera(Observera o);

    public abstract void notifyObservera(String mode, PatientInforData data, PatientManipulation um);

}