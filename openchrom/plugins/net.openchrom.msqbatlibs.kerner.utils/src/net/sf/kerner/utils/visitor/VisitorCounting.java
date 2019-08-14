/*******************************************************************************
 * Copyright (c) 2015, 2018 Lablicate GmbH.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Dr. Alexander Kerner - initial API and implementation
 *******************************************************************************/
package net.sf.kerner.utils.visitor;

public abstract class VisitorCounting<E> implements Visitor<E> {

	protected int cnt = 0;

	public synchronized int getCount() {

		return cnt;
	}

	public synchronized final Void transform(E element) {

		transform(element, cnt);
		cnt++;
		return null;
	}

	public abstract Void transform(E element, int cnt);
}