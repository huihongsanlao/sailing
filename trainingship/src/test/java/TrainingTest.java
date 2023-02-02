import com.supply.TrainingEnum;
import com.training.TrainingApplication;
import com.training.factory.ModelFactroy;
import com.training.service.TrainingHandler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {TrainingApplication.class})
public class TrainingTest {

    @Test
    public void training(){
        TrainingHandler handler = ModelFactroy.getInvokeStrategy(TrainingEnum.WORMHOLE.getCode());
//        handler.coldWeapon();
        handler.thermalWeapon();
    }
}
