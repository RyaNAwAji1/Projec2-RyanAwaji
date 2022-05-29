package com.example.demo.Service;

import com.example.demo.Modele.PurchaseHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class PurchaseHistoryService {
    private final ArrayList<PurchaseHistory> purchaseHistory = new ArrayList<>();

    public ArrayList<PurchaseHistory> getPurchaseHistory() {
        return this.purchaseHistory;
    }
}
