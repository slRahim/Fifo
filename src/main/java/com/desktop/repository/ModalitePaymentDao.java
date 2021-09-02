package com.desktop.repository;

import com.desktop.entity.ModalitePayement;

import java.util.List;
import java.util.Map;

public interface ModalitePaymentDao {
    ModalitePayement getModalitePayment(ModalitePayement modalitePayement);
    List<ModalitePayement> getAll(String searchInput , Map<String , Object> filter);
    ModalitePayement addModalitePayment(ModalitePayement modalitePayement);
    ModalitePayement editModalitePayement(ModalitePayement modalitePayement);
    int dellModalitePayment(ModalitePayement modalitePayement);

}
