package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	//deposito deveria aumentar o saldo quando eu entrar com um valor positivo de dinheiro
	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		
		/* 
		 * Padrão AAA
		 * -> Arrange - instancie os objetos necessários;
		 * -> Act - execute as ações necessárias;
		 * -> Assert - declare o que deveria acontecer (resultado esperado)
		 * ---------------------------------------------------------------------
		 * -> Assertions - biblioteca de declarações ele possui metodos estaticos
		 */
	
		// - Arrange
		double amount = 200.0;
		double expectedValue = 196.0;
		Account acc = new Account(1L, 0.0);
		
		// - Act
		acc.deposit(amount);
		
		// - Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}

}
