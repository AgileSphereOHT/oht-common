package uk.doh.oht.validation;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by peterwhitehead on 19/05/2017.
 */
public class FormDateTest {
    private FormDate formDate;

    private LocalDate localDate;

    @Before
    public void setUp() throws Exception {
        localDate = LocalDate.now();
        formDate = new FormDate(""+localDate.getDayOfMonth(), ""+localDate.getMonthValue(), ""+localDate.getYear());
    }

    @Test
    public void testGetDate() throws Exception {
        Date date = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        assertThat(formDate.getDate(), is(date));
    }
}