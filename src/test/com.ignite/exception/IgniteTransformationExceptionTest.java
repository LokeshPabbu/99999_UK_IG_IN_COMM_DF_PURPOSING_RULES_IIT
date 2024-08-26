package com.ignite.exception;

import org.junit.Assert;
import org.junit.Test;


import static com.ignite.constants.Constants.INVALID_JOB_NAME_ERROR;

//@RunWith(PowerMockRunner.class)
//@PowerMockIgnore({"javax.net.ssl.*", "javax.security.*"})
public class IgniteTransformationExceptionTest extends Throwable {




    @Test(expected = IgniteTransformationException.class)
    public void testIgniteTransformationException() throws Exception {
        IgniteTransformationException exception;
        exception = new IgniteTransformationException("Failed", INVALID_JOB_NAME_ERROR, new Exception());
        exception = new IgniteTransformationException("Failed",new Exception().getCause(), INVALID_JOB_NAME_ERROR);
        exception = new IgniteTransformationException("Failed", INVALID_JOB_NAME_ERROR);
        exception = new IgniteTransformationException(new Exception().getCause(), INVALID_JOB_NAME_ERROR);
        Assert.assertEquals(INVALID_JOB_NAME_ERROR, exception.getCode());
        throw exception;
    }

}
