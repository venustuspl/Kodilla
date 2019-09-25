package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product(1, "Mleko");

        Product product2 = new Product(2, "Masło");

        Product product3 = new Product(3, "Chleb");

        Item item1 = new Item(1, new BigDecimal("20"), 20, new BigDecimal("400"));

        item1.getProducts().add(product1);

        item1.getProducts().add(product2);

        Item item2 = new Item(2, new BigDecimal("30"), 20, new BigDecimal("600"));

        item2.getProducts().add(product3);

        Invoice invoice = new Invoice(1, "123");

        //Then
        productDao.save(product1);
        int product1Id = product1.getId();


        productDao.save(product2);
        int product2Id = product2.getId();


        productDao.save(product3);
        int product3Id = product3.getId();

        itemDao.save(item1);
        int item1Id = item1.getId();

        itemDao.save(item2);
        int item2Id = item2.getId();

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then
        Assert.assertNotEquals(0, product1Id);
        Assert.assertNotEquals(0, product2Id);
        Assert.assertNotEquals(0, product3Id);
        Assert.assertNotEquals(0, item1Id);
        Assert.assertNotEquals(0, item2Id);
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            productDao.deleteAll();
            itemDao.deleteAll();
            invoiceDao.deleteAll();
        } catch (Exception e) {
            System.out.println("Wystąpił błąd czyszczenia tabel.");
        }

    }


}
