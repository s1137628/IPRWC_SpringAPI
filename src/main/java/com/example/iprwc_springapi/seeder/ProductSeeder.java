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
        product1.setName("Adidas shirt");
        product1.setImagePath("https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/be484c62f9b8492cbdd6ad1700b88b33_9366/AEROREADY_Sereno_3-Stripes_T-shirt_Wit_H28900_01_laydown.jpg");
        product1.setPrice(35.0);
        product1.setDescription("Maat 123");
        productDAO.save(product1);

        Product product2 = new Product();
        product2.setProductId(UUID.randomUUID());
        product2.setName("Adidas broek");
        product2.setImagePath("https://www.tennispro.nl/media/catalog/product/cache/8/thumbnail/1200x/9df78eab33525d08d6e5fb8d27136e95/h/m/hm7472_blanc_1.jpg");
        product2.setPrice(42.0);
        product2.setDescription("Maat 111");
        productDAO.save(product2);

        Product product3 = new Product();
        product3.setProductId(UUID.randomUUID());
        product3.setName("Nike Air Max");
        product3.setImagePath("https://static.nike.com/a/images/t_PDP_1280_v1/f_auto,q_auto:eco/bfc04b0f-32d9-48a9-b4b7-7acb7fbcb54b/air-max-90-herenschoenen-bnz7pN.png");
        product3.setPrice(73.0);
        product3.setDescription("Maat 40");
        productDAO.save(product3);

        Product product4 = new Product();
        product4.setProductId(UUID.randomUUID());
        product4.setName("Nike shirt");
        product4.setImagePath("https://thumblr.uniid.it/product/184401/aecb8050271b.jpg");
        product4.setPrice(42.0);
        product4.setDescription("Maat 111");
        productDAO.save(product4);

        Product product5 = new Product();
        product5.setProductId(UUID.randomUUID());
        product5.setName("Adidas joggingsbroek");
        product5.setImagePath("https://thumblr.uniid.it/product/212403/89ce826df3e5.jpg");
        product5.setPrice(47.0);
        product5.setDescription("Maat 130");
        productDAO.save(product5);

        Product product6 = new Product();
        product6.setProductId(UUID.randomUUID());
        product6.setName("Blauwe shirt");
        product6.setImagePath("https://media.s-bol.com/49nKozDxjV80/550x605.jpg");
        product6.setPrice(19.0);
        product6.setDescription("Maat 109");
        productDAO.save(product6);

        Product product7 = new Product();
        product7.setProductId(UUID.randomUUID());
        product7.setName("Nike broek");
        product7.setImagePath("https://thumblr.uniid.it/product/255661/b1353fdaeb3e.jpg");
        product7.setPrice(60.0);
        product7.setDescription("Maat 134");
        productDAO.save(product7);

        Product product8 = new Product();
        product8.setProductId(UUID.randomUUID());
        product8.setName("Puma broek");
        product8.setImagePath("https://thumblr.uniid.it/product/305696/5ed727b581ad.jpg");
        product8.setPrice(29.0);
        product8.setDescription("Maat 111");
        productDAO.save(product8);

        Product product9 = new Product();
        product9.setProductId(UUID.randomUUID());
        product9.setName("Puma hoodie");
        product9.setImagePath("https://thumblr.uniid.it/product/212792/6afb1d9f1b15.jpg");
        product9.setPrice(33.0);
        product9.setDescription("Maat 117");
        productDAO.save(product9);

        Product product10 = new Product();
        product10.setProductId(UUID.randomUUID());
        product10.setName("Adidas schoenen");
        product10.setImagePath("https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/97f86eede1374615a058a81700a27444_9366/Gazelle_Schoenen_Zwart_CQ2809_01_standard.jpg");
        product10.setPrice(60.0);
        product10.setDescription("Maat 32");
        productDAO.save(product10);


    }
}
