import com.deloitte.ho.application.controller.FeeController
import com.deloitte.ho.application.model.Fee
import com.deloitte.ho.application.service.FeeService
import spock.lang.Specification

class FeeControllerTest extends Specification {

    def "Test controller returns fee service response"() {

        FeeService mockFeeService = Mock()
        FeeController feeController = new FeeController(mockFeeService)

        when:
        def returnedFee = feeController.fees

        then:
        1 * mockFeeService.getFees(_) >> new Fee(12.40, "EUR")

        returnedFee.amount == (Double) 12.40
        returnedFee.currency == "EUR"
    }
}