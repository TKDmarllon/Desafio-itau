package Desafio.itau.back.end.service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import Desafio.itau.back.end.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    
    private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>();
        
    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void clearTransactions(){
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistics(){
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
        .filter(t -> t.getDataHora().isAfter(now.minusSeconds(60)))
        .mapToDouble(Transaction::getValor)
        .summaryStatistics();

    }
}
