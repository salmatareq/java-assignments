package interfaces;

import java.time.LocalDateTime;

public interface ISchedulable {


    public void schedule(String message, LocalDateTime datetime);
}
