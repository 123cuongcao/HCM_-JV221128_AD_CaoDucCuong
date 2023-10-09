package Exam_Advance_1.ra.bussinessImp;

import Exam_Advance_1.ra.bussiness.IShop;

import java.util.Scanner;

public class Catalog implements IShop {
    public static Scanner sc = new Scanner(System.in);
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;




    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData() {
        System.out.println("Hãy nhập mã danh mục");
        this.catalogId = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập danh mục sản phẩm");
        this.catalogName = sc.nextLine();
        System.out.println("Hãy nhập dộ ưu tiên");
        this.priority = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập mô tả sản phẩm");
        this.descriptions = sc.nextLine();
        System.out.println("Hãy nhập trạng thái danh mục");
        this.catalogStatus = Boolean.parseBoolean(sc.nextLine());

    }

    @Override
    public void displayData() {
        System.out.println(this);

    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                '}';
    }
}
