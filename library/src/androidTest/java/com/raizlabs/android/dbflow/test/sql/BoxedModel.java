package com.raizlabs.android.dbflow.test.sql;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.test.TestDatabase;
import com.raizlabs.android.dbflow.test.structure.TestModel1;

/**
 * Description: Test to ensure that non-null and boxed primitive classes work as expected.
 */
@Table(databaseName = TestDatabase.NAME)
public class BoxedModel extends TestModel1 {

    @Column(columnType = Column.PRIMARY_KEY, notNull = true)
    Long id;

    @Column(notNull = true)
    public int sort;

    @Column
    public Integer rblNumber;

    @Column(notNull = true)
    public int area;

    @Column(notNull = true)
    public String station;

    @Column(notNull = true)
    public String stand;
}
