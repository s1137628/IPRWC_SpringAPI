package com.example.iprwc_springapi.seeder;

import com.example.iprwc_springapi.dao.ProductDAO;
import com.example.iprwc_springapi.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ProductSeeder {

    @Autowired
    private ProductDAO productDAO;

    public void seed(){
        Product product1 = new Product();
        product1.setProductId(UUID.randomUUID());
        product1.setName("Hoodie");
        product1.setImagePath("https://cdna.lystit.com/400/500/tr/photos/fashionid/a39503ee/jack-jones-Dunkelblau-Hoodie-mit-Label-Detail-Modell-BRADLEY.jpeg");
        product1.setPrice(35.0);
        product1.setDescription("Maat 123");
        productDAO.save(product1);

        Product product2 = new Product();
        product2.setProductId(UUID.randomUUID());
        product2.setName("Adidas broek");
        product2.setImagePath("https://cdna.lystit.com/400/500/tr/photos/amazon/d396ad7c/adidas-blackwhite-Volwassen-Essentials-3-stripes-Fleece-Broek.jpeg");
        product2.setPrice(42.0);
        product2.setDescription("Maat 111");
        productDAO.save(product2);

        Product product3 = new Product();
        product3.setProductId(UUID.randomUUID());
        product3.setName("Nike Air Max schoenen");
        product3.setImagePath("https://static.nike.com/a/images/ar_4:5,c_pad,w_400,f_auto/t_product_v1/51406dd2-aecc-4aee-a6c9-6f862be17622/custom-nike-air-max-95-unlocked-by-you.jpg");
        product3.setPrice(73.0);
        product3.setDescription("Maat 40");
        productDAO.save(product3);

        Product product4 = new Product();
        product4.setProductId(UUID.randomUUID());
        product4.setName("Nike Air Max shirt");
        product4.setImagePath("https://cdna.lystit.com/400/500/tr/photos/secretsales/942370b8/nike-Black-Air-Max-Graphic-Print-T-Shirt-Black-Cotton.jpeg");
        product4.setPrice(42.0);
        product4.setDescription("Maat 111");
        productDAO.save(product4);

        Product product5 = new Product();
        product5.setProductId(UUID.randomUUID());
        product5.setName("Dure trui");
        product5.setImagePath("https://cdna.lystit.com/400/500/tr/photos/farfetch/f0f3b355/gucci-grey-Sweat-en-coton-a-logo-GG.jpeg");
        product5.setPrice(120.0);
        product5.setDescription("Maat 130");
        productDAO.save(product5);

        Product product6 = new Product();
        product6.setProductId(UUID.randomUUID());
        product6.setName("Blauwe shirt");
        product6.setImagePath("https://cdna.lystit.com/400/500/tr/photos/farfetch/bd84446f/burberry-blue-Equestrian-Knight-motif-Cotton-T-shirt.jpeg");
        product6.setPrice(19.0);
        product6.setDescription("Maat 109");
        productDAO.save(product6);

        Product product7 = new Product();
        product7.setProductId(UUID.randomUUID());
        product7.setName("Nike broek");
        product7.setImagePath("https://cdna.lystit.com/400/500/tr/photos/amazon/442bfe1a/nike-zwartwit-M-Nk-Wr-Wvn-Lnd-Pant.jpeg");
        product7.setPrice(60.0);
        product7.setDescription("Maat 134");
        productDAO.save(product7);

        Product product8 = new Product();
        product8.setProductId(UUID.randomUUID());
        product8.setName("Puma broek");
        product8.setImagePath("https://cdna.lystit.com/400/500/tr/photos/puma/1b6981de/puma-blue-Essentials-joggingbroek-Met-Logo.jpeg");
        product8.setPrice(29.0);
        product8.setDescription("Maat 111");
        productDAO.save(product8);

        Product product9 = new Product();
        product9.setProductId(UUID.randomUUID());
        product9.setName("Puma trui");
        product9.setImagePath("https://cdna.lystit.com/400/500/tr/photos/puma/e9141c3b/puma-black-Radcal-Sweatshirt-Voor.jpeg");
        product9.setPrice(33.0);
        product9.setDescription("Maat 117");
        productDAO.save(product9);

        Product product10 = new Product();
        product10.setProductId(UUID.randomUUID());
        product10.setName("Adidas schoenen");
        product10.setImagePath("https://cdna.lystit.com/400/500/tr/photos/farfetch/db66418f/adidas-yellow-Samba-OG-White-sneakers.jpeg");
        product10.setPrice(60.0);
        product10.setDescription("Maat 32");
        productDAO.save(product10);


    }
}
