package DAO;

import model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAOAgrement {
        public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException;
        public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException;
        public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException;
        public boolean exit(String id) throws SQLException, ClassNotFoundException;
        public boolean delete(String id) throws SQLException, ClassNotFoundException;
        public String genarateId() throws SQLException, ClassNotFoundException;
        public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException;
        }