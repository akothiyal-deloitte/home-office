import com.deloitte.ho.application.service.FeeService
import com.deloitte.ho.application.service.FeeServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

class FeeServiceTest extends Specification {

    @Unroll
    def "Test fee amount is #expectedCurrency #expectedAmount when multiplier is #multiplier"(int multiplier,
                                                                       Double expectedAmount,
                                                                       String expectedCurrency) {

        FeeService feeService = new FeeServiceImpl()

        expect:
        def returnedFee = feeService.getFees(multiplier)
        returnedFee.amount == expectedAmount
        returnedFee.currency == expectedCurrency

        where:
        multiplier  |   expectedAmount      |   expectedCurrency
        0           |   0                   |   "GBP"
        1           |   12.32               |   "GBP"
        2           |   24.64               |   "GBP"
    }
}
