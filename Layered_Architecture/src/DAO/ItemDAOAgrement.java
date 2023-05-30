package DAO;

import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAOAgrement {
        public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException ;
        public boolean deleteIteam(String code) throws SQLException, ClassNotFoundException;
        public boolean saveItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
        public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException;
        public boolean exitItem(String code) throws SQLException, ClassNotFoundException;
        public String generateNewId() throws SQLException, ClassNotFoundException;
        public ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;
}