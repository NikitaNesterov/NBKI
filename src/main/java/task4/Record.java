package task4;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * Entity for getting all lines from CSV file
 * @author Nikita Nesterov
 */

@Data
@NoArgsConstructor
public class Record {
    @NonNull private Integer key;
    @NonNull private String value;
}
