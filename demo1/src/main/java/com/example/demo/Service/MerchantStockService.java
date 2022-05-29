package com.example.demo.Service;

import com.example.demo.Modele.MerchantStock;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MerchantStockService {

    private final ArrayList<MerchantStock> merchantStock = new ArrayList<>();

    public ArrayList<MerchantStock> getMerchantStock() {
        return this.merchantStock;
    }

    public Boolean addMerchantStock(MerchantStock merchantStock) {
        return true;
    }

    public Boolean updatMerchantStock(MerchantStock merchantStock) {
        return false;
    }

    public boolean deletaddMerchantStock(String id) {
        return false;    }
}
