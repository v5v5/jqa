package vi.tests

import org.codehaus.groovy.runtime.StackTraceUtils
import spock.lang.Specification

class ScratchTest extends Specification{
    def getCurrentMethodName(){
        def marker = new Throwable()
        return StackTraceUtils.sanitize(marker).stackTrace[1].methodName
    }

    def "test"() {
        "Запустить браузер"()
        "Открыть страницу"()
        "Нажать на кнопку"()
        expect: 1 + 1 == 2
    }

    def "Запустить браузер"() {
        println(getCurrentMethodName())
    }

    def "Открыть страницу"() {
        println(getCurrentMethodName())
    }

    def "Нажать на кнопку"() {
        println(getCurrentMethodName())
    }
}
