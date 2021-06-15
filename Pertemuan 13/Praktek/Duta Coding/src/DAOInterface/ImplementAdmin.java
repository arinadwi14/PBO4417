/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;

import java.util.List;
import model.ModUser;

/**
 *
 * @author User
 */
public interface ImplementAdmin {
    public void insert(ModUser mu);
    public List<ModUser> getAll();
    public List<ModUser> getCariNama(String nama);
}
