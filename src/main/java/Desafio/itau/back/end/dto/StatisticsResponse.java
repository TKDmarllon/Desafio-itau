package Desafio.itau.back.end.dto;
import java.util.DoubleSummaryStatistics;

public class StatisticsResponse {
    private long count;
    private double sum;
    private double avg;
    private double mim;
    private double max;

    public StatisticsResponse (DoubleSummaryStatistics stats){
        this.count=stats.getCount();
        this.sum=stats.getSum();
        this.avg=stats.getAverage();
        this.mim=stats.getMin();
        this.max=stats.getMax();
    }

    public long getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public double getMim() {
        return mim;
    }

    public double getMax() {
        return max;
    }
}
