/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IIC;

/**
 *
 * @author Nikit Dahal, Sujan Basnet, Sujan Chaudhary, Sujan Thapa
 */
public class AppliancesData {
    private String productNo, productName, productCategory, productBrand, productModel, productPlatform, productPrice;

    public AppliancesData(String productNo, String productName, String productCategory, String productBrand, String productModel, String productPlatform, String productPrice) {
        this.productNo = productNo;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productBrand = productBrand;
        this.productModel = productModel;
        this.productPlatform = productPlatform;
        this.productPrice = productPrice;
    }

    public String getProductNo() {
        return productNo;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public String getProductModel() {
        return productModel;
    }

    public String getProductPlatform() {
        return productPlatform;
    }

    public String getProductPrice() {
        return productPrice;
    }
}
