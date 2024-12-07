package com.klu.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Insert Device
        Device device = new Device();
        device.setBrand("Iphone");
        device.setModel("16promax");
        device.setPrice(1000.00);
        session.save(device);

        // Insert Smartphone
        Smartphone smartphone = new Smartphone();
        smartphone.setBrand("Samsung");
        smartphone.setModel("Galaxy S21");
        smartphone.setPrice(799.99);
        smartphone.setOperatingSystem("Android");
        smartphone.setCameraResolution("108 MP");
        session.save(smartphone);

        // Insert Tablet
        Tablet tablet = new Tablet();
        tablet.setBrand("Apple");
        tablet.setModel("iPad Pro");
        tablet.setPrice(999.99);
        tablet.setScreenSize("12.9 inches");
        tablet.setBatteryLife("10 hours");
        session.save(tablet);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully!");
    }
}
