/*******************************************************************************
 * Copyright (c) 2017, 2022 Lablicate GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *
 * Dr. Philip Wenig - initial API and implementation
 *******************************************************************************/
package net.openchrom.xxd.processor.supplier.tracecompare.model.v1000;

import java.util.HashMap;
import java.util.Map;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;

import net.openchrom.xxd.processor.supplier.tracecompare.model.IReferenceModel;

public class ReferenceModel_v1000 implements IReferenceModel {

	@XmlElement(name = "ReferenceGroup")
	private String referenceGroup = "";
	@XmlElement(name = "ReferencePath")
	private String referencePath = "";
	@XmlElement(name = "SampleModels", type = SampleModel_v1000.class)
	private Map<String, SampleModel_v1000> sampleModels = new HashMap<String, SampleModel_v1000>();

	@Override
	@XmlTransient
	public String getReferenceGroup() {

		return referenceGroup;
	}

	@Override
	public void setReferenceGroup(String referenceGroup) {

		this.referenceGroup = referenceGroup;
	}

	@Override
	@XmlTransient
	public String getReferencePath() {

		return referencePath;
	}

	@Override
	public void setReferencePath(String referencePath) {

		this.referencePath = referencePath;
	}

	@Override
	@XmlTransient
	public Map<String, SampleModel_v1000> getSampleModels() {

		return sampleModels;
	}

	@Override
	public void setSampleModels(Map<String, SampleModel_v1000> sampleModels) {

		this.sampleModels = sampleModels;
	}

	@Override
	public String toString() {

		return "ReferenceModel_v1000 [referenceGroup=" + referenceGroup + ", referencePath=" + referencePath + ", sampleModels=" + sampleModels + "]";
	}
}
