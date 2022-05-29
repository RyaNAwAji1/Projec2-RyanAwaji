package com.example.demo.Controller;

import com.example.demo.Modele.PurchaseHistory;
import com.example.demo.Service.PurchaseHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
@RequestMapping("Api/v1/PurchaseHistory")
@RequiredArgsConstructor
public class PurchaseHistoryController {

    private final ArrayList<PurchaseHistory> purchaseHistory = new ArrayList<>();

    @Autowired
    private final PurchaseHistoryService purchaseHistoryService;


    @GetMapping(".get")
    public ResponseEntity<ArrayList<PurchaseHistory>> getPurchaseHistory(){
        return ResponseEntity.status(200).body(purchaseHistory);
    }
}
