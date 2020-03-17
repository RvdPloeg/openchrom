/*******************************************************************************
 * Copyright (c) 2020 Lablicate GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 *******************************************************************************/
package net.openchrom.msd.converter.supplier.pdf.ui.settings;

import java.io.File;

import org.eclipse.chemclipse.chromatogram.xxd.report.settings.DefaultChromatogramReportSettings;
import org.eclipse.chemclipse.support.settings.FileSettingProperty;
import org.eclipse.chemclipse.support.settings.IntSettingsProperty;

import com.fasterxml.jackson.annotation.JsonProperty;

import net.openchrom.msd.converter.supplier.pdf.preferences.PreferenceSupplier;

public class ReportSettingsProfile extends DefaultChromatogramReportSettings {

	@JsonProperty(value = "Report Banner (*.jpg) [1200x164 px, 600 dpi]", defaultValue = PreferenceSupplier.DEF_REPORT_BANNER)
	@FileSettingProperty(onlyDirectory = false, validExtensions = {"*.jpg;*.jpeg", "*.*"}, extensionNames = {"JPEG Files", "All Files"})
	private File reportBanner = null;
	@JsonProperty(value = "Report Slogan", defaultValue = PreferenceSupplier.DEF_REPORT_SLOGAN)
	private String reportSlogan = "";
	@JsonProperty(value = "Report Method", defaultValue = PreferenceSupplier.DEF_REPORT_METHOD)
	private String reportMethod = "";
	@IntSettingsProperty(maxValue = PreferenceSupplier.MAX_NUMBER_LARGEST_PEAKS, minValue = PreferenceSupplier.MIN_NUMBER_LARGEST_PEAKS)
	@JsonProperty(value = "Number Largest Peaks", defaultValue = "" + PreferenceSupplier.DEF_NUMBER_LARGEST_PEAKS)
	private int numberLargestPeaks = -1;
	@JsonProperty(value = "Print all target(s)", defaultValue = "false")
	private boolean printAllTargets = false;

	public File getReportBanner() {

		if(reportBanner == null) {
			String banner = PreferenceSupplier.getReportBanner();
			if(banner != null && !banner.isEmpty()) {
				return new File(banner);
			}
		}
		return reportBanner;
	}

	public String getReportSlogan() {

		if(reportSlogan == null) {
			return PreferenceSupplier.getReportSlogan();
		}
		return reportSlogan;
	}

	public String getReportMethod() {

		if(reportSlogan == null) {
			return PreferenceSupplier.getReportMethod();
		}
		return reportMethod;
	}

	public int getNumberLargestPeaks() {

		if(numberLargestPeaks < 0) {
			return PreferenceSupplier.getNumberLargestPeaks();
		}
		return numberLargestPeaks;
	}

	public boolean isPrintAllTargets() {

		return printAllTargets;
	}

	public void setPrintAllTargets(boolean printAllTargets) {

		this.printAllTargets = printAllTargets;
	}
}