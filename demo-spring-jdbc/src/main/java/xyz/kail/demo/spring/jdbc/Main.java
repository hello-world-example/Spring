package xyz.kail.demo.spring.jdbc;


import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @see org.springframework.transaction.support.TransactionSynchronizationManager
 * #
 * @see org.springframework.jdbc.datasource.DataSourceTransactionManager
 * @see org.springframework.jdbc.datasource.DataSourceUtils#getConnection
 * #
 * @see org.springframework.transaction.support.AbstractPlatformTransactionManager#setTransactionSynchronization
 * @see org.springframework.transaction.support.TransactionSynchronization
 */
public class Main {

    public static void main(String[] args) throws SQLException {

        TransactionSynchronizationManager.hasResource(123);

        final Connection connection = DataSourceUtils.getConnection(null);

        connection.setAutoCommit(false);

    }

}
