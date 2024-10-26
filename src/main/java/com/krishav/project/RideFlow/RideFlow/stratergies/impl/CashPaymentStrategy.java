package com.krishav.project.RideFlow.RideFlow.stratergies.impl;

import com.krishav.project.RideFlow.RideFlow.entities.Driver;
import com.krishav.project.RideFlow.RideFlow.entities.Payment;
import com.krishav.project.RideFlow.RideFlow.entities.Wallet;
import com.krishav.project.RideFlow.RideFlow.entities.enums.TransactionMethod;
import com.krishav.project.RideFlow.RideFlow.services.WalletService;
import com.krishav.project.RideFlow.RideFlow.stratergies.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



//Rider -> 100 -  Give to Driver
//Driver -> 70 - 30 rupees will be deducted from wallet

@Service
@RequiredArgsConstructor
public class CODPaymentStrategy implements PaymentStrategy {

    private final WalletService walletService;

    @Override
    public void processPayment(Payment payment) {

        Driver currentDriver = payment.getRide().getDriver();

        double platFormCommission = payment.getAmount() * PLATFORM_COMMISSION;

        walletService.deductMoneyFromWallet(currentDriver.getUser(), platFormCommission, null , payment.getRide(), TransactionMethod.RIDE);

    }
}
