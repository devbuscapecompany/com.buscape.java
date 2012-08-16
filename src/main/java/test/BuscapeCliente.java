package test;

import java.util.List;

import com.buscape.java.api.GrupoBuscape;
import com.buscape.java.api.buscape.BuscapeAPI;
import com.buscape.java.api.response.Offer;
import com.buscape.java.api.response.Product;
import com.buscape.java.api.response.Result;

public class BuscapeCliente {

	private static final String APP_ID = "2b504d467162784455724d3d";
	
	private BuscapeAPI buscape;
	
	
	public BuscapeCliente() {
		buscape = new GrupoBuscape(APP_ID).sandbox().buscape();
		
	}
	
	public List<Offer> pesquisarOfertas(int idProduto) {
		Result resultado = buscape.findOfferList().setProductId(idProduto).sortByPrice().call();
		return resultado.getOffer();
		
	}
	
	public List<Product> pesquisarProduto(String keyword) {
		Result resultado = buscape.findProductList().setKeyword(keyword).sortByPrice().call();
		return resultado.getProduct();
		
	}
	
	private void exibirProdutos(List<Product> products) {
		if (products == null) {
			return;
			
		}
		
		for (Product produto : products) {
			exibirProduto(produto);
			
		}
		
	}
	
	private void exibirProduto(Product produto) {
		if (produto == null) {
			return;
			
		}
		
		System.out.println(String.format("%d) %s (R$ %.2f ~ R$ %.2f)", produto.getId(),
				produto.getProductName(), produto.getPriceMin(),
				produto.getPriceMax()));
			
		
	}

	private void exibirOfertas(List<Offer> offers) {
		if (offers == null) {
			return;
			
		}
		
		for (Offer offer : offers) {
			exibirOferta(offer);
			
		}
		
	}
	
	private void exibirOferta(Offer offer) {
		if (offer == null) {
			return;
			
		}
		
		System.out.println(String.format("%d) %s = R$ %s", offer.getId(), offer.getSeller().getSellerName(), offer.getPrice().getValue()));
//		if (offer.getLinks() != null) {
//			for (Link link : offer.getLinks()) {
//				System.out.println(link.getUrl());
//				
//			}
//			
//		}
//		
//		System.out.println("-----");
		
		
	}
	
	public static void main(String[] args) {
		BuscapeCliente cliente = new BuscapeCliente();
		
		int ipad = 385727; // novo ipad 32gb wifi
		int nespresso = 86753;
		int dolceGusto = 298833;
		
		System.out.println("*** iPad");
		cliente.exibirOfertas(cliente.pesquisarOfertas(ipad));
		
//		System.out.println("\n*** Nespresso");
//		cliente.exibirOfertas(cliente.pesquisarOfertas(nespresso));
		
//		System.out.println("\n*** Dolce Gusto");
//		cliente.exibirOfertas(cliente.pesquisarOfertas(dolceGusto));
		
//		cliente.exibirProdutos(cliente.pesquisarProduto("dolce gusto"));
		
		
		
	}

}
