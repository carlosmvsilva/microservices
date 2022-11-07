package online.inloco.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import online.inloco.product.entity.Product;
import online.inloco.product.entity.Stock;
import online.inloco.product.entity.Store;
import online.inloco.product.repository.ProductRepository;
import online.inloco.product.repository.StockRepository;
import online.inloco.product.repository.StoreRepository;

@Service
@Slf4j
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private StoreRepository storeRepository;
	
	@Autowired
	private StockRepository stockRepository;
	
	
	
	public Product saveProduct(Product product) {
		log.debug("Inside saveProduct method of ProductService");
		return productRepository.save(product);
	}
	
	public Product findProductByBarcode(String barcode) {
		log.debug("Inside findProductByBarcode method of ProductService");
		return productRepository.findByBarcode(barcode);
	}
	
	public Store saveStore(Store store) {
		log.debug("Inside saveStore method of ProductService");
		return storeRepository.save(store);
	}

	public Store findStoreByCode(String code) {
		log.debug("Inside findStoreByCode method of ProductService");
		return storeRepository.findByCode(code);
	}
	
	public Stock saveStock(Stock stock) {
		log.debug("Inside saveStock method of ProductService");
		return stockRepository.save(stock);
	}
}
