/*******************************************************************************
 * Copyright (c) 2019 Lablicate GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Dr. Philip Wenig - initial API and implementation
 *******************************************************************************/
package net.openchrom.xxd.process.supplier.templates.comparator;

import java.util.Comparator;

import net.openchrom.xxd.process.supplier.templates.model.IntegratorSetting;

public class IntegratorComparator implements Comparator<IntegratorSetting> {

	@Override
	public int compare(IntegratorSetting setting1, IntegratorSetting setting2) {

		return setting1.getIdentifier().compareTo(setting2.getIdentifier());
	}
}
