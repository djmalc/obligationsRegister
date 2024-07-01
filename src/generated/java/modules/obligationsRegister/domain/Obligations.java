package modules.obligationsRegister.domain;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.domain.types.Enumeration;
import org.skyve.impl.domain.AbstractPersistentBean;
import org.skyve.metadata.model.document.Bizlet.DomainValue;
import org.skyve.util.Util;

/**
 * Obligation
 * 
 * @depend - - - LikelihoodEnlivened
 * @depend - - - ObligationEnlivened
 * @depend - - - Compliant
 * @depend - - - ResponsibleTeam
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
@Generated(value = "org.skyve.impl.generate.OverridableDomainGenerator")
public class Obligations extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "obligationsRegister";

	/** @hidden */
	public static final String DOCUMENT_NAME = "Obligations";

	/** @hidden */
	public static final String referencePropertyName = "reference";

	/** @hidden */
	public static final String relevantCircumstancePropertyName = "relevantCircumstance";

	/** @hidden */
	public static final String obligationPropertyName = "obligation";

	/** @hidden */
	public static final String likelihoodEnlivenedPropertyName = "likelihoodEnlivened";

	/** @hidden */
	public static final String obligationEnlivenedPropertyName = "obligationEnlivened";

	/** @hidden */
	public static final String compliantPropertyName = "compliant";

	/** @hidden */
	public static final String controlPropertyName = "control";

	/** @hidden */
	public static final String responsibleTeamPropertyName = "responsibleTeam";

	/** @hidden */
	public static final String commentPropertyName = "comment";

	/**
	 * Likelihood Enlivened
	 **/
	@XmlEnum
	@Generated(value = "org.skyve.impl.generate.OverridableDomainGenerator")
	public static enum LikelihoodEnlivened implements Enumeration {
		high("High", "High"),
		low("Low", "Low");

		private String code;
		private String description;

		/** @hidden */
		private DomainValue domainValue;

		/** @hidden */
		private static List<DomainValue> domainValues = Stream.of(values()).map(LikelihoodEnlivened::toDomainValue).collect(Collectors.toUnmodifiableList());

		private LikelihoodEnlivened(String code, String description) {
			this.code = code;
			this.description = description;
			this.domainValue = new DomainValue(code, description);
		}

		@Override
		public String toCode() {
			return code;
		}

		@Override
		public String toLocalisedDescription() {
			return Util.i18n(description);
		}

		@Override
		public DomainValue toDomainValue() {
			return domainValue;
		}

		public static LikelihoodEnlivened fromCode(String code) {
			LikelihoodEnlivened result = null;

			for (LikelihoodEnlivened value : values()) {
				if (value.code.equals(code)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static LikelihoodEnlivened fromLocalisedDescription(String description) {
			LikelihoodEnlivened result = null;

			for (LikelihoodEnlivened value : values()) {
				if (value.toLocalisedDescription().equals(description)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static List<DomainValue> toDomainValues() {
			return domainValues;
		}
	}

	/**
	 * Obligation Enlivened
	 **/
	@XmlEnum
	@Generated(value = "org.skyve.impl.generate.OverridableDomainGenerator")
	public static enum ObligationEnlivened implements Enumeration {
		enlivened("Enlivened", "Enlivened"),
		notEnlivened("Not Enlivened", "Not Enlivened");

		private String code;
		private String description;

		/** @hidden */
		private DomainValue domainValue;

		/** @hidden */
		private static List<DomainValue> domainValues = Stream.of(values()).map(ObligationEnlivened::toDomainValue).collect(Collectors.toUnmodifiableList());

		private ObligationEnlivened(String code, String description) {
			this.code = code;
			this.description = description;
			this.domainValue = new DomainValue(code, description);
		}

		@Override
		public String toCode() {
			return code;
		}

		@Override
		public String toLocalisedDescription() {
			return Util.i18n(description);
		}

		@Override
		public DomainValue toDomainValue() {
			return domainValue;
		}

		public static ObligationEnlivened fromCode(String code) {
			ObligationEnlivened result = null;

			for (ObligationEnlivened value : values()) {
				if (value.code.equals(code)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static ObligationEnlivened fromLocalisedDescription(String description) {
			ObligationEnlivened result = null;

			for (ObligationEnlivened value : values()) {
				if (value.toLocalisedDescription().equals(description)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static List<DomainValue> toDomainValues() {
			return domainValues;
		}
	}

	/**
	 * Compliant
	 **/
	@XmlEnum
	@Generated(value = "org.skyve.impl.generate.OverridableDomainGenerator")
	public static enum Compliant implements Enumeration {
		compliant("Compliant", "Compliant"),
		NA("N/A", "N/A");

		private String code;
		private String description;

		/** @hidden */
		private DomainValue domainValue;

		/** @hidden */
		private static List<DomainValue> domainValues = Stream.of(values()).map(Compliant::toDomainValue).collect(Collectors.toUnmodifiableList());

		private Compliant(String code, String description) {
			this.code = code;
			this.description = description;
			this.domainValue = new DomainValue(code, description);
		}

		@Override
		public String toCode() {
			return code;
		}

		@Override
		public String toLocalisedDescription() {
			return Util.i18n(description);
		}

		@Override
		public DomainValue toDomainValue() {
			return domainValue;
		}

		public static Compliant fromCode(String code) {
			Compliant result = null;

			for (Compliant value : values()) {
				if (value.code.equals(code)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static Compliant fromLocalisedDescription(String description) {
			Compliant result = null;

			for (Compliant value : values()) {
				if (value.toLocalisedDescription().equals(description)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static List<DomainValue> toDomainValues() {
			return domainValues;
		}
	}

	/**
	 * Responsible Team
	 **/
	@XmlEnum
	@Generated(value = "org.skyve.impl.generate.OverridableDomainGenerator")
	public static enum ResponsibleTeam implements Enumeration {
		all("All", "All"),
		dataAnalyticsClaims("Data Analytics / Claims", "Data Analytics / Claims"),
		performance("Performance", "Performance"),
		policy("Policy", "Policy"),
		premiumsFinance("Premiums & Finance", "Premiums & Finance"),
		schemeCompliance("Scheme Compliance", "Scheme Compliance"),
		informationSystems("Information Systems", "Information Systems"),
		policyCommunications("Policy / Communications", "Policy / Communications");

		private String code;
		private String description;

		/** @hidden */
		private DomainValue domainValue;

		/** @hidden */
		private static List<DomainValue> domainValues = Stream.of(values()).map(ResponsibleTeam::toDomainValue).collect(Collectors.toUnmodifiableList());

		private ResponsibleTeam(String code, String description) {
			this.code = code;
			this.description = description;
			this.domainValue = new DomainValue(code, description);
		}

		@Override
		public String toCode() {
			return code;
		}

		@Override
		public String toLocalisedDescription() {
			return Util.i18n(description);
		}

		@Override
		public DomainValue toDomainValue() {
			return domainValue;
		}

		public static ResponsibleTeam fromCode(String code) {
			ResponsibleTeam result = null;

			for (ResponsibleTeam value : values()) {
				if (value.code.equals(code)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static ResponsibleTeam fromLocalisedDescription(String description) {
			ResponsibleTeam result = null;

			for (ResponsibleTeam value : values()) {
				if (value.toLocalisedDescription().equals(description)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static List<DomainValue> toDomainValues() {
			return domainValues;
		}
	}

	/**
	 * Reference
	 **/
	private String reference;

	/**
	 * Relevant Circumstance
	 **/
	private String relevantCircumstance;

	/**
	 * Obligation
	 **/
	private String obligation;

	/**
	 * Likelihood Enlivened
	 **/
	private LikelihoodEnlivened likelihoodEnlivened;

	/**
	 * Obligation Enlivened
	 **/
	private ObligationEnlivened obligationEnlivened;

	/**
	 * Compliant
	 **/
	private Compliant compliant;

	/**
	 * Control
	 **/
	private String control;

	/**
	 * Responsible Team
	 **/
	private ResponsibleTeam responsibleTeam;

	/**
	 * Comment
	 **/
	private String comment;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Obligations.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Obligations.DOCUMENT_NAME;
	}

	public static Obligations newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Obligation - {reference}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Obligations) && 
					this.getBizId().equals(((Obligations) o).getBizId()));
	}

	/**
	 * {@link #reference} accessor.
	 * @return	The value.
	 **/
	public String getReference() {
		return reference;
	}

	/**
	 * {@link #reference} mutator.
	 * @param reference	The new value.
	 **/
	@XmlElement
	public void setReference(String reference) {
		preset(referencePropertyName, reference);
		this.reference = reference;
	}

	/**
	 * {@link #relevantCircumstance} accessor.
	 * @return	The value.
	 **/
	public String getRelevantCircumstance() {
		return relevantCircumstance;
	}

	/**
	 * {@link #relevantCircumstance} mutator.
	 * @param relevantCircumstance	The new value.
	 **/
	@XmlElement
	public void setRelevantCircumstance(String relevantCircumstance) {
		preset(relevantCircumstancePropertyName, relevantCircumstance);
		this.relevantCircumstance = relevantCircumstance;
	}

	/**
	 * {@link #obligation} accessor.
	 * @return	The value.
	 **/
	public String getObligation() {
		return obligation;
	}

	/**
	 * {@link #obligation} mutator.
	 * @param obligation	The new value.
	 **/
	@XmlElement
	public void setObligation(String obligation) {
		preset(obligationPropertyName, obligation);
		this.obligation = obligation;
	}

	/**
	 * {@link #likelihoodEnlivened} accessor.
	 * @return	The value.
	 **/
	public LikelihoodEnlivened getLikelihoodEnlivened() {
		return likelihoodEnlivened;
	}

	/**
	 * {@link #likelihoodEnlivened} mutator.
	 * @param likelihoodEnlivened	The new value.
	 **/
	@XmlElement
	public void setLikelihoodEnlivened(LikelihoodEnlivened likelihoodEnlivened) {
		preset(likelihoodEnlivenedPropertyName, likelihoodEnlivened);
		this.likelihoodEnlivened = likelihoodEnlivened;
	}

	/**
	 * {@link #obligationEnlivened} accessor.
	 * @return	The value.
	 **/
	public ObligationEnlivened getObligationEnlivened() {
		return obligationEnlivened;
	}

	/**
	 * {@link #obligationEnlivened} mutator.
	 * @param obligationEnlivened	The new value.
	 **/
	@XmlElement
	public void setObligationEnlivened(ObligationEnlivened obligationEnlivened) {
		preset(obligationEnlivenedPropertyName, obligationEnlivened);
		this.obligationEnlivened = obligationEnlivened;
	}

	/**
	 * {@link #compliant} accessor.
	 * @return	The value.
	 **/
	public Compliant getCompliant() {
		return compliant;
	}

	/**
	 * {@link #compliant} mutator.
	 * @param compliant	The new value.
	 **/
	@XmlElement
	public void setCompliant(Compliant compliant) {
		preset(compliantPropertyName, compliant);
		this.compliant = compliant;
	}

	/**
	 * {@link #control} accessor.
	 * @return	The value.
	 **/
	public String getControl() {
		return control;
	}

	/**
	 * {@link #control} mutator.
	 * @param control	The new value.
	 **/
	@XmlElement
	public void setControl(String control) {
		preset(controlPropertyName, control);
		this.control = control;
	}

	/**
	 * {@link #responsibleTeam} accessor.
	 * @return	The value.
	 **/
	public ResponsibleTeam getResponsibleTeam() {
		return responsibleTeam;
	}

	/**
	 * {@link #responsibleTeam} mutator.
	 * @param responsibleTeam	The new value.
	 **/
	@XmlElement
	public void setResponsibleTeam(ResponsibleTeam responsibleTeam) {
		preset(responsibleTeamPropertyName, responsibleTeam);
		this.responsibleTeam = responsibleTeam;
	}

	/**
	 * {@link #comment} accessor.
	 * @return	The value.
	 **/
	public String getComment() {
		return comment;
	}

	/**
	 * {@link #comment} mutator.
	 * @param comment	The new value.
	 **/
	@XmlElement
	public void setComment(String comment) {
		preset(commentPropertyName, comment);
		this.comment = comment;
	}
}
