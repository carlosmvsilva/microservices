package pt.lincesw.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pt.lincesw.product.entity.Product;
import pt.lincesw.product.entity.Stock;
import pt.lincesw.product.entity.Store;
import pt.lincesw.product.service.ProductService;

@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/product/")
	public Product saveProduct(@RequestBody Product product) {
		log.debug("Inside saveProduct method of ProductController");
		return productService.saveProduct(product);
	}
	
	@GetMapping("/product/{barcode}")
	public Product findProductByBarcode(@PathVariable("barcode") String barcode) {
		log.debug("Inside findByBarcode method of ProductController");
		return productService.findProductByBarcode(barcode);
	}
	
	@PostMapping("/store/")
	public Store saveStore(@RequestBody Store store) {
		log.debug("Inside saveStore method of ProductController");
		return productService.saveStore(store);
	}
	
	@GetMapping("/store/{code}")
	public Store findStoreByCode(@PathVariable("code") String code) {
		return productService.findStoreByCode(code);
	}
	
	@PostMapping("/stock/")
	public Stock saveStock(@RequestBody Stock stock) {
		log.debug("Inside saveStock method of ProductController");
		return productService.saveStock(stock);
	}
	
}
