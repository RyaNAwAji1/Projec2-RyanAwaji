package com.example.demo.Service;

import com.example.demo.Modele.Merchant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class MerchantService {

    private final ArrayList<Merchant> merchant = new ArrayList<>();

    public ArrayList<Merchant> getMerchant() {
        return this.merchant;
    }

    public String addMerchant(Merchant merchant) {
        return "merchant available ";
    }

    public Boolean updateMerchant(Merchant merchant) {
        return true;
    }

    public Boolean deletMerchant(String id) {
    return false;
    }
}
