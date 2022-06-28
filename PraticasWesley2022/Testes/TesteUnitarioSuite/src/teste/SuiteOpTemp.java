package Testes.TesteUnitarioSuite.src.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ OperacoesTeste.class, TemperaturaTeste.class })
public class SuiteOpTemp {

}
