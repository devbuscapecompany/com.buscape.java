/**
 * @brief	Resposta das operações
 * @details	Classes que representam ou convertem o retorno das operações das
 * 			APIs do Grupo BuscaPé em entidades.
 * @package com.buscape.java.api.response
 */
package com.buscape.java.api.response;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Constroi o objeto de resultado de uma resposta no formato JSON.
 */
public class JSONResponseBuilder extends ResponseBuilder {
	@Override
	public ResponseBuilder parse( String content ) {
		try {
			int i, t;
			final JSONObject json = new JSONObject( content );

			if ( json.has( "category" ) ) {
				result.setCategory( parseCategory( json.getJSONObject( "category" ) ) );
			}

			if ( json.has( "details" ) ) {
				parseDetails( json.getJSONObject( "details" ) );
			}

			if ( json.has( "match" ) ) {
				result.setMatch( json.getString( "match" ) );
			}

			if ( json.has( "page" ) ) {
				result.setPage( json.getInt( "page" ) );
			}

			if ( json.has( "offer" ) ) {
				final JSONArray jsonOfferArray = json.getJSONArray( "offer" );
				final List<Offer> offerList = new ArrayList<Offer>();

				for ( i = 0, t = jsonOfferArray.length() ; i < t ; ++i ) {
					offerList.add( parseOffer( jsonOfferArray.getJSONObject( i ).getJSONObject( "offer" ) ) );
				}

				result.setOffer( offerList );
			}

			if ( json.has( "product" ) ) {
				final JSONArray jsonProductArray = json.getJSONArray( "product" );
				final List<Product> productList = new ArrayList<Product>();

				for ( i = 0, t = jsonProductArray.length() ; i < t ; ++i ) {
					productList.add( parseProduct( jsonProductArray.getJSONObject( i ).getJSONObject( "product" ) ) );
				}

				result.setProduct( productList );
			}

			if ( json.has( "seller" ) ) {
				result.setSeller( parseSeller( json.getJSONObject( "seller" ) ) );
			}

			if ( json.has( "subcategory" ) ) {
				final JSONArray jsonSubcategoryArray = json.getJSONArray( "subcategory" );
				final List<Category> subCategoryList = new ArrayList<Category>();

				for ( i = 0, t = jsonSubcategoryArray.length() ; i < t ; ++i ) {
					subCategoryList.add( parseCategory( jsonSubcategoryArray.getJSONObject( i ).getJSONObject( "subcategory" ) ) );
				}

				result.setSubCategory( subCategoryList );
			}

			if ( json.has( "top5category" ) ) {
				final JSONArray jsonTop5categoryArray = json.getJSONArray( "top5category" );
				final List<Category> top5CategoryList = new ArrayList<Category>();

				for ( i = 0, t = jsonTop5categoryArray.length() ; i < t ; ++i ) {
					top5CategoryList.add( parseCategory( jsonTop5categoryArray.getJSONObject( i ).getJSONObject( "top5category" ) ) );
				}

				result.setTop5Category( top5CategoryList );
			}

			if ( json.has( "totalpages" ) ) {
				result.setTotalPages( json.getInt( "totalpages" ) );
			}

			if ( json.has( "totalresultsavailable" ) ) {
				result.setTotalResultsAvailable( json.getInt( "totalresultsavailable" ) );
			}

			if ( json.has( "totalresultssellers" ) ) {
				result.setTotalResultsSellers( json.getInt( "totalresultssellers" ) );
			}

			if ( json.has( "totalresultsreturned" ) ) {
				result.setTotalResultsReturned( json.getInt( "totalresultsreturned" ) );
			}
		} catch ( final JSONException e ) {
			e.printStackTrace();
		}

		return this;
	}

	private List<Address> parseAddresses( JSONArray addresses ) throws JSONException {
		final List<Address> addressList = new ArrayList<Address>();

		for ( int i = 0, t = addresses.length() ; i < t ; ++i ) {
			final JSONObject jsonAddress = addresses.getJSONObject( i );
			final Address address = new Address();

			address.setCity( jsonAddress.getString( "city" ) );
			address.setComplement( jsonAddress.getString( "complement" ) );
			address.setDistrict( jsonAddress.getString( "district" ) );
			address.setFone( jsonAddress.getString( "fone" ) );
			address.setMap( parseMap( jsonAddress.getJSONObject( "map" ) ) );
			address.setName( jsonAddress.getString( "name" ) );
			address.setPostalArea( jsonAddress.getString( "postalarea" ) );
			address.setPostalCode( jsonAddress.getString( "postalcode" ) );
			address.setState( jsonAddress.getString( "state" ) );

			addressList.add( address );
		}

		return addressList;
	}

	private Category parseCategory( JSONObject c ) throws JSONException {
		final Category category = new Category();

		if ( c.has( "hasoffer" ) ) {
			category.setHasOffer( c.getBoolean( "hasoffer" ) );
		}

		category.setId( c.getInt( "id" ) );
		category.setFinal( c.getBoolean( "isfinal" ) );
		category.setLinks( parseLinks( c.getJSONArray( "links" ) ) );
		category.setName( c.getString( "name" ) );
		category.setParentCategoryId( c.getInt( "parentcategoryid" ) );
		category.setThumbnail( parseThumbnail( c.getJSONObject( "thumbnail" ) ) );

		return category;
	}

	private List<Contact> parseContacts( JSONArray contacts ) throws JSONException {
		final List<Contact> contactList = new ArrayList<Contact>();

		for ( int i = 0, t = contacts.length() ; i < t ; ++i ) {
			final JSONObject jsonContact = contacts.getJSONObject( i );

			final Contact contact = new Contact();
			contact.setLabel( jsonContact.getString( "label" ) );
			contact.setValue( jsonContact.getString( "value" ) );

			contactList.add( contact );
		}

		return contactList;
	}

	private void parseDetails( JSONObject d ) throws JSONException {
		final ResultDetails resultDetails = new ResultDetails();
		resultDetails.setApplicationId( d.getString( "applicationid" ) );
		resultDetails.setApplicationPath( d.getString( "applicationpath" ) );
		resultDetails.setApplicationVersion( d.getString( "applicationversion" ) );
		resultDetails.setCode( d.getInt( "code" ) );
		/*
		 * resultDetails->setDate( mktime( $d->date->hour, $d->date->minute,
		 * $d->date->second, $d->date->month, $d->date->day, $d->date->year ) );
		 */
		resultDetails.setElapsedTime( d.getLong( "elapsedtime" ) );
		resultDetails.setMessage( d.getString( "message" ) );
		resultDetails.setStatus( d.getString( "status" ) );

		result.setDetails( resultDetails );
	}

	private EBitRating parseEBitRating( JSONObject e ) throws JSONException {
		final EBitRating eBitRating = new EBitRating();

		eBitRating.setNumComments( e.getInt( "numcomments" ) );
		eBitRating.setRating( e.getDouble( "rating" ) );

		return eBitRating;
	}

	private Item parseItem( JSONObject i ) throws JSONException {
		final Item item = new Item();
		final JSONArray jsonValueArray = i.getJSONArray( "value" );

		item.setLabel( i.getString( "label" ) );

		for ( int o = 0, t = jsonValueArray.length() ; o < t ; ++o ) {
			final String value = jsonValueArray.getString( o );

			item.addValue( value );
		}

		return item;
	}

	private List<Link> parseLinks( JSONArray links ) throws JSONException {
		final List<Link> linkList = new ArrayList<Link>();

		for ( int i = 0, t = links.length() ; i < t ; ++i ) {
			final Link link = new Link();
			final JSONObject jsonLink = links.getJSONObject( i ).getJSONObject( "link" );

			link.setType( jsonLink.getString( "type" ) );
			link.setUrl( jsonLink.getString( "url" ) );

			linkList.add( link );
		}

		return linkList;
	}

	private Map parseMap( JSONObject m ) throws JSONException {
		final Map map = new Map();

		map.setLatitude( m.getDouble( "latitude" ) );
		map.setLongitude( m.getDouble( "longitude" ) );

		return map;
	}

	private Offer parseOffer( JSONObject o ) throws JSONException {
		final Offer offer = new Offer();

		offer.setCategoryId( o.getInt( "categoryid" ) );
		offer.setId( o.getInt( "id" ) );
		offer.setLinks( parseLinks( o.getJSONArray( "links" ) ) );
		offer.setOfferName( o.getString( "offername" ) );
		offer.setPrice( parsePrice( o.getJSONObject( "price" ) ) );
		offer.setProductId( o.getInt( "productid" ) );
		offer.setSeller( parseSeller( o.getJSONObject( "seller" ) ) );
		offer.setThumbnail( parseThumbnail( o.getJSONObject( "thumbnail" ) ) );

		return offer;
	}

	private OfferParcel parseParcel( JSONObject p ) throws JSONException {
		final OfferParcel parcel = new OfferParcel();

		parcel.setInterest( p.getInt( "interest" ) );
		parcel.setNumber( p.getInt( "number" ) );
		parcel.setValue( p.getDouble( "value" ) );

		return parcel;
	}

	private OfferPrice parsePrice( JSONObject p ) throws JSONException {
		final OfferPrice price = new OfferPrice();

		price.setCurrency( p.getJSONObject( "currency" ).getString( "abbreviation" ) );

		if ( p.has( "parcel" ) ) {
			price.setParcel( parseParcel( p.getJSONObject( "parcel" ) ) );
		}

		price.setValue( p.getDouble( "value" ) );

		return price;
	}

	private Product parseProduct( JSONObject p ) throws JSONException {
		final Product product = new Product();

		product.setCategoryId( p.getInt( "categoryid" ) );
		product.setCurrency( p.getJSONObject( "currency" ).getString( "abbreviation" ) );
		product.setEco( p.getBoolean( "eco" ) );
		product.setFullDescription( p.getBoolean( "fulldescription" ) );
		product.setHasMetaSearch( p.getBoolean( "hasmetasearch" ) );
		product.setId( p.getInt( "id" ) );
		product.setLinks( parseLinks( p.getJSONArray( "links" ) ) );

		if ( p.has( "pricemax" ) ) {
			product.setPriceMax( p.getDouble( "pricemax" ) );
		}

		if ( p.has( "pricemin" ) ) {
			product.setPriceMin( p.getDouble( "pricemin" ) );
		}

		product.setProductName( p.getString( "productname" ) );

		if ( p.has( "productshortname" ) ) {
			product.setProductShortName( p.getString( "productshortname" ) );
		}

		product.setRating( parseRating( p.getJSONObject( "rating" ) ) );

		if ( p.has( "specification" ) ) {
			try {
				product.setSpecification( parseSpecification( p.getJSONObject( "specification" ) ) );

			} catch ( final JSONException e ) {
			}
		}

		product.setThumbnail( parseThumbnail( p.getJSONObject( "thumbnail" ) ) );
		product.setTotalSellers( p.getInt( "totalsellers" ) );

		return product;
	}

	private Rating parseRating( JSONObject r ) throws JSONException {
		final Rating rating = new Rating();

		rating.setUserAverageRating( parseUserAverageRating( r.getJSONObject( "useraveragerating" ) ) );

		if ( r.has( "ebitrating" ) ) {
			rating.seteBitRating( parseEBitRating( r.getJSONObject( "ebitrating" ) ) );
		}

		return rating;
	}

	private Seller parseSeller( JSONObject s ) throws JSONException {
		final Seller seller = new Seller();

		if ( s.has( "addresses" ) ) {
			seller.setAddresses( parseAddresses( s.getJSONArray( "addresses" ) ) );
		}

		seller.setContacts( parseContacts( s.getJSONArray( "contacts" ) ) );
		// seller.setCoupon(coupon)
		seller.setDigitalPayment( s.getBoolean( "pagamentodigital" ) );
		// seller.setExtra( s.->extra );
		seller.setId( s.getInt( "id" ) );
		seller.setTrustedStore( s.getBoolean( "istrustedstore" ) );
		seller.setLinks( parseLinks( s.getJSONArray( "links" ) ) );
		seller.setRating( parseRating( s.getJSONObject( "rating" ) ) );
		seller.setSellerName( s.optString( "sellername" ) );
		seller.setThumbnail( parseThumbnail( s.getJSONObject( "thumbnail" ) ) );

		return seller;
	}

	private Specification parseSpecification( JSONObject s ) throws JSONException {
		final Specification specification = new Specification();
		final JSONArray jsonItemArray = s.getJSONArray( "item" );

		specification.setLinks( parseLinks( s.getJSONArray( "links" ) ) );

		for ( int i = 0, t = jsonItemArray.length() ; i < t ; ++i ) {
			specification.addItem( parseItem( jsonItemArray.getJSONObject( i ).getJSONObject( "item" ) ) );
		}

		return specification;
	}

	private Thumbnail parseThumbnail( JSONObject t ) throws JSONException {
		final Thumbnail thumbnail = new Thumbnail();

		thumbnail.setUrl( t.getString( "url" ) );

		if ( t.has( "height" ) ) {
			thumbnail.setHeight( t.getInt( "height" ) );
		}

		if ( t.has( "width" ) ) {
			thumbnail.setWidth( t.getInt( "width" ) );
		}

		return thumbnail;
	}

	private UserAverageRating parseUserAverageRating( JSONObject u ) throws JSONException {
		final UserAverageRating userAverageRating = new UserAverageRating();

		if ( u.has( "links" ) ) {
			userAverageRating.setLinks( parseLinks( u.getJSONArray( "links" ) ) );
		}

		userAverageRating.setNumComments( u.getInt( "numcomments" ) );
		userAverageRating.setRating( u.getDouble( "rating" ) );

		if ( u.has( "specification" ) ) {
			userAverageRating.setSpecification( parseSpecification( u.getJSONObject( "specification" ) ) );
		}

		return userAverageRating;
	}
}