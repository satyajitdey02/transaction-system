package com.cefalo.school;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by satyajit on 4/24/18.
 */
public class TransactionTests {

  private TransactionManager transactionManager = new TransactionManager();

  @Test
  public void testAllTransactionAllTransactionsSuccessful() {
    assertEquals(1, 0);
  }

  @Test
  public void testWithDrawRequestForAmountGreaterThanAvailableBalanceTransactionExecutedWhenBalanceConstrainMet() {
    assertEquals(1, 0);
  }

  @Test
  public void testTransferRequestForAmountGreaterThanAvailableBalanceTransactionExecutedWhenBalanceConstrainMet() {
    assertEquals(1, 0);
  }

  @Test
  public void testTransferThenRollbackAccountStatusRegainedisInitialState() {
    assertEquals(1, 0);
  }
}
