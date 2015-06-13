/**
 * 
 */
package com.stock;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.stock.base.Profiles;

/**
 * @author think
 *
 */
@ActiveProfiles(Profiles.PRODUCTION)
public abstract class SpringTestCase extends AbstractJUnit4SpringContextTests{

}
