package pt.lincesw.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import pt.lincesw.product.entity.Product;
import pt.lincesw.product.entity.Stock;
import pt.lincesw.product.entity.Store;
import pt.lincesw.product.repository.ProductRepository;
import pt.lincesw.product.repository.StockRepository;
import pt.lincesw.product.repository.StoreRepository;

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
