package Exam_Advance_1.ra.run;

import Exam_Advance_1.ra.bussinessImp.Catalog;
import Exam_Advance_1.ra.bussinessImp.Product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductManagement {
    static Scanner sc = new Scanner(System.in);
    static List<Catalog> catalogs = new ArrayList<>();
    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        int choice ;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                    "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục \n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm \n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator) \n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm \n" +
                    "5. Thoát");
            System.out.println("Hãy nhập lựa chọn của bạn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Hãy nhập số danh mục muốn thêm");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i = 0 ;i<n; i++){
                        Catalog catalog = new Catalog();
                        catalog.inputData();
                        catalogs.add(catalog);

                    }
                    break;
                case 2:
                    System.out.println("hãy nhập có sản phẫm muốn thêm");
                    int m = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<m;i++){
                        Product product = new Product();
                        product.inputData();
                        catalogs.forEach(Catalog::displayData);
                        System.out.println("Hãy chọn 1 catalog theo mã catalog");
                        int want = Integer.parseInt(sc.nextLine());
                        Optional<Catalog> test =  catalogs.stream().filter(a->a.getCatalogId()==want).findFirst();
                        Catalog found = test.get();
                        product.setCatalog(found);
                        products.add(product);
                    }
                    break;
                case 3:
                    products.sort(Comparator.comparing(Product::getExportPrice));
                    System.out.println("Danh sách sản phẩm đã dc sắp xếp");
                    break;
                case 4:
                    System.out.println("Hãy điền tên danh mục muốn tìm");
                    String wantCatalog = sc.nextLine();
                    products.stream().filter(a->a.getCatalog().getCatalogName().equals(wantCatalog)).forEach(Product::displayData);
                    break;
                case 5:
                    break;
                default:

            }

        }while (choice !=5);

    }
}
