package modules.obligationsRegister.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class ObligationsTest extends AbstractDomainTest<Obligations> {

	@Override
	protected Obligations getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Obligations.MODULE_NAME, Obligations.DOCUMENT_NAME);
	}
}