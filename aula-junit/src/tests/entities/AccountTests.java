package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
	
	//deposito deveria aumentar o saldo quando eu entrar com um valor positivo de dinheiro
	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		
		/* 
		 * Padr�o AAA
		 * -> Arrange - instancie os objetos necess�rios;
		 * -> Act - execute as a��es necess�rias;
		 * -> Assert - declare o que deveria acontecer (resultado esperado)
		 * ---------------------------------------------------------------------
		 * -> Assertions - biblioteca de declara��es ele possui metodos estaticos
		 */
	
		// - Arrange
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = AccountFactory.createEmptyAccount();
		
		// - Act
		acc.deposit(amount);
		
		// - Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	//Segundo Teste - Se o metodo deposit ao receber um valor negativo n�o vai fazer nada.
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		
		double expectedValue = 100.0;
		Account acc = AccountFactory.createAccount(expectedValue);
		double amount = -200.0;
		
		acc.deposit(amount);
		
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}

}
