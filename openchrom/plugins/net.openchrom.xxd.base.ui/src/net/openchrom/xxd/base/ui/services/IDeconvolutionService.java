/*******************************************************************************
 * Copyright (c) 2023 Lablicate GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Wenig - initial API and implementation
 *******************************************************************************/
package net.openchrom.xxd.base.ui.services;

import java.util.List;

import org.eclipse.chemclipse.model.core.IChromatogram;
import org.eclipse.chemclipse.model.core.IPeak;
import org.eclipse.chemclipse.model.types.DataType;
import org.eclipse.chemclipse.processing.core.IProcessingInfo;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IWorkbenchPreferencePage;

import net.openchrom.xxd.base.model.PeakRegionParameter;

public interface IDeconvolutionService {

	String getName();

	String getDescription();

	String getVersion();

	DataType getDataType();

	IProcessingInfo<List<? extends IPeak>> calculate(IChromatogram<?> chromatogram, PeakRegionParameter peakRegionParameter, IProgressMonitor monitor);

	Class<? extends IWorkbenchPreferencePage> getPreferencePage();
}