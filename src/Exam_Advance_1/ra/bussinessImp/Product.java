package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Scanner;

public class Product implements IShop,Comparable<Product> {
    public static Scanner sc= new Scanner(System.in);
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog ;
    private float importPrice;
    private float exportPrice ;
    private boolean productStatus;


    @Override
    public void inputData() {
        System.out.println("Hãy nhập mã sản phẩm");
        this.productId = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập tên sản phẩm");
        this.productName = sc.nextLine();
        System.out.println("Hãy nhập tiêu đề sản phẩm");
        this.title = sc.nextLine();
        System.out.println("Hãy nhập mô tả sản phẩm ");
        this.descriptions = sc.nextLine();
        System.out.println("Hãy nhập giá nhập sản phẩm");
        this.importPrice = Integer.parseInt(sc.nextLine());
        this.exportPrice = getImportPrice() * RATE;
        System.out.println("Giá xuất của sản phẩm"+getExportPrice());
        System.out.println("Hãy diền trạng thái sả phẩm");
        this.productStatus = Boolean.parseBoolean(sc.nextLine());

    }

    @Override
    public void displayData() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", title='" + title + '\'' +
                ", catalog=" + catalog.getCatalogName()+
                ", exportPrice=" + exportPrice +
                ", productStatus=" + productStatus +
                '}';
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public int compareTo(Product o) {
        return (int)(this.exportPrice-o.exportPrice);
    }
}
