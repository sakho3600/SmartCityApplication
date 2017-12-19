/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization.Municipal;

import Business.Organization.Organization;
import Business.Role.CitizenRole;
import Business.Role.EverSourceElectricityManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author prashant
 */
public class EverSourceElectricityOrganization extends Organization{
    
     public EverSourceElectricityOrganization() {
        super(Organization.Type.EverSource.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EverSourceElectricityManagerRole());
        return roles;
    }
}
