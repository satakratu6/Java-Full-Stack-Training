package com.ram.corejava.layers;

public class ProductService {
		static double finalAmount=0;
		public static int addProduct(int pid,String pname,double price) throws ClassNotFoundException {
		System.out.println("This is ProductService");
		System.out.println(pid+pname+price);
		
		if(price<=300) {
		finalAmount=price-price*0.10;
		
		}
		else if(price>=300 && price<=600) {
			finalAmount=price-price*2.5;

		}
		else {
		finalAmount=price-price*0.5;
		}
		
		ProductBean ProductBean = new ProductBean();
		
		ProductBean.setPid(pid);  //100
		ProductBean.setPname(pname);    //java
		ProductBean.setPrice(price);    //250
		ProductBean.setFinalAmount(finalAmount);;    //C
		
		
		ProductDAO productDAO=new ProductDAO();
		int k=productDAO.addBook(ProductBean);
		
		return k;
		}
		
}
