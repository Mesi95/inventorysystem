package com.example.inventorysystem.model;

import jakarta.persistence.*;

import java.util.*;

//@Entity
public class Stock {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private  int stock_id;
//    @ManyToMany
//    @JoinTable(
//            name = "StockUser",
//            joinColumns = @JoinColumn(name = "stock_id",referencedColumnName = "stock_id"),
//            inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "user_id")
//    )
//    private Collection<User>users;
//    //private Set<User> useStock = new HashSet<>();
//    @ManyToMany
//    @JoinTable(
//            name = "StockProduct",
//            joinColumns = @JoinColumn(name = "stock_id",referencedColumnName = "stock_id"),
//            inverseJoinColumns = @JoinColumn(name = "product_id",referencedColumnName ="product_id" )
//    )
//    private Collection<Product>products;
//  //  private List<Product> productStock;
//
//    @ManyToMany
//    @JoinTable(
//            name = "StockStore",
//            joinColumns = @JoinColumn(name = "stock_id",referencedColumnName = "stock_id"),
//            inverseJoinColumns = @JoinColumn(name = "store_id",referencedColumnName = "store_id")
//    )
//    private Collection<Store> stores;
//    //private Set<Store> storeStock;
// //= new HashSet<>()
//    private Long qty;
//    private Date reg_date;
//
//    public Stock() {
//    }
//
//    public Stock(Collection<User> users, Collection<Product>products, Collection<Store>stores, Long qty, Date reg_date){
//        this.users=users;
//        this.products=products;
//        this.stores=stores;
//        this.qty=qty;
//        this.reg_date=reg_date;
//    }
//    public int getStock_id() {
//        return stock_id;
//    }
//
//    public void setStock_id(int stock_id) {
//        this.stock_id = stock_id;
//    }
//
//    public Long getQty() { return qty; }
//    public void setQty(Long qty) {
//        this.qty = qty;
//    }
//
//    public Date getReg_date() {
//        return reg_date;
//    }
//
//    public void setReg_date(Date reg_date) {
//        this.reg_date = reg_date;
//    }




//        public Set<User> getUseStock() {
//        return useStock;
//    }
//
//    public void useStock(User user) {
//        this.useStock=useStock;
//    }
//
//    public void productStock(Product product) {
//        this.productStock=productStock;
//    }
//
//    public void setUseStock(Set<User> useStock) {
//        this.useStock = useStock;
//    }
//
//    public List<Product> getProductStock() {
//        return productStock;
//    }
//
//    public void setProductStock(List<Product> productStock) {
//        this.productStock = productStock;
//    }
//
//    public Set<Store> getStoreStock() {
//        return storeStock;
//    }
//
//    public void setStoreStock(Set<Store> storeStock) {
//        this.storeStock = storeStock;
//    }
//
//    public void storeStock(Store store) {
//        this.storeStock = storeStock;
//    }

//    public Collection<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Collection<User> users) {
//        this.users = users;
//    }
//
//    public Collection<Product> getProducts() {
//        return products;
//    }
//
//    public void setProducts(Collection<Product> products) {
//        this.products = products;
//    }
//
//    public Collection<Store> getStores() {
//        return stores;
//    }
//
//    public void setStores(Collection<Store> stores) {
//        this.stores = stores;
//    }
}
