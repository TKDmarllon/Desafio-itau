package Desafio.itau.back.end.controller;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Desafio.itau.back.end.dto.StatisticsResponse;
import Desafio.itau.back.end.service.TransactionService;

@RestController
@RequestMapping("estatistica")
public class StaticsController {
    
    private final TransactionService transactionService;

    public StaticsController(TransactionService transactionService){
        this.transactionService=transactionService;
    }

    @GetMapping
    public ResponseEntity<StatisticsResponse> getStatistics(){
        DoubleSummaryStatistics stats= transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsResponse(stats));
    }
}
