import java.time.LocalDateTime;

public class Horaire {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Horaire(LocalDateTime startDate, LocalDateTime endDate){
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
}