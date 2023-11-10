/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import control.Clients;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Client;
import model.ClientLegal;
import model.ClientNatural;
import model.Detail;
import model.Product;
import model.ProductForReceipt;
import model.Receipt;

/**
 *
 * @author argen
 */
public class CrudBD {

    PreparedStatement ps = null;
    ConexionDB conn = new ConexionDB();
    ResultSet rs = null;

    public void createClient(Client p, Clients client) throws SQLException {
        try {
            Statement st = conn.getConexion().createStatement();
            String query;
            if (p instanceof ClientNatural) {
                query = "INSERT INTO clients_natural (id,name, lastName, phoneNumber, emailAddress, address) values (?, ?,?, ?,?,?)";
                ps = conn.getConexion().prepareStatement(query);
                ps.setString(1, p.getId());
                ps.setString(2, client.getName());
                ps.setString(3, ((ClientNatural) p).getLastName());
                ps.setString(4, p.getPhoneNumber());
                ps.setString(5, p.getEmailAddress());
                ps.setString(6, p.getAddress().toString());
                ps.executeUpdate();
            } else {
                query = "INSERT INTO clients_legal (id,socialReason, phoneNumber, emailAddress, address) values (?, ?, ?,?,?)";
                ps = conn.getConexion().prepareStatement(query);
                ps.setString(1, p.getId());
                ps.setString(2, client.getName());
                ps.setString(3, p.getPhoneNumber());
                ps.setString(4, p.getEmailAddress());
                ps.setString(5, p.getAddress().toString());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> getProducts(String typeProduct) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String query = "SELECT * FROM products WHERE type_product = ?";
            ps = conn.getConexion().prepareStatement(query);
            ps.setString(1, typeProduct);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setTypeProduct(rs.getString("type_product"));
                products.add(product);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return products;
    }

    public Product getProduct(String id) {
        Product product = new Product();
        try {
            String query = "SELECT * FROM products WHERE type_product = ?";
            ps = conn.getConexion().prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                product.setId(rs.getString("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setTypeProduct(rs.getString("type_product"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return product;
    }

    public ArrayList<Clients> getClients() {
        ArrayList<Clients> clients = new ArrayList<>();
        try {
            String query = "SELECT * FROM clients_legal";
            ps = conn.getConexion().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Clients client = new ClientLegal(
                        rs.getString("socialReason"),
                        rs.getString("phoneNumber"),
                        rs.getString("emailAddress"),
                        rs.getString("id"),
                        rs.getString("address")
                );
                clients.add(client);
            }
            query = "SELECT * FROM clients_natural";
            ps = conn.getConexion().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Clients client = new ClientNatural(
                        rs.getString("name"),
                        rs.getString("lastName"),
                        rs.getString("phoneNumber"),
                        rs.getString("emailAddress"),
                        rs.getString("id"),
                        rs.getString("address")
                );
                clients.add(client);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return clients;
    }

    public Client getClient(String id) {
        try {
            String query = "SELECT * FROM clients_legal WHERE id = ? ";
            ps = conn.getConexion().prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Client client = new ClientLegal(
                        rs.getString("socialReason"),
                        rs.getString("phoneNumber"),
                        rs.getString("emailAddress"),
                        rs.getString("id"),
                        rs.getString("address")
                );
                return client;
            } else {
                query = "SELECT * FROM clients_natural";
                ps = conn.getConexion().prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    Client client = new ClientNatural(
                            rs.getString("name"),
                            rs.getString("lastName"),
                            rs.getString("phoneNumber"),
                            rs.getString("emailAddress"),
                            rs.getString("id"),
                            rs.getString("address")
                    );
                    return client;
                }
            }

        } catch (Exception e) {
            System.out.println(e);

        }
        return null;
    }

    public void createReceipt(String id) {
        try {
            Statement st = conn.getConexion().createStatement();
            String query;
            query = "INSERT INTO receipts (id_client) values (?)";
            ps = conn.getConexion().prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public void addProductReceipt(ArrayList<ProductForReceipt> ProductsForReceipt) {
        int idReceipt = 0;
        try {
            String query = "SELECT MAX(id_receipt) AS latest_id FROM receipts";
            PreparedStatement ps = conn.getConexion().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                idReceipt = rs.getInt("latest_id");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            Statement st = conn.getConexion().createStatement();
            String query;
            query = "INSERT INTO details (id_receipt,id_product, quantity, price) values (?, ?, ?,?)";
            for (ProductForReceipt productForReceipt : ProductsForReceipt) {
                ps = conn.getConexion().prepareStatement(query);
                ps.setInt(1, idReceipt);
                ps.setString(2, productForReceipt.getId());
                ps.setString(3, productForReceipt.getCantity());
                ps.setString(4, productForReceipt.getTotalPrice());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Receipt> getReceipt() {
        ArrayList<Receipt> receipts = new ArrayList<>();
        try {
            String query = "SELECT receipts.*, clients_natural.name AS natural_name, clients_natural.lastName AS natural_lastName, clients_legal.socialReason AS legal_name FROM receipts LEFT JOIN clients_natural ON receipts.id_client = clients_natural.id LEFT JOIN clients_legal ON receipts.id_client = clients_legal.id";
            ps = conn.getConexion().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Receipt receipt = new Receipt();
                receipt.setNumReceipt(rs.getString("id_receipt"));
                String nameClient = rs.getString("natural_name") != null ? rs.getString("natural_name") + " " + rs.getString("natural_lastName") : rs.getString("legal_name");
                receipt.setNameClient(nameClient);
                receipt.setIdClient(rs.getString("id_client"));
                receipt.setDate(rs.getString("date"));
                String typeClient = rs.getString("natural_name") != null ? "Cliente Natural" : "Cliente Jurídico";
                receipt.setTypeClient(typeClient);
                receipts.add(receipt);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return receipts;
    }

    public ArrayList<Detail> getDetails(int numReceipt ) {
        ArrayList<Detail> details = new ArrayList<>();     
        try {
            String query = "SELECT * FROM details WHERE id_receipt = ?";
            ps = conn.getConexion().prepareStatement(query);
            ps.setInt(1, numReceipt);
            rs = ps.executeQuery();
            while (rs.next()) {
                Detail detail = new Detail();
                detail.setNumDetail(rs.getString("num_detail"));
                detail.setIdProduct(rs.getString("id_product"));
                detail.setIdReceipt(String.valueOf(rs.getInt("id_receipt")));
                detail.setQuantity(rs.getString("quantity"));
                detail.setPrice(rs.getString("price"));
                details.add(detail);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return details;
    }
}

